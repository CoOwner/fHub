package com.fragmc.hub.scoreboard;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.fragmc.hub.Hub;

import me.signatured.ezqueueshared.QueueInfo;

public class Translator {

	private static int playerCount;

	public static String translate(Player p, String text) {
		text = ChatColor.translateAlternateColorCodes('&', text);

		if (text.contains("%online%")) {
			text = text.replace("%online%", String.valueOf(getPlayerCount()));
		}
		if (text.contains("%queue%")) {
			text = text.replace("%queue%",
					getPosition(p.getName()) + "/" + QueueInfo.getQueueInfo(QueueInfo.getQueue(p.getName())).getSize());
		}
		return text;
	}

	public static int getPosition(String name) {
		Player player = Bukkit.getPlayer(name);

		if (player == null)
			return -1;

		return QueueInfo.getPosition(player.getName());
	}

	public static int getPlayerCount() {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(Hub.getInstance().getConfig().getString("server.bungee-ip"), Hub.getInstance().getConfig().getInt("server.bungee-port")), 1 * 1000);
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			DataInputStream in = new DataInputStream(socket.getInputStream());

			out.write(0xFE);

			StringBuilder str = new StringBuilder();

			int b;
			while ((b = in.read()) != -1) {
				if (b != 0 && b > 16 && b != 255 && b != 23 && b != 24) {
					str.append((char) b);
				}
			}

			String[] data = str.toString().split("§");
			int onlinePlayers = Integer.valueOf(data[1]);

			playerCount = onlinePlayers;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return playerCount;
	}

}
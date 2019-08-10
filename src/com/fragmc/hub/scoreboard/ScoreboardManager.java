package com.fragmc.hub.scoreboard;

import java.util.List;

import org.bukkit.entity.Player;

import com.fragmc.hub.Hub;

import me.signatured.ezqueueshared.QueueInfo;

public class ScoreboardManager {
	Hub plugin;

	public ScoreboardManager(Hub plugin) {
		this.plugin = plugin;
	}

	private String title;
	private List<String> slots;
	private List<String> slots_queue;

	public void defaultBoard(Player p) {
		title = this.plugin.getConfig().getString("scoreboard.title");
		slots = this.plugin.getConfig().getStringList("scoreboard.slots");

		ScoreHelper sb = new ScoreHelper(p);
		sb.setTitle(title);
		sb.setSlotsFromList(slots);
	}

	public void updateBoard(Player p) {
		slots_queue = this.plugin.getConfig().getStringList("scoreboard.slots-with-queue");
		ScoreHelper sb = ScoreHelper.getByPlayer(p);
		if (QueueInfo.getQueue(p.getName()) != null) {
			sb.setTitle(title);
			sb.setSlotsFromList(slots_queue);
			return;
		}
		sb.setTitle(title);
		sb.setSlotsFromList(slots);

	}

}

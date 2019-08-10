package com.fragmc.hub.events.utils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class DataFetcher {

	private static int sg;
	private static int sg1;
	private static int sg2;
	private static int sg3;
	private static int sg4;
	private static int sg5;
	private static int raids;
	private static int raids1;
	private static int raids2;
	private static int raids3;
	private static int raids4;
	private static int raids5;
	private static int ffa;
	private static int ffa1;
	private static int ffa2;
	private static int practice;
	private static int kitmap;
	private static int hcf1;
	private static int hcf2;

	public static int getPlayerCountSg1() {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 50002), 1 * 1000);
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

			sg1 = onlinePlayers;
		} catch (Exception e) {
			sg1 = 0;
		}

		return sg1;
	}

	public static int getPlayerCountSg2() {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 50003), 1 * 1000);
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

			sg2 = onlinePlayers;
		} catch (Exception e) {
			sg2 = 0;
		}

		return sg2;
	}

	public static int getPlayerCountSg3() {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 50004), 1 * 1000);
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

			sg3 = onlinePlayers;
		} catch (Exception e) {
			sg3 = 0;
		}

		return sg3;
	}

	public static int getPlayerCountSg4() {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 50005), 1 * 1000);
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

			sg4 = onlinePlayers;
		} catch (Exception e) {
			sg4 = 0;
		}

		return sg4;
	}

	public static int getPlayerCountSg5() {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 50006), 1 * 1000);
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

			sg5 = onlinePlayers;
		} catch (Exception e) {
			sg5 = 0;
		}

		return sg5;
	}

	public static int getPlayerCountSg() {
		sg = (DataFetcher.getPlayerCountSg1() + DataFetcher.getPlayerCountSg2() + DataFetcher.getPlayerCountSg3()
				+ DataFetcher.getPlayerCountSg4() + DataFetcher.getPlayerCountSg5());
		return sg;
	}

	public static int getPlayerRaids1() {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 60002), 1 * 1000);
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

			raids1 = onlinePlayers;
		} catch (Exception e) {
			raids1 = 0;
		}

		return raids1;
	}

	public static int getPlayerRaids2() {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 60003), 1 * 1000);
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

			raids2 = onlinePlayers;
		} catch (Exception e) {
			raids2 = 0;
		}

		return raids2;
	}

	public static int getPlayerRaids3() {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 60004), 1 * 1000);
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

			raids3 = onlinePlayers;
		} catch (Exception e) {
			raids3 = 0;
		}

		return raids3;
	}

	public static int getPlayerRaids4() {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 60005), 1 * 1000);
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

			raids4 = onlinePlayers;
		} catch (Exception e) {
			raids4 = 0;
		}

		return raids4;
	}

	public static int getPlayerRaids5() {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 60006), 1 * 1000);
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

			raids5 = onlinePlayers;
		} catch (Exception e) {
			raids5 = 0;
		}

		return raids5;
	}

	public static int getPlayerCountRaids() {
		raids = (DataFetcher.getPlayerRaids1() + DataFetcher.getPlayerRaids2() + DataFetcher.getPlayerRaids3()
				+ DataFetcher.getPlayerRaids4() + DataFetcher.getPlayerRaids5());
		return raids;
	}

	public static int getPlayerCountPractice() {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 25569), 1 * 1000);
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

			practice = onlinePlayers;
		} catch (Exception e) {
			practice = 0;
		}

		return practice;
	}

	public static int getPlayerCountKitMap() {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 20001), 1 * 1000);
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

			kitmap = onlinePlayers;
		} catch (Exception e) {
			kitmap = 0;
		}

		return kitmap;
	}

	public static int getPlayerCountFFA1() {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 15556), 1 * 1000);
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

			ffa1 = onlinePlayers;
		} catch (Exception e) {
			ffa1 = 0;
		}

		return ffa1;
	}

	public static int getPlayerCountFFA2() {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 15555), 1 * 1000);
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

			ffa2 = onlinePlayers;
		} catch (Exception e) {
			ffa2 = 0;
		}

		return ffa2;
	}

	public static int getPlayerCountFFA() {
		ffa = (DataFetcher.getPlayerCountFFA1() + DataFetcher.getPlayerCountFFA2());
		return ffa;
	}

	public static int getPlayerCountHCF1() {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 20003), 1 * 1000);
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

			hcf1 = onlinePlayers;
		} catch (Exception e) {
			hcf1 = 0;
		}

		return hcf1;
	}

	public static int getPlayerCountHCF2() {
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("localhost", 20004), 1 * 1000);
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

			hcf2 = onlinePlayers;
		} catch (Exception e) {
			hcf2 = 0;
		}

		return hcf2;
	}
}

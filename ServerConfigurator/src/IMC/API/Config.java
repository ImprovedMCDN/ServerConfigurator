package IMC.API;

import org.bukkit.Bukkit;

import IMC.Main.MainClass;

@SuppressWarnings("static-access")
public class Config {

	private static MainClass main;

	public void registerClass(MainClass main) {
		this.main = main;
	}

	private static String defaultPermission = main.defaultPermission;
	private static String cP = main.consolenPrefix;
	private static String mP = "§3[" + main.messagePrefix + "]§6 ";

	public static String getCP() {
		return cP;
	}

	public static String getMP() {
		return mP;
	}

	public static String getDefaultPermission() {
		return defaultPermission;
	}

	public static void sendError(String s) {
		Bukkit.getServer().getConsoleSender()
				.sendMessage("§4[" + Config.getCP() + "]" + " " + s);
	}

	public static void sendInfo(String s) {
		Bukkit.getServer().getConsoleSender()
				.sendMessage("§e[" + Config.getCP() + "]" + " " + s);
	}

	public static void sendLoad(String s) {
		Bukkit.getServer()
				.getConsoleSender()
				.sendMessage(
						"§a[" + Config.getCP() + "]" + "     " + s
								+ " - Loaded");
	}

	public static void sendSave(String s) {
		Bukkit.getServer()
				.getConsoleSender()
				.sendMessage(
						"§b[" + Config.getCP() + "]" + "     " + s + " - Saved");
	}

	public static void sendWarning(String s) {
		Bukkit.getServer().getConsoleSender()
				.sendMessage("§d[" + Config.getCP() + "]" + " " + s);
	}

	public static void useCommandFromConsole(String s) {
		Bukkit.getServer().dispatchCommand(
				Bukkit.getServer().getConsoleSender(), s);
	}

}

package IMC.API;

import org.bukkit.entity.Player;

public class BPlayer {

	private Player p;

	public BPlayer(Player p) {
		this.p = p;
	}

	public BPlayerOptions getOptions() {
		return new BPlayerOptions(this);
	}

	public void noPermissions() {
		this.send("§c>>> §4You have no sufficient Permissions §c<<<");
	}

	public void send(String s) {
		this.getPlayer().sendMessage(Config.getMP() + s);
	}
	
	public Player getPlayer(){
		return p;
	}

}

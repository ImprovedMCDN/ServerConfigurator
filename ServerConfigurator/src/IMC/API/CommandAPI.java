package IMC.API;

import java.util.ArrayList;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandAPI implements Listener {

	private ArrayList<BCommand> cmd = new ArrayList<BCommand>();
	private ArrayList<BCommands> classes = new ArrayList<BCommands>();

	public void prepareCommands() {
		this.cmd.clear();
		this.classes.clear();
		Config.sendLoad("Clear Command List!");
	}

	public ArrayList<BCommand> getCommands() {
		return cmd;
	}

	public void registerCommand(BCommand cmd, BCommands CommandClass) {
		this.cmd.add(cmd);
		this.classes.add(CommandClass);
		Config.sendLoad("Command: \"" + cmd.getCommand()
				+ "\" - Permission: \"" + cmd.getPermission() + "\"");
	}

	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent e) {
		String msg = e.getMessage();
		String[] args = msg.split(" ");
		String cmdName = args[0];

		BPlayer p = new BPlayer(e.getPlayer());

		for (int i = 0; i < this.cmd.size(); i++) {
			BCommand cmd = this.cmd.get(i);
			if (cmdName.equalsIgnoreCase(cmd.getCommand())) {
				BCommands c = this.classes.get(i);
				if (p.getPlayer().hasPermission(cmd.getPermission())) {
					c.executePermissions(cmd, p, args);
					e.setMessage(" ");
					e.setCancelled(true);
				} else {
					c.executeNoPermissions(cmd, p, args);
					e.setMessage(" ");
					e.setCancelled(true);
				}
			}
		}

	}

}

package IMC.API;

public class BCommand {

	private String command;
	private String permission;
	private String usage;

	public BCommand(String command, String permission, String usage) {
		this.command = command;
		this.permission = permission;
		this.usage = usage;
	}

	public BCommand(String command, String usage) {
		this.command = command;
		this.permission = Config.getDefaultPermission();
		this.usage = usage;
	}

	public String getCommand() {
		return command;
	}

	public String getPermission() {
		return permission;
	}

	public String getUsage() {
		return usage;
	}

}

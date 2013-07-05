package IMC.API;

import IMC.Main.MainClass;

public abstract class BCommands {

	public abstract void registerClass(MainClass main);

	public abstract void executePermissions(BCommand cmd, BPlayer p,
			String[] args);

	public abstract void executeNoPermissions(BCommand cmd, BPlayer p,
			String[] args);
}

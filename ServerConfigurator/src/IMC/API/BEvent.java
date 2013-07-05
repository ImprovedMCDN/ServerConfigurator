package IMC.API;

import org.bukkit.event.Listener;

import IMC.Main.MainClass;

public abstract class BEvent implements Listener {

	public abstract void registerClass(MainClass main);
}

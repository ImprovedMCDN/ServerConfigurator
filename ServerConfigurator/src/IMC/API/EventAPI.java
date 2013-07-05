package IMC.API;

import java.util.ArrayList;

import org.bukkit.event.Listener;

import IMC.Main.MainClass;

public class EventAPI {

	private MainClass main;
	private ArrayList<Listener> classes = new ArrayList<Listener>();

	public void registerClass(MainClass main) {
		this.main = main;
	}

	public void prepareEvents() {
		this.classes.clear();
		Config.sendLoad("Clear Event List!");
	}

	public ArrayList<Listener> getEventClasses() {
		return classes;
	}

	public void registerEvent(Listener e) {
		this.classes.add(e);
	}

	public void registerAllEvents(ArrayList<Listener> e) {
		for (int i = 0; i < e.size(); i++) {

			main.getPM().registerEvents(e.get(i), main);

		}

	}

}

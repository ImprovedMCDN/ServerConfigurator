package IMC.API;

import org.bukkit.plugin.java.JavaPlugin;

public abstract class BJavaPlugin extends JavaPlugin {

	public BPluginManager getPM() {
		return new BPluginManager(this.getServer().getPluginManager());
	}

}

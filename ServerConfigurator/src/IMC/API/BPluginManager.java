package IMC.API;

import java.io.File;
import java.util.Set;

import org.bukkit.event.Event;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.permissions.Permissible;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.EventExecutor;
import org.bukkit.plugin.InvalidDescriptionException;
import org.bukkit.plugin.InvalidPluginException;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.UnknownDependencyException;

public class BPluginManager implements PluginManager {

	private PluginManager pm;

	public BPluginManager(PluginManager pm) {
		this.pm = pm;
	}

	public void addPermission(Permission arg0) {
		pm.addPermission(arg0);
	}

	public void callEvent(Event arg0) throws IllegalStateException {
		pm.callEvent(arg0);
	}

	public void clearPlugins() {
		pm.clearPlugins();
	}

	public void disablePlugin(Plugin arg0) {
		pm.disablePlugin(arg0);
	}

	public void disablePlugins() {
		pm.disablePlugins();
	}

	public void enablePlugin(Plugin arg0) {
		pm.enablePlugin(arg0);
	}

	public Set<Permissible> getDefaultPermSubscriptions(boolean arg0) {
		return pm.getDefaultPermSubscriptions(arg0);
	}

	public Set<Permission> getDefaultPermissions(boolean arg0) {
		return pm.getDefaultPermissions(arg0);
	}

	public Permission getPermission(String arg0) {
		return pm.getPermission(arg0);
	}

	public Set<Permissible> getPermissionSubscriptions(String arg0) {
		return getPermissionSubscriptions(arg0);
	}

	public Set<Permission> getPermissions() {
		return pm.getPermissions();
	}

	public Plugin getPlugin(String arg0) {
		return pm.getPlugin(arg0);
	}

	public Plugin[] getPlugins() {
		return pm.getPlugins();
	}

	public boolean isPluginEnabled(String arg0) {
		return pm.isPluginEnabled(arg0);
	}

	public boolean isPluginEnabled(Plugin arg0) {
		return pm.isPluginEnabled(arg0);
	}

	public Plugin loadPlugin(File arg0) throws InvalidPluginException,
			InvalidDescriptionException, UnknownDependencyException {
		return pm.loadPlugin(arg0);
	}

	public Plugin[] loadPlugins(File arg0) {
		return pm.loadPlugins(arg0);
	}

	public void recalculatePermissionDefaults(Permission arg0) {
		pm.recalculatePermissionDefaults(arg0);
	}

	public void registerEvent(Class<? extends Event> arg0, Listener arg1,
			EventPriority arg2, EventExecutor arg3, Plugin arg4) {
		pm.registerEvent(arg0, arg1, arg2, arg3, arg4);
	}

	public void registerEvent(Class<? extends Event> arg0, Listener arg1,
			EventPriority arg2, EventExecutor arg3, Plugin arg4, boolean arg5) {
		pm.registerEvent(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public void registerEvents(Listener arg0, Plugin arg1) {
		Config.sendLoad(arg0.getClass().getName());
		pm.registerEvents(arg0, arg1);
	}

	public void registerInterface(Class<? extends PluginLoader> arg0)
			throws IllegalArgumentException {
		pm.registerInterface(arg0);
	}

	public void removePermission(Permission arg0) {
		pm.removePermission(arg0);
	}

	public void removePermission(String arg0) {
		pm.removePermission(arg0);
	}

	public void subscribeToDefaultPerms(boolean arg0, Permissible arg1) {
		pm.subscribeToDefaultPerms(arg0, arg1);
	}

	public void subscribeToPermission(String arg0, Permissible arg1) {
		pm.subscribeToPermission(arg0, arg1);
	}

	public void unsubscribeFromDefaultPerms(boolean arg0, Permissible arg1) {
		pm.unsubscribeFromDefaultPerms(arg0, arg1);
	}

	public void unsubscribeFromPermission(String arg0, Permissible arg1) {
		pm.unsubscribeFromPermission(arg0, arg1);
	}

	public boolean useTimings() {
		return pm.useTimings();
	}

}

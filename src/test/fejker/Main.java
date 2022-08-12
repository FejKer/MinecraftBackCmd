package test.fejker;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import test.fejker.Commands;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        PluginManager manager = getServer().getPluginManager();
        manager.registerEvents(new Commands(), this);
        System.out.println();
        System.out.println("COMMANDS LOADING :D");
        System.out.println();
    }

    @Override
    public void onDisable() {

    }
}

package me.revu.bedclutch;

import org.bukkit.plugin.java.JavaPlugin;
public final class Bedclutch extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("BedClutch 1.0 has been enabled");
        this.getCommand("hit").setExecutor(new BedClutchHandler());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

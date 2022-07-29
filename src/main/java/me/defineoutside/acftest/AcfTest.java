package me.defineoutside.acftest;

import co.aikar.commands.PaperCommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class AcfTest extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        PaperCommandManager commandManager = new PaperCommandManager(this);

        commandManager.enableUnstableAPI("brigadier");

        commandManager.registerCommand(new ExampleCommand());
        commandManager.registerCommand(new NoArgsExample());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

package me.defineoutside.acftest;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.command.CommandSender;

@CommandAlias("test2")
public class ExampleCommand extends BaseCommand {
    @Subcommand("b")
    public void onDebug(CommandSender sender, int a) {
        sender.sendMessage("Received arg " + a);
    }
}

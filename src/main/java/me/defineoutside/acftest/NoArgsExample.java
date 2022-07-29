package me.defineoutside.acftest;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.command.CommandSender;

@CommandAlias("test")
public class NoArgsExample extends BaseCommand {
    @Subcommand("a")
    public void onDebug(CommandSender sender) {
        sender.sendMessage("Received no arg");
    }
}

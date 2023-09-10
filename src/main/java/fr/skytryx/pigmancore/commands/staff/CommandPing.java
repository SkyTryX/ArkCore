package fr.skytryx.pigmancore.commands.staff;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.net.ConnectException;

public class CommandPing implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (strings.length == 0){

            if (commandSender instanceof Player) {
                Player player = (Player) commandSender;
                String ping = String.valueOf(player.getPing());
                player.sendMessage("Vous avez"+ping+"de ping");
            }
        } else if (strings.length ==0 || Bukkit.getPlayer(strings[0])!=null) {
            Player player = (Player) commandSender;
            Player playertarget = Bukkit.getPlayer(strings[0]);
            String ping = String.valueOf(playertarget.getPing());
            player.sendMessage("Ce joueur a "+playertarget+ " de ping");
        }

        return false;
    }
}

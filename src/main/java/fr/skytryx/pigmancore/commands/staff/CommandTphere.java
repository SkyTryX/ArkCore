package fr.skytryx.pigmancore.commands.staff;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandTphere implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!(commandSender instanceof Player)) return false;
        if(strings.length == 1){
                Player player = (Player) commandSender;
                Player playerselected = Bukkit.getPlayer(strings[0]);
                if (playerselected == null) return false;
                playerselected.teleport(player);
                return true;
            }
        return false;
        }
}
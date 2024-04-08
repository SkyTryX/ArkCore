package fr.skytryx.arkcore.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandPing implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (strings.length == 0 && commandSender instanceof Player player){
            player.sendMessage("§c[Ping] §bVous avez §6"+player.getPing()+" §bms");
            return true;
        } else if (strings.length == 1) {
            Player playertarget = Bukkit.getPlayer(strings[0]);
            if(playertarget == null) return false;
            commandSender.sendMessage("§c[Ping] §6"+playertarget.getName()+" §ba §6"+playertarget.getPing()+ " §bms");
            return true;
        }
        return false;
    }
}

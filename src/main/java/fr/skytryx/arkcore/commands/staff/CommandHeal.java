package fr.skytryx.arkcore.commands.staff;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class CommandHeal implements CommandExecutor {
    @Override
            public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
               if (strings.length == 0) {
                   if (!(commandSender instanceof Player)) return false;
                   Player player = (Player) commandSender;
                   player.setHealth(20);
                   player.setFoodLevel(20);
                   player.sendMessage("§c[Heal] §bTu viens de te soigner.");
                   return true;
               } else if (strings.length == 1 && Bukkit.getPlayer(strings[0]) != null) {
                   Objects.requireNonNull(Bukkit.getPlayer(strings[0])).setHealth(20);
                   Objects.requireNonNull(Bukkit.getPlayer(strings[0])).setSaturation(20);
                   commandSender.sendMessage("§c[Heal] §bTu viens de soigner §6"+  Objects.requireNonNull(Bukkit.getPlayer(strings[0])).getName());
                   return true;
               }
                return false;
            }
}

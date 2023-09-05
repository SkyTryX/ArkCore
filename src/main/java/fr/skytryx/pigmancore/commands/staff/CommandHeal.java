package fr.skytryx.pigmancore.commands.staff;

import org.apache.commons.lang3.ObjectUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandHeal implements CommandExecutor {
    @Override
            public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
               if (!((commandSender instanceof Player)) || strings.length ==0) commandSender.sendMessage("Erreur");
               if (Bukkit.getPlayer(strings[0]) == null) commandSender.sendMessage("Erreur2");
               if (strings.length == 0) {
                   Player player = (Player) commandSender;
                   player.setHealth(20);
                   player.setSaturation(20);
               } else if (strings.length == 1) {
                   Player playertarget = Bukkit.getPlayer(strings[1]);
                   if(!(playertarget instanceof Player || playertarget == null)) return false;
                   if (!playertarget.isOnline()) return false;
                   playertarget.setHealth(20);
                   playertarget.setSaturation(20);
               }
               Player player = (Player) commandSender;
               player.sendMessage("Vous avez soigné ce joueur");
                return false;
            }
}

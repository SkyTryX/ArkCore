package fr.skytryx.pigmancore.commands.staff;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandGamemode implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
       if(!(commandSender instanceof Player)) return false;
       if(strings.length >= 1){
           Player player = (Player) commandSender;
           if(strings.length == 2){
               player = Bukkit.getPlayer(strings[1]);
               if(player == null) return false;
           }
           switch (strings[0]){
               case "0":
                   player.setGameMode(GameMode.SURVIVAL);
                   player.sendMessage("§c[GameMode] §6"+player.getName()+" §b est maintenant en gamemode §6SURVIE");
                   return true;
               case "1":
                   player.setGameMode(GameMode.CREATIVE);
                   player.sendMessage("§c[GameMode] §6"+player.getName()+" §b est maintenant en gamemode §6CREATIF");
                   return true;
               case "2":
                   player.setGameMode(GameMode.ADVENTURE);
                   player.sendMessage("§c[GameMode] §6"+player.getName()+" §b est maintenant en gamemode §6AVENTURE");
                   return true;
               case "3":
                   player.setGameMode(GameMode.SPECTATOR);
                   player.sendMessage("§c[GameMode] §6"+player.getName()+" §b est maintenant en gamemode §6SPECTATEUR");
                   return true;
               }
           }
       return false;
    }
}

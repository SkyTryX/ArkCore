package fr.skytryx.arkcore.commands.staff;

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
       if(!(commandSender instanceof Player) && strings.length != 2) return false;
       Player player = null;
       if(strings.length == 1 || strings.length == 2){
           if(strings.length == 1) player = (Player) commandSender;
           if(strings.length == 2){
               player = Bukkit.getPlayer(strings[1]);
               if(player == null) return false;
           }
           switch (strings[0]){
               case "0","s","su","survival":
                   player.setGameMode(GameMode.SURVIVAL);
                   if(!player.equals(commandSender)) player.sendMessage("§c[GameMode] §bTon gamemode a été changé, tu es maintenant en mode §6SURVIE");
                   commandSender.sendMessage("§c[GameMode] §6"+player.getName()+"§b est maintenant en gamemode §6SURVIE");
                   return true;
               case "1","c","creative":
                   player.setGameMode(GameMode.CREATIVE);
                   if(!player.equals(commandSender)) player.sendMessage("§c[GameMode] §bTon gamemode a été changé, tu es maintenant en mode §6CREATIF");
                   commandSender.sendMessage("§c[GameMode] §6"+player.getName()+"§b est maintenant en gamemode §6CREATIF");
                   return true;
               case "2","a","adventure":
                   player.setGameMode(GameMode.ADVENTURE);
                   if(!player.equals(commandSender)) player.sendMessage("§c[GameMode] §bTon gamemode a été changé, tu es maintenant en mode §6ADVENTURE");
                   commandSender.sendMessage("§c[GameMode] §6"+player.getName()+"§b est maintenant en gamemode §6AVENTURE");
                   return true;
               case "3","sp","spectator":
                   player.setGameMode(GameMode.SPECTATOR);
                   if(!player.equals(commandSender)) player.sendMessage("§c[GameMode] §bTon gamemode a été changé, tu es maintenant en mode §6SPECTATOR");
                   commandSender.sendMessage("§c[GameMode] §6"+player.getName()+" §best maintenant en gamemode §6SPECTATEUR");
                   return true;
               }
           }
       return false;
    }
}

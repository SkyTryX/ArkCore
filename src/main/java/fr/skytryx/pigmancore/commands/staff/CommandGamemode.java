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
       if(!(commandSender instanceof Player || strings.length ==0)) return false;
       if (Bukkit.getPlayer(strings[0]) ==null) return false;
       switch (strings.length){
           case 0:{
               Player player = (Player) commandSender;
               player.sendMessage("Veuillez specifier le gamemode demandé");
               break;
           }
           case 1:{
                Player player = (Player) commandSender;
                String gamemode = (String) strings[1];
                switch (gamemode){
                    case "0":{
                        //survie
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage("Tu est en gamemode survie!");
                        break;
                    }
                    case "1":{
                        //creative
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage("Tu est en gamemode creatif!");
                        break;
                    }
                    case "2":{
                        //adventure
                        player.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage("Tu est en gamemode aventure!");
                        break;
                    }
                    case "3":{
                        //spectator
                        player.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage("Tu est en gamemode spectateur!");
                        break;
                    }
                }
                break;
           }
       }

        return false;
    }
}

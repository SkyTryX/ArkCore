package fr.skytryx.pigmancore.commands.staff;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandeTP2P implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if(!(commandSender instanceof Player || commandSender == null)) return false;
        switch (strings.length){
            case 0:{
                Player player = (Player) commandSender;
                player.sendMessage("Veuillez specifier le joueur en question");
            }
            case 1:{
                Player player = (Player) commandSender;
                Player playerselected = Bukkit.getPlayer(strings[1]);
                if (!(playerselected.isOnline() || playerselected ==null)) return false;
                player.teleport(playerselected);
            }
        }
        return false;
    }
}

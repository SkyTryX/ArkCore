package fr.skytryx.pigmancore.commands.staff;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class CommandStafftp implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if(!(commandSender instanceof Player) || strings.length == 0) return false;
        if(Bukkit.getPlayer(strings[0]) == null) return false;
        Player player = (Player) commandSender;
        player.setGameMode(GameMode.SPECTATOR);
        player.teleport(Objects.requireNonNull(Bukkit.getPlayer(strings[0])));
        player.sendMessage("§c[StaffTP] §bYou were §6staff-teleported §bto §6"+strings[0]);
        return true;
    }
}

package fr.skytryx.arkcore.commands;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class CommandLobby implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            ByteArrayDataOutput out = ByteStreams.newDataOutput();
            out.writeUTF("Connect");
            out.writeUTF("lobby");
            player.sendPluginMessage(Objects.requireNonNull(Bukkit.getPluginManager().getPlugin("ArkCore")), "BungeeCord", out.toByteArray());
            player.sendMessage("§b§bTu vas rejoindre le serveur §6Lobby");
        } else return false;
        return true;
    }
}

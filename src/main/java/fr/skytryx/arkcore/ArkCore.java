package fr.skytryx.arkcore;

import fr.skytryx.arkcore.commands.CommandLobby;
import fr.skytryx.arkcore.commands.CommandPing;
import fr.skytryx.arkcore.commands.staff.*;
import fr.skytryx.arkcore.staff.InvseeCheck;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class ArkCore extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        Objects.requireNonNull(getCommand("lobby")).setExecutor(new CommandLobby());
        Objects.requireNonNull(getCommand("stafftp")).setExecutor(new CommandStafftp());
        Objects.requireNonNull(getCommand("invsee")).setExecutor(new CommandInvsee());
        Objects.requireNonNull(getCommand("heal")).setExecutor(new CommandHeal());
        Objects.requireNonNull(getCommand("gamemode")).setExecutor(new CommandGamemode());
        Objects.requireNonNull(getCommand("tp2p")).setExecutor(new CommandeTP2P());
        Objects.requireNonNull(getCommand("tphere")).setExecutor(new CommandTphere());
        Objects.requireNonNull(getCommand("feed")).setExecutor(new CommandFeed());
        getServer().getPluginManager().registerEvents(new InvseeCheck(), this);
        Objects.requireNonNull(getCommand("ping")).setExecutor(new CommandPing());

        Bukkit.getLogger().info("[ArkCore] Plugin Enabled");
    }

    @Override
    public void onDisable() {
        this.getServer().getMessenger().unregisterOutgoingPluginChannel(this);
        Bukkit.getLogger().info("[ArkCore] Plugin Disabled");
    }
}

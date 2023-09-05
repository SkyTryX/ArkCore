package fr.skytryx.pigmancore;

import fr.skytryx.pigmancore.commands.CommandLobby;
import fr.skytryx.pigmancore.commands.staff.CommandHeal;
import fr.skytryx.pigmancore.commands.staff.CommandInvsee;
import fr.skytryx.pigmancore.commands.staff.CommandStafftp;
import fr.skytryx.pigmancore.staff.InvseeCheck;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class PigmanCore extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        Objects.requireNonNull(getCommand("lobby")).setExecutor(new CommandLobby());
        Objects.requireNonNull(getCommand("stafftp")).setExecutor(new CommandStafftp());
        Objects.requireNonNull(getCommand("invsee")).setExecutor(new CommandInvsee());
        Objects.requireNonNull(getCommand("heal")).setExecutor(new CommandHeal());

        getServer().getPluginManager().registerEvents(new InvseeCheck(), this);

        Bukkit.getLogger().info("[PigmanCore] Le Core a été activé");
    }

    @Override
    public void onDisable() {
        this.getServer().getMessenger().unregisterOutgoingPluginChannel(this);
        Bukkit.getLogger().info("[PigmanCore] Le Core a été desactivé");
    }
}

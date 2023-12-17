package fr.skytryx.arkcore.staff;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class InvseeCheck implements Listener {

    @EventHandler
    public void InvseeUnDupe(InventoryClickEvent event) {
        if (event.getView().getTitle().equals("§7Invsee")) event.setCancelled(true);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        event.joinMessage(Component.text( "[+]"+event.getPlayer().getName()).color(TextColor.color(0, 255, 0)));
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        event.quitMessage(Component.text( "[-]"+event.getPlayer().getName()).color(TextColor.color(255, 0, 0)));
    }
}

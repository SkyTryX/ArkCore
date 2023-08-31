package fr.skytryx.pigmancore.staff;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InvseeCheck implements Listener {

    @EventHandler
    public void InvseeUnDupe(InventoryClickEvent event) {
        if (event.getView().getTitle().equals("§7Invsee")) event.setCancelled(true);
    }
}

package net.sirdizzypanda.xtrplugin;

import net.kyori.adventure.text.ComponentLike;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class XtrPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Hello World");

        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void playerDeath(PlayerDeathEvent event) {
        event.getPlayer().sendMessage("You died in " + event.getPlayer().getLocation().getBlockX()+" "+event.getPlayer().getLocation().getBlockY() + " " + event.getPlayer().getLocation().getBlockZ());
    }

}


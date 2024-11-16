package com.example.channelinganyweather;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.LightningStrike;
import org.bukkit.entity.Player;
import org.bukkit.entity.Trident;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ChannelingAnyWeather extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Register the event listener
        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("ChannelingAnyWeather Plugin Enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("ChannelingAnyWeather Plugin Disabled!");
    }

    @EventHandler
    public void onTridentHit(ProjectileHitEvent event) {
        // Check if the projectile is a trident
        if (!(event.getEntity() instanceof Trident)) return;
        Trident trident = (Trident) event.getEntity();

        // Check if the thrower is a player
        if (!(trident.getShooter() instanceof Player)) return;
        Player player = (Player) trident.getShooter();

        // Ensure the trident has the Channeling enchantment
        if (!trident.getItem().containsEnchantment(Enchantment.CHANNELING)) return;

        // Get the world where the trident lands
        World world = trident.getWorld();

        // Spawn lightning where the trident lands
        if (event.getHitBlock() != null) {
            world.strikeLightning(event.getHitBlock().getLocation());
        } else if (event.getHitEntity() != null) {
            world.strikeLightning(event.getHitEntity().getLocation());
        }

        // Play a sound effect
        player.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 1.0f, 1.0f);
    }
}

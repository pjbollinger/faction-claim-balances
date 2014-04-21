package net.corruptedmc.fcb;

import com.massivecraft.factions.event.LandClaimEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class FCB extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onClaim(LandClaimEvent event) {

        getLogger().info(event.getFaction().getTag() +
                        " has " +
                        event.getFaction().getPower() +
                        " out of " +
                        event.getFaction().getPowerMaxRounded() +
                        " power."
        );

    }

}

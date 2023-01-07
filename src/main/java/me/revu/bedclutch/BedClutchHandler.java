package me.revu.bedclutch;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class BedClutchHandler implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location loc = player.getLocation();
            int countdown = 3;
            while (countdown > 0) {
                player.sendRawMessage(String.valueOf(countdown)); // Display countdown in chat
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countdown--;
            }

            // Apply velocity and damage
            player.damage(0.0D);
            Vector velocity = player.getLocation().getDirection().multiply(-3);
            velocity.setY(0.33); // Set Y velocity to 0
            player.setVelocity(velocity);

        }

        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}
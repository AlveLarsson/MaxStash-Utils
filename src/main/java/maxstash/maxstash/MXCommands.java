package maxstash.maxstash;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class MXCommands implements CommandExecutor {

    public static HashMap<String, String> PlayerTeleportWaitList;

    public void RegisterCommands(Main plugin){
        PlayerTeleportWaitList = new HashMap<>();
        plugin.getCommand("home").setExecutor(Main.commandsHandler);
        plugin.getCommand("to").setExecutor(Main.commandsHandler);
        plugin.getCommand("okay").setExecutor(Main.commandsHandler);
        plugin.getCommand("nope").setExecutor(Main.commandsHandler);
    }

    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            switch (command.getName()){
                case "home":
                    MXCommands.PlayerSendHome(player);
                    break;
                case "to":
                    if(args.length != 0 && args[0] != ""){
                        if(Main.server.getPlayer(args[0]) != null){
                            MXCommands.PlayerTo(Main.server.getPlayer(args[0]), player);
                        }else{
                            player.sendMessage("" + ChatColor.BOLD + ChatColor.GOLD + "[MaxStash] " + ChatColor.RED +"Spelling error! The Player was not found. Check to spell.");
                        }
                    }else{
                        player.sendMessage("" + ChatColor.BOLD + ChatColor.GOLD + "[MaxStash] " + ChatColor.RED +"Invalid usage! You *must* enter what player you want to teleport to! /to CoolPlayerName");
                    }
                    break;
                case "okay":
                    MXCommands.PlayerTpOk(player);
                    break;
                case "nope":
                    MXCommands.PlayerTpNo(player);
                    break;
            }
        }

        return false;
    }

    // /home - command
    // TODO: add gold payment.
    public static void PlayerSendHome(Player player){
        Location bedLocal = player.getBedSpawnLocation();
        if(bedLocal == null){
            player.sendMessage( "" + ChatColor.BOLD + ChatColor.GOLD + "[MaxStash] " + ChatColor.YELLOW + "Sorry you must sleep in a bed to set home.");
            return;
        }

        player.getWorld().spawnParticle(Particle.CLOUD, player.getLocation(), 10, 0.4, 1, 0.4, 0);
        player.teleport(bedLocal);
        player.sendMessage( "" + ChatColor.BOLD + ChatColor.GOLD + "[MaxStash] " + ChatColor.YELLOW + "Teleported for your pleasure.");
        player.getWorld().spawnParticle(Particle.CLOUD, player.getBedSpawnLocation(), 50, 0.4, 1, 0.4, 0);
        player.getWorld().playSound(player.getBedSpawnLocation(), Sound.BLOCK_AMETHYST_CLUSTER_FALL, 1, 1);
    }

    public static void PlayerTo(Player player, Player from){
        PlayerTeleportWaitList.put(player.getName(), from.getName());
        from.sendMessage( "" + ChatColor.BOLD + ChatColor.GOLD + "[MaxStash] " + ChatColor.YELLOW + "Teleport request sent.");
        player.sendMessage( "" + ChatColor.BOLD + ChatColor.GOLD + "[MaxStash] " + ChatColor.LIGHT_PURPLE + "" + from.getName() + " Sent you a teleport request. Accept with /okay or deny with /nope");
        player.getWorld().playSound(player.getLocation(), Sound.BLOCK_AMETHYST_CLUSTER_FALL, 1, 1);
    }

    public static void PlayerTpNo(Player player){
        String name = PlayerTeleportWaitList.get(player.getName());
        if(name == null){
            player.sendMessage( "" + ChatColor.BOLD + ChatColor.GOLD + "[MaxStash] " + ChatColor.YELLOW + "Sorry you don't have any requests :(");
            return;
        }

        Player RequestPlayer = Main.server.getPlayer(name);

        if(RequestPlayer == null){
            player.sendMessage( "" + ChatColor.BOLD + ChatColor.GOLD + "[MaxStash] " + ChatColor.YELLOW + "Sorry the player that requested teleport was not found.");
            return;
        }

        player.sendMessage( "" + ChatColor.BOLD + ChatColor.GOLD + "[MaxStash] " + ChatColor.YELLOW + "Teleport request denied.");
        RequestPlayer.sendMessage( "" + ChatColor.BOLD + ChatColor.GOLD + "[MaxStash] " + ChatColor.GRAY + "" + player.getName() + " Has denied your teleport request.");

        // Remove request
        PlayerTeleportWaitList.remove(player.getName());
    }

    public static void PlayerTpOk(Player player){
        String name = PlayerTeleportWaitList.get(player.getName());
        if(name == null){
            player.sendMessage( "" + ChatColor.BOLD + ChatColor.GOLD + "[MaxStash] " + ChatColor.YELLOW + "Sorry you don't have any requests :(");
            return;
        }

        Player RequestPlayer = Main.server.getPlayer(name);

        if(RequestPlayer == null){
            player.sendMessage( "" + ChatColor.BOLD + ChatColor.GOLD + "[MaxStash] " + ChatColor.YELLOW + "Sorry the player that requested teleport was not found.");
            return;
        }

        player.getWorld().spawnParticle(Particle.CLOUD, RequestPlayer.getLocation(), 10, 0.4, 1, 0.4, 0);

        // Teleport
        RequestPlayer.teleport(player.getLocation());
        player.getWorld().spawnParticle(Particle.CLOUD, player.getLocation(), 50, 0.4, 1, 0.4, 0);
        player.getWorld().playSound(player.getLocation(), Sound.BLOCK_AMETHYST_CLUSTER_FALL, 1, 1);

        player.sendMessage( "" + ChatColor.BOLD + ChatColor.GOLD + "[MaxStash] " + ChatColor.BLUE + "Teleported for your pleasure.");
        RequestPlayer.sendMessage( "" + ChatColor.BOLD + ChatColor.GOLD + "[MaxStash] " + ChatColor.BLUE + "Teleported for your pleasure.");

        // Remove request
        PlayerTeleportWaitList.remove(player.getName());
    }
}

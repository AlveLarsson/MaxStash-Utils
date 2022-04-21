package maxstash.maxstash;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.data.Ageable;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

// MaxStash Events
public class MXEvents implements Listener{

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onBlockBreak(BlockBreakEvent event){

        // Log breaking
        ItemStack item = event.getPlayer().getInventory().getItemInMainHand();

        if(item.getType().toString().endsWith("_AXE")){
            Block root_block = event.getBlock();
            String block_str = root_block.getType().toString();
            if(block_str.endsWith("LOG") || block_str.endsWith("STEM")){
                Location local = root_block.getLocation();
                World world = local.getWorld();
                // Check if there is any logs downwoards
                boolean ended = false;
                int pos = 0, dir = -1;
                Block target;
                String str_target;
                Damageable ditem = (Damageable) item.getItemMeta();
                while (!ended) {
                    target = world.getBlockAt(local.getBlockX(), local.getBlockY() + pos, local.getBlockZ());
                    pos += dir;
                    str_target = target.getType().toString();
                    if(str_target.endsWith("LOG") || str_target.endsWith("STEM")){
                        if(target.breakNaturally(item)){
                            if(event.getPlayer().getGameMode() != GameMode.CREATIVE){
                                ditem.setDamage(ditem.getDamage() + 1);
                                if(ditem.getDamage() > item.getType().getMaxDurability()) {
                                    event.getPlayer().getInventory().setItemInMainHand(null);
                                    world.playSound(event.getPlayer().getLocation(), Sound.ENTITY_ITEM_BREAK, 1f, 1f);
                                    world.spawnParticle(Particle.ITEM_CRACK, event.getPlayer().getLocation(), 20, 0, 0, 0, item);
                                }
                            }
                        }
                    }else{
                        if(dir == -1){
                            dir = 1;
                            pos = 1;
                        }else{
                            ended = true;
                        }
                    }
                }
                // Apply damage
                item.setItemMeta(ditem);
            }
        }

        // Netherite Pickaxe
        if(item.getType() == Material.NETHERITE_PICKAXE){
            Block block = event.getBlock();
            if(block.getType() == Material.SPAWNER){
                ItemStack itemSpawner;

                block.getWorld().spawnParticle(Particle.CLOUD, block.getLocation(), 50, 0.6, 0.6, 0.6, 0);
                block.getWorld().playSound(block.getLocation(), Sound.ENTITY_ITEM_BREAK, 1, 1);
            }
        }
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        if(event.getAction().isRightClick()){
            Block block = event.getClickedBlock();
            if(block != null){
                Material type = block.getType();
                if(type == Material.WHEAT || type == Material.BEETROOTS || type == Material.CARROTS || type == Material.POTATOES){
                    Ageable agable = (Ageable) block.getBlockData();
                    if(agable.getAge() >= agable.getMaximumAge()){
                        block.breakNaturally();
                        block.setType(type);
                        block.getWorld().playSound(block.getLocation(), Sound.BLOCK_GROWING_PLANT_CROP, 1, 1);
                    }
                }
            }
        }
    }

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event){
        //Player player = event.getPlayer();
        //event.joinMessage(player, "" + ChatColor.GOLD + "Welcome to MaxStash " + ChatColor.BLUE + ChatColor.BOLD + player.displayName() + "!");
    }

}

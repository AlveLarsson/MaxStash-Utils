package maxstash.maxstash;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class MXCrafting {

    public static void RegisterCrafting(Main plugin){
        // MX Crafting
        ItemStack saddle = new ItemStack(Material.SADDLE, 1);
        ShapedRecipe mx_sadde = new ShapedRecipe(new NamespacedKey(plugin, "mxsaddle"), saddle);
        mx_sadde.shape("xx", " y");
        mx_sadde.setIngredient('x', Material.LEATHER);
        mx_sadde.setIngredient('y', Material.LEAD);
        Bukkit.addRecipe(mx_sadde);

        // MX Nametag
        ItemStack nametag = new ItemStack(Material.NAME_TAG, 1);
        ShapedRecipe mx_tag = new ShapedRecipe(new NamespacedKey(plugin, "mxnametag"), nametag);
        mx_tag.shape("xx ", "xxy", "xx ");
        mx_tag.setIngredient('x', Material.PAPER);
        mx_tag.setIngredient('y', Material.STRING);
        Bukkit.addRecipe(mx_tag);

        // OAK_LOG
        ItemStack wood_result = new ItemStack(Material.CHEST, 4);

        // OAK_LOG
        ShapedRecipe mx_chest_OAK = new ShapedRecipe(new NamespacedKey(plugin, "mxoakch"), wood_result);
        mx_chest_OAK.shape("xxx", "x x", "xxx");
        mx_chest_OAK.setIngredient('x', Material.OAK_LOG);
        Bukkit.addRecipe(mx_chest_OAK);

        // ACACIA_LOG
        ShapedRecipe mx_chest_ACACIA = new ShapedRecipe(new NamespacedKey(plugin, "mxacaciach"), wood_result);
        mx_chest_ACACIA.shape("xxx", "x x", "xxx");
        mx_chest_ACACIA.setIngredient('x', Material.ACACIA_LOG);
        Bukkit.addRecipe(mx_chest_ACACIA);

        // BIRCH_LOG
        ShapedRecipe mx_chest_BIRCH = new ShapedRecipe(new NamespacedKey(plugin, "mxbirchch"), wood_result);
        mx_chest_BIRCH.shape("xxx", "x x", "xxx");
        mx_chest_BIRCH.setIngredient('x', Material.BIRCH_LOG);
        Bukkit.addRecipe(mx_chest_BIRCH);

        // DARK_OAK_LOG
        ShapedRecipe mx_chest_DARK_OAK_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxdarkoakch"), wood_result);
        mx_chest_DARK_OAK_LOG.shape("xxx", "x x", "xxx");
        mx_chest_DARK_OAK_LOG.setIngredient('x', Material.DARK_OAK_LOG);
        Bukkit.addRecipe(mx_chest_DARK_OAK_LOG);

        // JUNGLE_LOG
        ShapedRecipe mx_chest_JUNGLE_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxjunglech"), wood_result);
        mx_chest_JUNGLE_LOG.shape("xxx", "x x", "xxx");
        mx_chest_JUNGLE_LOG.setIngredient('x', Material.JUNGLE_LOG);
        Bukkit.addRecipe(mx_chest_JUNGLE_LOG);

        // SPRUCE_LOG
        ShapedRecipe mx_chest_SPRUCE_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxsprucech"), wood_result);
        mx_chest_SPRUCE_LOG.shape("xxx", "x x", "xxx");
        mx_chest_SPRUCE_LOG.setIngredient('x', Material.SPRUCE_LOG);
        Bukkit.addRecipe(mx_chest_SPRUCE_LOG);

        // mx_chest_WARPED_STEM
        ShapedRecipe mx_chest_WARPED_STEM = new ShapedRecipe(new NamespacedKey(plugin, "mxwarpedch"), wood_result);
        mx_chest_WARPED_STEM.shape("xxx", "x x", "xxx");
        mx_chest_WARPED_STEM.setIngredient('x', Material.WARPED_STEM);
        Bukkit.addRecipe(mx_chest_WARPED_STEM);

        // mx_chest_CRIMSON_STEM
        ShapedRecipe mx_chest_CRIMSON_STEM = new ShapedRecipe(new NamespacedKey(plugin, "mxcrimsonch"), wood_result);
        mx_chest_CRIMSON_STEM.shape("xxx", "x x", "xxx");
        mx_chest_CRIMSON_STEM.setIngredient('x', Material.CRIMSON_STEM);
        Bukkit.addRecipe(mx_chest_CRIMSON_STEM);

        // STRIPPED_OAK_LOG
        ShapedRecipe mx_chest_STRIPPED_OAK_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxstroakch"), wood_result);
        mx_chest_STRIPPED_OAK_LOG.shape("xxx", "x x", "xxx");
        mx_chest_STRIPPED_OAK_LOG.setIngredient('x', Material.STRIPPED_OAK_LOG);
        Bukkit.addRecipe(mx_chest_STRIPPED_OAK_LOG);

        // STRIPPED_ACACIA_LOG
        ShapedRecipe mx_chest_STRIPPED_ACACIA_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxstracaciach"), wood_result);
        mx_chest_STRIPPED_ACACIA_LOG.shape("xxx", "x x", "xxx");
        mx_chest_STRIPPED_ACACIA_LOG.setIngredient('x', Material.STRIPPED_ACACIA_LOG);
        Bukkit.addRecipe(mx_chest_STRIPPED_ACACIA_LOG);

        // STRIPPED_BIRCH_LOG
        ShapedRecipe mx_chest_STRIPPED_BIRCH_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxstrbirchh"), wood_result);
        mx_chest_STRIPPED_BIRCH_LOG.shape("xxx", "x x", "xxx");
        mx_chest_STRIPPED_BIRCH_LOG.setIngredient('x', Material.STRIPPED_BIRCH_LOG);
        Bukkit.addRecipe(mx_chest_STRIPPED_BIRCH_LOG);

        // STRIPPED_DARK_OAK_LOG
        ShapedRecipe mx_chest_STRIPPED_DARK_OAK_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxstrdroakch"), wood_result);
        mx_chest_STRIPPED_DARK_OAK_LOG.shape("xxx", "x x", "xxx");
        mx_chest_STRIPPED_DARK_OAK_LOG.setIngredient('x', Material.STRIPPED_DARK_OAK_LOG);
        Bukkit.addRecipe(mx_chest_STRIPPED_DARK_OAK_LOG);

        // STRIPPED_JUNGLE_LOG
        ShapedRecipe mx_chest_STRIPPED_JUNGLE_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxstrjunglech"), wood_result);
        mx_chest_STRIPPED_JUNGLE_LOG.shape("xxx", "x x", "xxx");
        mx_chest_STRIPPED_JUNGLE_LOG.setIngredient('x', Material.STRIPPED_JUNGLE_LOG);
        Bukkit.addRecipe(mx_chest_STRIPPED_JUNGLE_LOG);

        // STRIPPED_SPRUCE_LOG
        ShapedRecipe mx_chest_STRIPPED_SPRUCE_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxstrsprucech"), wood_result);
        mx_chest_STRIPPED_SPRUCE_LOG.shape("xxx", "x x", "xxx");
        mx_chest_STRIPPED_SPRUCE_LOG.setIngredient('x', Material.STRIPPED_SPRUCE_LOG);
        Bukkit.addRecipe(mx_chest_STRIPPED_SPRUCE_LOG);

        // STRIPPED_CRIMSON_STEM
        ShapedRecipe mx_chest_STRIPPED_CRIMSON_STEM = new ShapedRecipe(new NamespacedKey(plugin, "mxstrcrimsonch"), wood_result);
        mx_chest_STRIPPED_CRIMSON_STEM.shape("xxx", "x x", "xxx");
        mx_chest_STRIPPED_CRIMSON_STEM.setIngredient('x', Material.STRIPPED_CRIMSON_STEM);
        Bukkit.addRecipe(mx_chest_STRIPPED_CRIMSON_STEM);

        // STRIPPED_WARPED_STEM
        ShapedRecipe mx_chest_STRIPPED_WARPED_STEM = new ShapedRecipe(new NamespacedKey(plugin, "mxstrwarpedch"), wood_result);
        mx_chest_STRIPPED_WARPED_STEM.shape("xxx", "x x", "xxx");
        mx_chest_STRIPPED_WARPED_STEM.setIngredient('x', Material.STRIPPED_WARPED_STEM);
        Bukkit.addRecipe(mx_chest_STRIPPED_WARPED_STEM);

        // Stick ----------------

        // OAK_LOG
        ItemStack stick_result = new ItemStack(Material.STICK, 16);

        // OAK_LOG
        ShapedRecipe mx_stick_OAK = new ShapedRecipe(new NamespacedKey(plugin, "mxoakstick"), stick_result);
        mx_stick_OAK.shape("x ", "x ");
        mx_stick_OAK.setIngredient('x', Material.OAK_LOG);
        Bukkit.addRecipe(mx_stick_OAK);

        // ACACIA_LOG
        ShapedRecipe mx_stick_ACACIA = new ShapedRecipe(new NamespacedKey(plugin, "mxacaciastick"), stick_result);
        mx_stick_ACACIA.shape("x ", "x ");
        mx_stick_ACACIA.setIngredient('x', Material.ACACIA_LOG);
        Bukkit.addRecipe(mx_stick_ACACIA);

        // BIRCH_LOG
        ShapedRecipe mx_stick_BIRCH = new ShapedRecipe(new NamespacedKey(plugin, "mxbirchstick"), stick_result);
        mx_stick_BIRCH.shape("x ", "x ");
        mx_stick_BIRCH.setIngredient('x', Material.BIRCH_LOG);
        Bukkit.addRecipe(mx_stick_BIRCH);

        // DARK_OAK_LOG
        ShapedRecipe mx_stick_DARK_OAK_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxdarkoakstick"), stick_result);
        mx_stick_DARK_OAK_LOG.shape("x ", "x ");
        mx_stick_DARK_OAK_LOG.setIngredient('x', Material.DARK_OAK_LOG);
        Bukkit.addRecipe(mx_stick_DARK_OAK_LOG);

        // JUNGLE_LOG
        ShapedRecipe mx_stick_JUNGLE_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxjunglestick"), stick_result);
        mx_stick_JUNGLE_LOG.shape("x ", "x ");
        mx_stick_JUNGLE_LOG.setIngredient('x', Material.JUNGLE_LOG);
        Bukkit.addRecipe(mx_stick_JUNGLE_LOG);

        // SPRUCE_LOG
        ShapedRecipe mx_stick_SPRUCE_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxsprucestick"), stick_result);
        mx_stick_SPRUCE_LOG.shape("x ", "x ");
        mx_stick_SPRUCE_LOG.setIngredient('x', Material.SPRUCE_LOG);
        Bukkit.addRecipe(mx_stick_SPRUCE_LOG);

        // mx_chest_WARPED_STEM
        ShapedRecipe mx_stick_WARPED_STEM = new ShapedRecipe(new NamespacedKey(plugin, "mxwarpedstick"), stick_result);
        mx_stick_WARPED_STEM.shape("x ", "x ");
        mx_stick_WARPED_STEM.setIngredient('x', Material.WARPED_STEM);
        Bukkit.addRecipe(mx_stick_WARPED_STEM);

        // mx_chest_CRIMSON_STEM
        ShapedRecipe mx_stick_CRIMSON_STEM = new ShapedRecipe(new NamespacedKey(plugin, "mxcrimsonstick"), stick_result);
        mx_stick_CRIMSON_STEM.shape("x ", "x ");
        mx_stick_CRIMSON_STEM.setIngredient('x', Material.CRIMSON_STEM);
        Bukkit.addRecipe(mx_stick_CRIMSON_STEM);

        // STRIPPED_OAK_LOG
        ShapedRecipe mx_stick_STRIPPED_OAK_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxstroakstick"), stick_result);
        mx_stick_STRIPPED_OAK_LOG.shape("x ", "x ");
        mx_stick_STRIPPED_OAK_LOG.setIngredient('x', Material.STRIPPED_OAK_LOG);
        Bukkit.addRecipe(mx_stick_STRIPPED_OAK_LOG);

        // STRIPPED_ACACIA_LOG
        ShapedRecipe mx_stick_STRIPPED_ACACIA_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxstracaciastick"), stick_result);
        mx_stick_STRIPPED_ACACIA_LOG.shape("x ", "x ");
        mx_stick_STRIPPED_ACACIA_LOG.setIngredient('x', Material.STRIPPED_ACACIA_LOG);
        Bukkit.addRecipe(mx_stick_STRIPPED_ACACIA_LOG);

        // STRIPPED_BIRCH_LOG
        ShapedRecipe mx_stick_STRIPPED_BIRCH_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxstrbirstick"), stick_result);
        mx_stick_STRIPPED_BIRCH_LOG.shape("x ", "x ");
        mx_stick_STRIPPED_BIRCH_LOG.setIngredient('x', Material.STRIPPED_BIRCH_LOG);
        Bukkit.addRecipe(mx_stick_STRIPPED_BIRCH_LOG);

        // STRIPPED_DARK_OAK_LOG
        ShapedRecipe mx_stick_STRIPPED_DARK_OAK_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxstrdroakstick"), stick_result);
        mx_stick_STRIPPED_DARK_OAK_LOG.shape("x ", "x ");
        mx_stick_STRIPPED_DARK_OAK_LOG.setIngredient('x', Material.STRIPPED_DARK_OAK_LOG);
        Bukkit.addRecipe(mx_stick_STRIPPED_DARK_OAK_LOG);

        // STRIPPED_JUNGLE_LOG
        ShapedRecipe mx_stick_STRIPPED_JUNGLE_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxstrjunglestick"), stick_result);
        mx_stick_STRIPPED_JUNGLE_LOG.shape("x ", "x ");
        mx_stick_STRIPPED_JUNGLE_LOG.setIngredient('x', Material.STRIPPED_JUNGLE_LOG);
        Bukkit.addRecipe(mx_stick_STRIPPED_JUNGLE_LOG);

        // STRIPPED_SPRUCE_LOG
        ShapedRecipe mx_stick_STRIPPED_SPRUCE_LOG = new ShapedRecipe(new NamespacedKey(plugin, "mxstrsprucestick"), stick_result);
        mx_stick_STRIPPED_SPRUCE_LOG.shape("x ", "x ");
        mx_stick_STRIPPED_SPRUCE_LOG.setIngredient('x', Material.STRIPPED_SPRUCE_LOG);
        Bukkit.addRecipe(mx_stick_STRIPPED_SPRUCE_LOG);

        // STRIPPED_CRIMSON_STEM
        ShapedRecipe mx_stick_STRIPPED_CRIMSON_STEM = new ShapedRecipe(new NamespacedKey(plugin, "mxstrcrimsonstick"), stick_result);
        mx_stick_STRIPPED_CRIMSON_STEM.shape("x ", "x ");
        mx_stick_STRIPPED_CRIMSON_STEM.setIngredient('x', Material.STRIPPED_CRIMSON_STEM);
        Bukkit.addRecipe(mx_stick_STRIPPED_CRIMSON_STEM);

        // STRIPPED_WARPED_STEM
        ShapedRecipe mx_stick_STRIPPED_WARPED_STEM = new ShapedRecipe(new NamespacedKey(plugin, "mxstrwarpedstick"), stick_result);
        mx_stick_STRIPPED_WARPED_STEM.shape("x ", "x ");
        mx_stick_STRIPPED_WARPED_STEM.setIngredient('x', Material.STRIPPED_WARPED_STEM);
        Bukkit.addRecipe(mx_stick_STRIPPED_WARPED_STEM);
    }
}

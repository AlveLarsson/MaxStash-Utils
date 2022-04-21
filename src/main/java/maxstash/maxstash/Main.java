package maxstash.maxstash;

import org.bukkit.Server;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

/*
* Version info v.1.4
*
* [MXEvents] Added Silktouch spawners - TODO
* */

public final class Main extends JavaPlugin {

    // Plugin statics
    public static Logger plog;
    public static ConsoleCommandSender glog;
    public static Server server;
    public static MXCommands commandsHandler;
    public static Main MXInstance;

    @Override
    public void onEnable() {

        // Get server logger
        MXInstance = this;
        server = getServer();
        plog = getLogger();
        glog = getServer().getConsoleSender();
        commandsHandler = new MXCommands();

        commandsHandler.RegisterCommands(this);

        plog.info("Starting MaxStash Plugin!");

        server.getPluginManager().registerEvents(new MXEvents(), this);
        // Register Crafting
        MXCrafting.RegisterCrafting(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        plog.info("Shutting down");
    }
}

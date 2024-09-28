package top.haha44444.deoponquit

import net.md_5.bungee.api.ChatColor
import org.bukkit.plugin.java.JavaPlugin
import top.haha44444.deoponquit.events.PlayerListener

class DeopOnQuit : JavaPlugin() {
    override fun onEnable() {
        this.server.pluginManager.registerEvents(PlayerListener(), this)
        logger.info(ChatColor.GREEN.toString() + "deopOnQuit by " + ChatColor.AQUA.toString() + "haha44444")
        logger.info(ChatColor.GREEN.toString() + "deopOnquit plugin is enabled")
    }

    override fun onDisable() {
        logger.info(ChatColor.GREEN.toString() + "deopOnQuit by " + ChatColor.AQUA.toString() + "haha44444")
        logger.info(ChatColor.GREEN.toString() + "deopOnQuit plugin is disabled")
    }
}

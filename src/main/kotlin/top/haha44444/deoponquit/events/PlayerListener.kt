package top.haha44444.deoponquit.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerQuitEvent

class PlayerListener : Listener {
    @EventHandler
    fun onQuit(e: PlayerQuitEvent) {
        if (e.player.isOp) {
            e.player.isOp = false
        }
    }
}
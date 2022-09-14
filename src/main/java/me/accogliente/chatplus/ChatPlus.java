package me.accogliente.chatplus;

import org.bukkit.plugin.java.JavaPlugin;

public final class ChatPlus extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("");
    }
}

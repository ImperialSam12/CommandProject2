package com.samcodes.commandproject2;

import com.samcodes.commandproject2.notcommands.EchoCommand;
import com.samcodes.commandproject2.notcommands.FeedCommand;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class CommandProject2 extends JavaPlugin {


    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "CommandProject2 is enabled!");
        Objects.requireNonNull(getCommand("feed")).setExecutor(new FeedCommand());
        Objects.requireNonNull(getCommand("echo")).setExecutor(new EchoCommand());
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "CommandProject2 is disabled!");

    }
}
package com.samcodes.commandproject2;

import com.samcodes.commands.Commands;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;
import java.util.Objects;

public class CommandProject2 extends JavaPlugin {


    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "CommandProject2 is enabled!");
        Objects.requireNonNull(getCommand("feed")).setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "CommandProject2 is disabled!");

    }
}
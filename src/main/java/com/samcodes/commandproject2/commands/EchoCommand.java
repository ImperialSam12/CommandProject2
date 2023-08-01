package com.samcodes.commandproject2.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class EchoCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player player = (Player) sender;
        if (sender == null) {
            System.out.println("You are not a player!");
            return false;
        }
        if (args.length < 1) {
            player.sendMessage(ChatColor.RED + "Please include an argument!");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (String arg : args) {
            sb.append(arg).append(" ");
        }
        Bukkit.broadcastMessage(sb.toString());
        return true;
    }
}
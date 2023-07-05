package com.samcodes.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;
            player.setFoodLevel(20);
            player.sendMessage(ChatColor.GREEN + "You have been fed!");
        }else {
            System.out.println("You are not a player!");
        }

        return true;
    }

}
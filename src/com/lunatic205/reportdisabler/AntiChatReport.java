package com.lunatic205.reportdisabler;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.lunatic205.reportdisabler.listeners.ChatListener;

import java.util.HashMap;

public class AntiChatReport extends JavaPlugin {
	private ChatListener chatListener;

	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(chatListener = new ChatListener(this), (Plugin)this);
	}

	@Override
	public void onDisable() {
		Bukkit.getPluginManager().disablePlugin(this);
	}
}

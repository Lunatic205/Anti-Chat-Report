package com.lunatic205.reportdisable;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.lunatic205.reportdisable.listeners.ChatListener;
import com.lunatic205.reportdisable.listeners.EggListener;

import java.util.HashMap;

public class MessageUnsigner extends JavaPlugin {
	public HashMap<String, String> playerIps;

	private ChatListener chatListener;
	private EggListener eggListener;

	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(chatListener = new ChatListener(this), (Plugin)this);
		Bukkit.getPluginManager().registerEvents(eggListener = new EggListener(this), (Plugin)this);
	}

	@Override
	public void onDisable() {
		Bukkit.getPluginManager().disablePlugin(this);
	}
}

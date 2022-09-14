package com.lunatic205.reportdisabler.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import com.lunatic205.reportdisabler.AntiChatReport;

public class ChatListener implements Listener {
	private AntiChatReport plugin;

	public ChatListener(AntiChatReport plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		e.setMessage(e.getMessage() + " ");
	}
}

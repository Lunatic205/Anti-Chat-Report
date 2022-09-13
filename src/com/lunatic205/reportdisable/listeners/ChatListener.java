package com.lunatic205.reportdisable.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import com.lunatic205.reportdisable.MessageUnsigner;

public class ChatListener implements Listener {
	private MessageUnsigner plugin;

	public ChatListener(MessageUnsigner plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent e) {
		// Disabled at the moment, enabling it will cause players to crash after they use normal chat

		//String[] splitted = e.getMessage().split(" ");
		/*if (splitted.length > 2) {
			if (splitted[0].equals("/tell") || splitted[0].equals("/msg")) {
				boolean suc = false;
				for (Player p : Bukkit.getOnlinePlayers()) {
					if (p.getName().equals(splitted[1])) {
						suc = true;
						String msg = "";
						int skip = 2;
						for (String s : splitted) {
							if (skip != 0) {
								skip--;
								continue;
							}
							msg += s + " ";
						}
						e.getPlayer().sendMessage("§7§oYou whisper to " + Bukkit.getPlayer(splitted[1]).getDisplayName() + ": " + msg);
						Bukkit.getPlayer(splitted[1]).sendMessage("§7§o" + e.getPlayer().getDisplayName() + " whispers to you: " + msg);
						e.setCancelled(true);
						break;
					}
				}
				//if (!suc) {
				//	e.getPlayer().sendMessage("§cNo player was found");
				//}
			}
		}
		if (splitted.length > 1) {
			if (splitted[0].equals("/me")) {
				String msg = "";
				int skip = 1;
				for (String s : splitted) {
					if (skip > 0) {
						skip--;
						continue;
					}
					msg += s + " ";
				}
				for (Player p : Bukkit.getOnlinePlayers()) {
					p.sendMessage("* " + e.getPlayer().getDisplayName() + " " + msg);
				}
				e.setCancelled(true);
			}
			if (splitted[0].equals("/say")) {
				String msg = "";
				int skip = 1;
				for (String s : splitted) {
					if (skip > 0) {
						skip--;
						continue;
					}
					msg += s + " ";
				}
				for (Player p : Bukkit.getOnlinePlayers()) {
					p.sendMessage("[" + e.getPlayer().getDisplayName() + "] " + msg);
				}
				e.setCancelled(true);
			}
		}*/
	}

	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		e.setMessage(e.getMessage() + " ");
	}
}

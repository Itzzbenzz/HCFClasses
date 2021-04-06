package com.benzimmer123.hcfclasses.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.benzimmer123.hcfclasses.api.objects.PlayerClass;

public class ClassDisabledEvent extends Event implements Cancellable {
	
	private PlayerClass playerClass;
	private Player p;
	
	private boolean cancelled;

	public ClassDisabledEvent(Player p, PlayerClass playerClass) {
		this.p = p;
		this.playerClass = playerClass;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public PlayerClass getPlayerClass(){
		return playerClass;
	}
	
	public Player getPlayer() {
		return p;
	}

	private static final HandlerList handlers = new HandlerList();

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

}

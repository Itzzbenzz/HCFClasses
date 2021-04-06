package com.benzimmer123.hcfclasses.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.benzimmer123.hcfclasses.api.objects.HCFClass;

public class ClassEnabledEvent extends Event implements Cancellable  {
	
	private HCFClass hcfClass;
	private Player p;
	
	private boolean cancelled;

	public ClassEnabledEvent(Player p, HCFClass hcfClass) {
		this.p = p;
		this.hcfClass = hcfClass;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public HCFClass getHCFClass(){
		return hcfClass;
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

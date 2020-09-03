package yclans.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import yclans.models.Clan;
import yclans.models.ClanPlayer;

public class BankDepositEvent extends Event implements Cancellable {
	
    private static final HandlerList HANDLER_LIST = new HandlerList();
    private boolean cancelled = false;
    private Clan clan;
    private ClanPlayer cPlayer;
    private double amount;
    
    public BankDepositEvent(Clan clan, ClanPlayer cPlayer, double amount){
        this.clan = clan;
        this.cPlayer = cPlayer;
        this.amount = amount;
    }
    
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean value) {
        cancelled = value;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }

	public Clan getClan() {
		return clan;
	}

	public ClanPlayer getClanPlayer() {
		return cPlayer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
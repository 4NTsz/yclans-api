package yclans.models;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.bukkit.inventory.ItemStack;

import yclans.enums.Roles;

public class Clan {

	public String getTag() {
		return null;
	}

	public String getName() {
		return null;
	}

	public void setName(String name) {
	}

	public List<String> getMembers() {
		return null;
	}

	public double getMoney() {
		return 0.0;
	}

	public void setMoney(double money) {
	}

	public List<ItemStack> getItems() {
		return null;
	}

	public void setItems(List<ItemStack> items) {
	}

	public String getHome() {
		return null;
	}

	public void setHome(String home) {
	}

	public List<String> getAllies() {
		return null;
	}

	public void setAllies(List<String> allies) {
	}

	public List<String> getMoneyTransfers() {
		return null;
	}

	public List<String> getChestTransfers() {
		return null;
	}

	public Date getDate() {
		return null;
	}

	public String getLeader() {
		return null;
	}

	public String getColoredLetter1() {
		return null;
	}

	public void setColoredLetter1(String coloredLetter1) {
	}

	public String getColoredLetter2() {
		return null;
	}

	public void setColoredLetter2(String coloredLetter2) {
	}

	public String getColoredLetter3() {
		return null;
	}

	public void setColoredLetter3(String coloredLetter3) {
	}
	
	public String getColoredTag() {
		return getColoredLetter1() + getColoredLetter2() + getColoredLetter3();
	}

	public List<Roles> getPermKick() {
		return null;
	}

	public List<Roles> getPermChest() {
		return null;
	}

	public List<Roles> getPermBase() {
		return null;
	}

	public List<Roles> getPermDepositBank() {
		return null;
	}

	public List<Roles> getPermWithdrawBank() {
		return null;
	}

	public List<Roles> getPermInvite() {
		return null;
	}

	public List<Roles> getPermAddAlly() {
		return null;
	}

	public List<Roles> getPermRemoveAlly() {
		return null;
	}

	public List<Roles> getPermAddRival() {
		return null;
	}

	public List<Roles> getPermRemoveRival() {
		return null;
	}

	public List<Roles> getPermAddNewsletters() {
		return null;
	}

	public List<Roles> getPermFriendlyFire() {
		return null;
	}

	public boolean isFriendlyFireAlly() {
		return false;
	}

	public void setFriendlyFireAlly(boolean friendlyFireAlly) {
	}

	public boolean isFriendlyFireMember() {
		return false;
	}

	public void setFriendlyFireMember(boolean friendlyFireMember) {
	}

	public HashMap<String, String> getRivals() {
		return null;
	}

	public List<String> getNewsletters() {
		return null;
	}

	public boolean isAllyInvitation() {
		return false;
	}

	public void setAllyInvitation(boolean allyInvitation) {
	}

	public HashMap<String, Date> getInvitations() {
		return null;
	}

	public List<Roles> getPermBuyMarket() {
		return null;
	}
}

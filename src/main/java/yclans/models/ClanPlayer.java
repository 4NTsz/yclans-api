package yclans.models;

import java.util.Date;
import java.util.HashMap;

import yclans.enums.Roles;

public class ClanPlayer {
	
	public String getName() {
		return null;
	}
	
	public Roles getRole() {
		return null;
	}
	
	public void setRole(Roles role) {
	}
	
	public String getClanTag() {
		return null;
	}
	
	public void setClanTag(String clanTag) {
	}
	
	public boolean hasClan() {
		return false;
	}
	
	public Clan getClan() {
		return null;
	}

	public int getKills() {
		return 0;
	}

	public void setKills(int kills) {
	}

	public int getDeaths() {
		return 0;
	}

	public void setDeaths(int deaths) {
	}

	public HashMap<String, Date> getInvitations() {
		return null;
	}

	public boolean isBlockInvitations() {
		return false;
	}

	public void setBlockInvitations(boolean blockInvitations) {
	}
}

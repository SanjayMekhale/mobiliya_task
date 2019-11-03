package com.player.models;

import java.util.List;

public class PlayerResponse {

	private Player player;
	private List<Match> matchDetailsList;
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public List<Match> getMatchDetailsList() {
		return matchDetailsList;
	}
	public void setMatchDetailsList(List<Match> matchDetailsList) {
		this.matchDetailsList = matchDetailsList;
	}
	
	
	
}

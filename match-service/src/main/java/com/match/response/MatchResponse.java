package com.match.response;

import com.match.model.Match;
import com.match.model.Player;

public class MatchResponse {

	private Player player;
	private Match matches;
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Match getMatches() {
		return matches;
	}
	public void setMatches(Match matches) {
		this.matches = matches;
	}
	@Override
	public String toString() {
		return "MatchResponse [player=" + player + ", matches=" + matches + "]";
	}
	
	
}

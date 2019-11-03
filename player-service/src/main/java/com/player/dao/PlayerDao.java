package com.player.dao;

import com.player.models.PlayerResponse;

public interface PlayerDao {
	public PlayerResponse getPlayerMatches(Integer playerId)throws Exception;
}

package com.player.service;

import com.player.models.PlayerResponse;

public interface PlayerService {

	public PlayerResponse getPlayerMatches(Integer playerId)throws Exception;
}

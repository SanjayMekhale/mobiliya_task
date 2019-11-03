package com.match.dao;

import com.match.response.MatchResponse;

public interface MatchesDoa {

	public MatchResponse getPlayerMatchDetails(Integer playerId,Integer matchId) throws Exception;
}

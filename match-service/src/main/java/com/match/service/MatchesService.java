package com.match.service;

import com.match.response.MatchResponse;

public interface MatchesService {

	public MatchResponse getPlayerMatchDetails(Integer playerId,Integer matchId) throws Exception;
}

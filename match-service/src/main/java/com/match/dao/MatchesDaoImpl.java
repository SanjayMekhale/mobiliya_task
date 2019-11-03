package com.match.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.match.repository.MatchesRepository;
import com.match.repository.PlayerRepository;
import com.match.response.MatchResponse;

@Repository
public class MatchesDaoImpl implements MatchesDoa{

	private static final Logger logger = LogManager.getLogger(MatchesDaoImpl.class);

	@Autowired
	private MatchesRepository matchesRepository;
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@Override
	public MatchResponse getPlayerMatchDetails(Integer playerId, Integer matchId) throws Exception {
		MatchResponse matchResponse=new MatchResponse();
		logger.info("Method started : getPlayerMatchDetails()");
		try {
			matchResponse.setPlayer(playerRepository.findById(playerId).get());
			matchResponse.setMatches(matchesRepository.findById(matchId).get());
		} catch (Exception e) {
			System.out.print(e);
			logger.error("Exception while getting data Exception = " + e.getMessage());
		}
		return matchResponse;
	}

}

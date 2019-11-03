package com.match.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.match.dao.MatchesDoa;
import com.match.response.MatchResponse;
@Service
public class MatchesServiceImpl implements MatchesService{

	private static final Logger logger = LogManager.getLogger(MatchesServiceImpl.class);
	
	@Autowired
	private MatchesDoa matcheshDao;
	
	@Override
	public MatchResponse getPlayerMatchDetails(Integer playerId, Integer matchId) throws Exception {
		logger.info("Method started getPlayerMatchDetails()");
		try {
			return matcheshDao.getPlayerMatchDetails(playerId, matchId);
		} catch (Exception e) {
			logger.error("Exception occured while getting data, Exception = " + e.getMessage());
		}
		return null;
	}

}

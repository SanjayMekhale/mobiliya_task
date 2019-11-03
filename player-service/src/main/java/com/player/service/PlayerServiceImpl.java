package com.player.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.player.dao.PlayerDao;
import com.player.models.PlayerResponse;

@Service
public class PlayerServiceImpl implements PlayerService {
	private static final Logger logger = LogManager.getLogger(PlayerServiceImpl.class);
	@Autowired
	private PlayerDao playerDoa;

	@Override
	public PlayerResponse getPlayerMatches(Integer playerId) throws Exception {
		logger.info("Method started getPlayerMatches()");
		PlayerResponse player = new PlayerResponse();
		try {
			player = playerDoa.getPlayerMatches(playerId);
		} catch (Exception e) {
			System.out.println(e);
			logger.error("Exception occured while getting data, Exception = " + e.getMessage());
		}
		return player;
	}

}

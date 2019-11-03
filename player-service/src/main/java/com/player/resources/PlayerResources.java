package com.player.resources;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.player.models.PlayerResponse;
import com.player.service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerResources {

	private static final Logger logger = LogManager.getLogger(PlayerResources.class);
	@Autowired
	private PlayerService playerService;

	@RequestMapping("/getPlayerMatches/{playerId}")
	public PlayerResponse getPlayerMatches(@PathVariable("playerId") Integer playerId) {
		logger.info("Method started getPlayerMatches()");
		PlayerResponse player = null;
		try {
			player = playerService.getPlayerMatches(playerId);
		} catch (Exception e) {
			System.out.println(e);
			logger.error("Exception occured while getting data, Exception = " + e.getMessage());
		}
		return player;
	}

}

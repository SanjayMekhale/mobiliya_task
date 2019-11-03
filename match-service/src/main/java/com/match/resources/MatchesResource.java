package com.match.resources;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.match.response.MatchResponse;
import com.match.service.MatchesService;

@RestController
@RequestMapping("/matches")
public class MatchesResource {

	private static final Logger logger = LogManager.getLogger(MatchesResource.class);

	@Autowired
	private MatchesService matchesService;

	@RequestMapping("/getPlayerMatches/{playerId}/{matchId}")
	public MatchResponse getPlayerMatchesDetails(@PathVariable("playerId") Integer playerId,
			@PathVariable("matchId") Integer matchId) {
		logger.info("Method started : getPlayerMatchesDetails()");
		MatchResponse matchResponse = new MatchResponse();
		try {
			matchResponse = matchesService.getPlayerMatchDetails(playerId, matchId);
		} catch (Exception e) {
			logger.error("Exception occured while getting data, Exception = " + e.getMessage());
		}
		return matchResponse;
	}

}

package com.player.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.player.models.Match;
import com.player.models.PlayerResponse;
import com.player.repository.MatchesRepository;
import com.player.repository.PlayerRepository;

@Repository
public class PlayerDaoImpl implements PlayerDao{

	@Autowired
	private PlayerRepository playerRepository;
	@Autowired
	private MatchesRepository matchrepo;
	@Override
	public PlayerResponse getPlayerMatches(Integer playerId) throws Exception {
		PlayerResponse playerResponse=new PlayerResponse();
		try {
			playerResponse.setPlayer(playerRepository.findById(playerId).get());
			List<Match> matchList=matchrepo.findAllByplayerId(playerId);
			playerResponse.setMatchDetailsList(matchList);
		} catch (Exception e) {
			System.out.println(e);
		}
		return playerResponse;
	}

}

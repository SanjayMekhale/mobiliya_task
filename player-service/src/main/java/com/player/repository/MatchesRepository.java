package com.player.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.player.models.Match;

public interface MatchesRepository extends JpaRepository<Match, Integer>{

	@Query("select u from Match u where u.playerId =:playerId")
	List<Match> findAllByplayerId(@Param("playerId")Integer playerId);

}

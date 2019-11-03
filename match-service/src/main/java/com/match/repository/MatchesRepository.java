package com.match.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.match.model.Match;

public interface MatchesRepository extends JpaRepository<Match, Integer>{

}

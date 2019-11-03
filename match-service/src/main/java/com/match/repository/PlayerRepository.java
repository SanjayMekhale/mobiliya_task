package com.match.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.match.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>{

}

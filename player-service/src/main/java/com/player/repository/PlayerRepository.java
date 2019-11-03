package com.player.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.player.models.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>{

}

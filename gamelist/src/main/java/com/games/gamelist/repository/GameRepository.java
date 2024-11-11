package com.games.gamelist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.games.gamelist.model.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

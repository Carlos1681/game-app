package com.games.gamelist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.games.gamelist.model.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
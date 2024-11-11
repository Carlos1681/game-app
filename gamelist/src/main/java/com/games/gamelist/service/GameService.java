package com.games.gamelist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.games.gamelist.dto.GameMinDto;
import com.games.gamelist.model.Game;
import com.games.gamelist.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDto> findAllGames(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(r -> new GameMinDto(r)).toList();
	}

}

package com.games.gamelist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.games.gamelist.dto.GameDto;
import com.games.gamelist.dto.GameMinDto;
import com.games.gamelist.model.Game;
import com.games.gamelist.projection.GameMinProjection;
import com.games.gamelist.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDto> findAllGames(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(r -> new GameMinDto(r)).toList();
	}
	
	@Transactional(readOnly = true)
	public GameDto findGameById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDto(result);
		
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDto> findByList(Long id){
		List<GameMinProjection> result = gameRepository.searchByList(id);
		return result.stream().map(r -> new GameMinDto(r)).toList();
	}

}

package com.games.gamelist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.games.gamelist.dto.GameListDto;
import com.games.gamelist.model.GameList;
import com.games.gamelist.repository.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDto> findGameList(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(r -> new GameListDto(r)).toList();
	}


}

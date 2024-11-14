package com.games.gamelist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.games.gamelist.dto.GameListDto;
import com.games.gamelist.model.GameList;
import com.games.gamelist.projection.GameMinProjection;
import com.games.gamelist.repository.GameListRepository;
import com.games.gamelist.repository.GameRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDto> findGameList(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(r -> new GameListDto(r)).toList();
	}

	@Transactional
	public void moveGame(Long id, int sourceIndex, int destinationIndex) {
		List<GameMinProjection> list = gameRepository.searchByList(id);
		GameMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		
		for (int i = min; i <= max; i++) {
			gameListRepository.updateBelongingPosition(id, list.get(i).getId(), i);
		}
	}
}

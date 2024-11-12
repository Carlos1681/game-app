package com.games.gamelist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.games.gamelist.dto.GameListDto;
import com.games.gamelist.dto.GameMinDto;
import com.games.gamelist.service.GameListService;
import com.games.gamelist.service.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDto> findGameList(){
		
		List<GameListDto> result = gameListService.findGameList();
		
		return result;
	}
	
	@GetMapping(value = "/{id}/games")
	public List<GameMinDto> findByList(@PathVariable Long id){
		
		List<GameMinDto> result = gameService.findByList(id);
		
		return result;
	}

}

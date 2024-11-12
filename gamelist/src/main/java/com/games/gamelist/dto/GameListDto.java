package com.games.gamelist.dto;

import com.games.gamelist.model.GameList;

public class GameListDto {
	
	private Long id;
	private String name;
	
	public GameListDto() {
	}

	public GameListDto(GameList gameList) {
		id = gameList.getId();
		name = gameList.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}

package com.games.gamelist.dto;

import com.games.gamelist.model.Game;

public class GameMinDto {
	
	private Long id;
	private String title;
	private String year;
	private String imgUrl;
	private String shortDescription;
	
	
	
	public GameMinDto() {
	}

	public GameMinDto(Game game) {
		id = game.getId();
		title = game.getTitle();
		year = game.getYear();
		imgUrl = game.getImgUrl();
		shortDescription = game.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	

}

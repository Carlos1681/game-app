package com.games.gamelist.dto;

import com.games.gamelist.model.Game;
import com.games.gamelist.projection.GameMinProjection;

public class GameMinDto {
	
	private Long id;
	private String title;
	private Integer year;
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
	
	public GameMinDto(GameMinProjection gameMinProjection) {
		id = gameMinProjection.getId();
		title = gameMinProjection.getTitle();
		year = gameMinProjection.getGameYear();
		imgUrl = gameMinProjection.getImgUrl();
		shortDescription = gameMinProjection.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	

}

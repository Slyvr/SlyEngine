package com.slyvronline.engine.objects.game;

public class GameSessionFactory {

	public static GameSession load() {
		GameSession game = new GameSession();
		
		game.setOwner(null);
		
		
		return game;
	}
}

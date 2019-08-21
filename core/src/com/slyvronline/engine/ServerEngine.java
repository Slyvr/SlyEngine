package com.slyvronline.engine;

import java.io.IOException;

import com.slyvronline.engine.listeners.ServerListener;
import com.slyvronline.engine.objects.game.GameSession;

public class ServerEngine {

	private GameSession game;
	private String name;
	
	public ServerEngine() {
		name = "SERVER"+System.currentTimeMillis();
		game = new GameSession();
	}
	
	public void start() {
		Game.getKryoserver().start();
		try {
			Game.getKryoserver().bind(54555,54777);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Game.getKryoserver().addListener(new ServerListener());
	}

	public void update() {
		Game.getKryoserver().sendToAllTCP(this);
	}
	
	public GameSession getGame() {
		return game;
	}

	public void setGame(GameSession game) {
		this.game = game;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

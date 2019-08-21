package com.slyvronline.engine;

import java.io.IOException;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.slyvronline.engine.listeners.ClientListener;
import com.slyvronline.engine.objects.game.GameSession;
import com.slyvronline.engine.objects.menu.Menu;

public class ClientEngine {
	
	private GameSession game;
	private Menu currentMenu;
	private String name;
	
	public ClientEngine() {
		name = "ID"+System.currentTimeMillis();
		Game.getKryoclient().setName(name);
	}
	
	public void connect(){
		Game.getKryoclient().start();
		try {
			Game.getKryoclient().connect(5000, "192.168.80.18", 54555, 54777);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Game.getKryoclient().addListener(new ClientListener());
		Game.getKryoclient().sendTCP(this);
	}

	public void render() {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		Game.getGame().getSpriteBatch().begin();
		if (game != null) {
			game.render(Game.getGame().getSpriteBatch());
		}
		Game.getGame().getSpriteBatch().end();
		
		
		Game.getMenus().getSpriteBatch().begin();
		if (currentMenu != null) {
			currentMenu.render(Game.getMenus().getSpriteBatch());
		}
		Game.getMenus().getSpriteBatch().end();
	}
	
	public void update() {
		
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

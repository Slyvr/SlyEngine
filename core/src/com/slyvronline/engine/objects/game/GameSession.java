package com.slyvronline.engine.objects.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.Json.Serializable;
import com.badlogic.gdx.utils.JsonValue;
import com.slyvronline.engine.objects.GameObject;
import com.slyvronline.engine.objects.level.Level;

public class GameSession extends GameObject implements GameSessionInterface, Serializable {

	private ArrayList<Level> levels;
	private Level currentLevel;
	
	public GameSession() {
		levels = new ArrayList<Level>();
	}
	
	@Override
	public void update() {
		/*for(Level l : levels) {
			l.update(this);
		}*/
		currentLevel.update(this);
	}
	
	@Override
	public void render(SpriteBatch batch) {
		batch.begin();
		currentLevel.render(batch);
		batch.end();
	}

	@Override
	public void write(Json json) {
		
	}

	@Override
	public void read(Json json, JsonValue jsonData) {
		
	}

	public ArrayList<Level> getLevels() {
		return levels;
	}

	public void setLevels(ArrayList<Level> levels) {
		this.levels = levels;
	}

	public Level getCurrentLevel() {
		return currentLevel;
	}

	public void setCurrentLevel(Level currentLevel) {
		this.currentLevel = currentLevel;
	}
	
	
}

package com.slyvronline.engine.objects.game;

import java.util.ArrayList;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.Json.Serializable;
import com.badlogic.gdx.utils.JsonValue;
import com.slyvronline.engine.objects.GameObject;
import com.slyvronline.engine.objects.level.Level;

public class GameSession extends GameObject implements GameSessionInterface, Serializable {

	private ArrayList<Level> levels;

	@Override
	public void update() {
		for(Level l : levels) {
			l.update(this);
		}
	}

	@Override
	public void write(Json json) {
		
	}

	@Override
	public void read(Json json, JsonValue jsonData) {
		
	}
}

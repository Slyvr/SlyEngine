package com.slyvronline.engine.objects.level;

import java.util.ArrayList;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.Json.Serializable;
import com.badlogic.gdx.utils.JsonValue;
import com.slyvronline.engine.objects.GameObject;
import com.slyvronline.engine.objects.chunk.Chunk;
import com.slyvronline.engine.objects.game.GameSession;

public class Level extends GameObject implements LevelInterface, Serializable {

	private ArrayList<Chunk> chunks;
	private Chunk currentChunk;

	
	public Level() {
		chunks = new ArrayList<Chunk>();
	}
	
	@Override
	public void update(GameSession game) {
		/*for(Chunk c : chunks) {
			c.update(this);
		}*/
		currentChunk.update(this);
	}

	@Override
	public void write(Json json) {
		
	}

	@Override
	public void read(Json json, JsonValue jsonData) {
		
	}

	public ArrayList<Chunk> getChunks() {
		return chunks;
	}

	public void setChunks(ArrayList<Chunk> chunks) {
		this.chunks = chunks;
	}

	public Chunk getCurrentChunk() {
		return currentChunk;
	}

	public void setCurrentChunk(Chunk currentChunk) {
		this.currentChunk = currentChunk;
	}
	
	
}

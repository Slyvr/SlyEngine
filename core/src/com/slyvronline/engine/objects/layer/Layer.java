package com.slyvronline.engine.objects.layer;

import java.util.ArrayList;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.Json.Serializable;
import com.badlogic.gdx.utils.JsonValue;
import com.slyvronline.engine.objects.GameObject;
import com.slyvronline.engine.objects.chunk.Chunk;
import com.slyvronline.engine.objects.entity.Entity;

public class Layer extends GameObject implements LayerInterface, Serializable {

	private ArrayList<Entity> entities;

	public Layer() {
		entities = new ArrayList<Entity>();
	}
	
	@Override
	public void update(Chunk c) {
		for(Entity e : entities) {
			e.update(this);
		}
	}

	@Override
	public void write(Json json) {
		
	}

	@Override
	public void read(Json json, JsonValue jsonData) {
		
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}
	
	
}

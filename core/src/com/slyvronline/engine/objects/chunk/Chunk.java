package com.slyvronline.engine.objects.chunk;

import java.util.ArrayList;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.Json.Serializable;
import com.badlogic.gdx.utils.JsonValue;
import com.slyvronline.engine.objects.GameObject;
import com.slyvronline.engine.objects.layer.Layer;
import com.slyvronline.engine.objects.level.Level;

public class Chunk extends GameObject implements ChunkInterface, Serializable {

	private ArrayList<Layer> layers;
	private Layer currentLayer;

	public Chunk() {
		layers = new ArrayList<Layer>();
	}
	
	@Override
	public void update(Level l) {
		for(Layer layer : layers) {
			layer.update(this);
		}
	}

	@Override
	public void write(Json json) {
		
	}

	@Override
	public void read(Json json, JsonValue jsonData) {
		
	}

	public ArrayList<Layer> getLayers() {
		return layers;
	}

	public void setLayers(ArrayList<Layer> layers) {
		this.layers = layers;
	}

	public Layer getCurrentLayer() {
		return currentLayer;
	}

	public void setCurrentLayer(Layer currentLayer) {
		this.currentLayer = currentLayer;
	}
	
	
}

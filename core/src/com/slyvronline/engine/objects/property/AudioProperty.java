package com.slyvronline.engine.objects.property;

import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.slyvronline.engine.objects.GameObject;

public class AudioProperty extends Property{

	private Music music;
	private float pitch;
	private float volumn;
	private boolean loop;
	private float pan;
	private float position;
	private String name;
	private String author;
	
	@Override
	public void update(GameObject owner) {
		
	}
	
	@Override
	public void write(Json json) {
		
	}
	
	@Override
	public void read(Json json, JsonValue jsonData) {
		
	}
}

package com.slyvronline.engine.objects.menu;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.Json.Serializable;
import com.badlogic.gdx.utils.JsonValue;
import com.slyvronline.engine.objects.GameObject;
import com.slyvronline.engine.objects.entity.Entity;

public class Menu extends GameObject implements MenuInterface, Serializable{
	
	private ArrayList<Menu> subMenus;
	private ArrayList<Entity> entities;
	
	@Override
	public void update(GameObject obj) {
		for(Entity e : entities)
			e.update(this);
		
		for(Menu m : subMenus)
			m.update(this);
		
	}

	@Override
	public void render(SpriteBatch batch) {
		for(Entity e : entities)
			e.render(batch);
		
		for(Menu m : subMenus)
			m.render(batch);
		
	}
	
	@Override
	public void write(Json json) {
		
	}

	@Override
	public void read(Json json, JsonValue jsonData) {
		
	}

	public ArrayList<Menu> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(ArrayList<Menu> subMenus) {
		this.subMenus = subMenus;
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}
	
}

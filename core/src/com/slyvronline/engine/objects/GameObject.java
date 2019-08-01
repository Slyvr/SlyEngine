package com.slyvronline.engine.objects;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class GameObject implements GameObjectInterface {

	private GameObject owner;
	private String name;
	private int id;
	

	@Override
	public void update(GameObject obj) {
		
	}

	@Override
	public void render(SpriteBatch batch) {
		
	}

	@Override
	public void create(GameObject owner) {
		this.setOwner(owner);
	}

	public GameObject getOwner() {
		return owner;
	}

	public void setOwner(GameObject owner) {
		this.owner = owner;
	}
}

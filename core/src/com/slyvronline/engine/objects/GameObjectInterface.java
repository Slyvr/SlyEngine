package com.slyvronline.engine.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface GameObjectInterface {

	public void update(GameObject obj);
	public void render(SpriteBatch batch);
	public void create(GameObject owner);
}

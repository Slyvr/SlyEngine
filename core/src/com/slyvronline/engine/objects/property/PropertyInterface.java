package com.slyvronline.engine.objects.property;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.slyvronline.engine.objects.entity.Entity;

public interface PropertyInterface {
	
	void update(Entity e);
	void render(SpriteBatch batch);

}

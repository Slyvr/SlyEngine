package com.slyvronline.slyengine;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.slyvronline.slyengine.utils.ConfigurationFinder;
import com.slyvronline.slyengine.utils.database.DatabaseTest;

public class SlyEngine implements ApplicationListener {
	
	@Override
	public void create() {
		ConfigurationFinder.getConfig("");
		new DatabaseTest();
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void render() {
		
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}

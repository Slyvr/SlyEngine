package com.slyvronline.engine.system;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.slyvronline.engine.objects.game.GameSession;
import com.slyvronline.engine.objects.game.GameSessionFactory;
import com.slyvronline.engine.objects.property.AudioProperty;
import com.slyvronline.engine.objects.property.RenderableProperty;

public class GameSystem {

	private OrthographicCamera gameCamera;
	private SpriteBatch spriteBatch;
	private float defaultScreenWidth;
	private float defaultScreenHeight;
	private Rectangle viewport;
	private float stateTime;
	private ArrayList<AudioProperty> audio;
	private ArrayList<RenderableProperty> renderable;
	private boolean paused;
	
	public GameSystem() {
		spriteBatch = new SpriteBatch();
		
		//session = GameSessionFactory.load();
	}

	public OrthographicCamera getGameCamera() {
		return gameCamera;
	}

	public void setGameCamera(OrthographicCamera gameCamera) {
		this.gameCamera = gameCamera;
	}

	public SpriteBatch getSpriteBatch() {
		return spriteBatch;
	}

	public void setSpriteBatch(SpriteBatch spriteBatch) {
		this.spriteBatch = spriteBatch;
	}

	public float getDefaultScreenWidth() {
		return defaultScreenWidth;
	}

	public void setDefaultScreenWidth(float defaultScreenWidth) {
		this.defaultScreenWidth = defaultScreenWidth;
	}

	public float getDefaultScreenHeight() {
		return defaultScreenHeight;
	}

	public void setDefaultScreenHeight(float defaultScreenHeight) {
		this.defaultScreenHeight = defaultScreenHeight;
	}

	public Rectangle getViewport() {
		return viewport;
	}

	public void setViewport(Rectangle viewport) {
		this.viewport = viewport;
	}

	public float getStateTime() {
		return stateTime;
	}

	public void setStateTime(float stateTime) {
		this.stateTime = stateTime;
	}

	public ArrayList<AudioProperty> getAudio() {
		return audio;
	}

	public void setAudio(ArrayList<AudioProperty> audio) {
		this.audio = audio;
	}

	public ArrayList<RenderableProperty> getRenderable() {
		return renderable;
	}

	public void setRenderable(ArrayList<RenderableProperty> renderable) {
		this.renderable = renderable;
	}

	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}
	
}

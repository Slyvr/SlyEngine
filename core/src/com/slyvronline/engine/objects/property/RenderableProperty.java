package com.slyvronline.engine.objects.property;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.Json.Serializable;
import com.badlogic.gdx.utils.JsonValue;

public class RenderableProperty extends Property{

	private Texture texture;
	private TextureRegion currentFrame;
	private TextureRegion[] regions;
	private float x;
	private float y;
	private float originX;
	private float originY;
	private float width;
	private float height;
	private float scaleX;
	private float scaleY;
	private float rotation;
	private int srcX;
	private int srcY;
	private int srcWidth;
	private int srcHeight;
	private boolean flipX;
	private boolean flipY;
	private Color color;
	
	@Override
	public void render(SpriteBatch batch) {
		if (color != null) {
			batch.setColor(color);
		}
		
		if (texture != null) {
			batch.draw(
					texture,
					x,
					y,
					originX,
					originY,
					width,
					height,
					scaleX,
					scaleY,
					rotation,
					srcX,
					srcY,
					srcWidth,
					srcHeight,
					flipX,
					flipY);
		}
		
		//Always reset color back to default
		batch.setColor(Color.WHITE);
	}
	
	@Override
	public void write(Json json) {
		
	}
	
	@Override
	public void read(Json json, JsonValue jsonData) {
		
	}

	public Texture getTexture() {
		return texture;
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
	}

	public TextureRegion getCurrentFrame() {
		return currentFrame;
	}

	public void setCurrentFrame(TextureRegion currentFrame) {
		this.currentFrame = currentFrame;
	}

	public TextureRegion[] getRegions() {
		return regions;
	}

	public void setRegions(TextureRegion[] regions) {
		this.regions = regions;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getOriginX() {
		return originX;
	}

	public void setOriginX(float originX) {
		this.originX = originX;
	}

	public float getOriginY() {
		return originY;
	}

	public void setOriginY(float originY) {
		this.originY = originY;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getScaleX() {
		return scaleX;
	}

	public void setScaleX(float scaleX) {
		this.scaleX = scaleX;
	}

	public float getScaleY() {
		return scaleY;
	}

	public void setScaleY(float scaleY) {
		this.scaleY = scaleY;
	}

	public float getRotation() {
		return rotation;
	}

	public void setRotation(float rotation) {
		this.rotation = rotation;
	}

	public int getSrcX() {
		return srcX;
	}

	public void setSrcX(int srcX) {
		this.srcX = srcX;
	}

	public int getSrcY() {
		return srcY;
	}

	public void setSrcY(int srcY) {
		this.srcY = srcY;
	}

	public int getSrcWidth() {
		return srcWidth;
	}

	public void setSrcWidth(int srcWidth) {
		this.srcWidth = srcWidth;
	}

	public int getSrcHeight() {
		return srcHeight;
	}

	public void setSrcHeight(int srcHeight) {
		this.srcHeight = srcHeight;
	}

	public boolean isFlipX() {
		return flipX;
	}

	public void setFlipX(boolean flipX) {
		this.flipX = flipX;
	}

	public boolean isFlipY() {
		return flipY;
	}

	public void setFlipY(boolean flipY) {
		this.flipY = flipY;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}

package com.slyvronline.slyengine.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


public class Renderable {

	private int id;
	//Rendering data
	private Animation animation;
	private Texture sheet;
	private TextureRegion[] frames;
	private int frameColumns;
	private int frameRows;
	private TextureRegion currentFrame;
	private float stateTime;
	private SpriteBatch spriteBatch;
	
	//Object data
	private float x;
	private float y;
	private float originX;
	private float originY;
	private float width;
	private float height;
	private float scaleX;
	private float scaleY;
	private float rotation;
	
	public Renderable(String path, String filename){
		sheet = new Texture(Gdx.files.internal(path+"/"+filename));
		TextureRegion[][] tempRegion = TextureRegion.split(sheet, sheet.getWidth()/frameColumns, sheet.getHeight()/frameRows);
		frames = new TextureRegion[frameColumns * frameRows];
		int index = 0;
		for(int i=0; i<frameRows; i++){
			for(int j=0; j<frameColumns; j++){
				frames[index++] = tempRegion[i][j];
			}
		}
		animation = new Animation(0.025f, frames);
		stateTime = 0f;
		spriteBatch = new SpriteBatch();
		
		x=0;y=0;originX=0;originY=0;
		width=currentFrame.getRegionWidth();
		height=currentFrame.getRegionHeight();
		scaleX=0;scaleY=0;rotation=0;
	}
	
	public void render(){
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
		stateTime += Gdx.graphics.getDeltaTime();
		currentFrame = animation.getKeyFrame(stateTime, true);
		spriteBatch.begin();
		spriteBatch.draw(currentFrame, x, y, originX, originY, width, height, scaleX, scaleY, rotation);
		spriteBatch.end();
	}

}

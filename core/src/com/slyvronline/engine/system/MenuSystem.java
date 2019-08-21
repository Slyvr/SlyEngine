package com.slyvronline.engine.system;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.slyvronline.engine.objects.menu.Menu;

public class MenuSystem {

	private ArrayList<Menu> menus;
	private SpriteBatch spriteBatch;
	
	public MenuSystem() {
		menus = new ArrayList<Menu>();
		spriteBatch = new SpriteBatch();
	}

	public ArrayList<Menu> getMenus() {
		return menus;
	}

	public void setMenus(ArrayList<Menu> menus) {
		this.menus = menus;
	}

	public SpriteBatch getSpriteBatch() {
		return spriteBatch;
	}

	public void setSpriteBatch(SpriteBatch spriteBatch) {
		this.spriteBatch = spriteBatch;
	}
	
	
}

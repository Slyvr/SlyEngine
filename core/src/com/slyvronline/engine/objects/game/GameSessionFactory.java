package com.slyvronline.engine.objects.game;

import com.slyvronline.engine.objects.chunk.Chunk;
import com.slyvronline.engine.objects.entity.Entity;
import com.slyvronline.engine.objects.layer.Layer;
import com.slyvronline.engine.objects.level.Level;
import com.slyvronline.engine.objects.property.Property;

public class GameSessionFactory {

	public static GameSession load() {
		GameSession game = new GameSession();
		
		game.setOwner(null);
		
		Level level = new Level();
		level.setOwner(game);
		game.getLevels().add(level);
		game.setCurrentLevel(level);
		
		Chunk chunk = new Chunk();
		chunk.setOwner(level);
		level.getChunks().add(chunk);
		level.setCurrentChunk(chunk);
		
		Layer layer = new Layer();
		layer.setOwner(chunk);
		chunk.getLayers().add(layer);
		chunk.setCurrentLayer(layer);
		
		Entity ent = new Entity();
		ent.setOwner(layer);
		layer.getEntities().add(ent);
		
		Property prop = new Property();
		prop.setOwner(ent);
		ent.getProperties().add(prop);
		
		return game;
	}
}

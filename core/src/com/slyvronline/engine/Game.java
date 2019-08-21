package com.slyvronline.engine;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Server;
import com.slyvronline.engine.objects.chunk.Chunk;
import com.slyvronline.engine.objects.entity.Entity;
import com.slyvronline.engine.objects.game.GameSession;
import com.slyvronline.engine.objects.game.GameSessionFactory;
import com.slyvronline.engine.objects.layer.Layer;
import com.slyvronline.engine.objects.level.Level;
import com.slyvronline.engine.objects.property.AudioProperty;
import com.slyvronline.engine.objects.property.CollidableProperty;
import com.slyvronline.engine.objects.property.RenderableProperty;
import com.slyvronline.engine.system.GameSystem;
import com.slyvronline.engine.system.MenuSystem;

public class Game extends ApplicationAdapter {
	
	//Systems are globally used variables, methods, etc that can be used throughout the application
	//They should contain data for initial load and reference to entities or objects that can be copied
	private static GameSystem game;
	private static MenuSystem menus;
	
	//Client will store all local renderable entities and send inputs to server
	private static ClientEngine client;
	
	//Server will only be used if running single player or hosting a multiplayer server
	//Server should maintain inputs from clients and manage all updates to the game
	private static ServerEngine server;
	
	//Kryoserver handles connection details with server
	private static Server kryoserver;
	
	//Kryoclient handles connection details with client
	private static Client kryoclient;
	
	@Override
	public void create () {
		game = new GameSystem();
		menus = new MenuSystem();
		
		kryoclient = new Client();
		client = new ClientEngine();
		registerKryoClasses(kryoclient.getKryo());
		//client.connect();
	}

	@Override
	public void render () {
		
		if (client != null) {
			client.render();
			client.update();
		}
		
		if (server != null) {
			server.update();
		}
		
		
	}
	
	public void registerKryoClasses(Kryo kryo) {
		kryo.register(ClientEngine.class);
		kryo.register(ServerEngine.class);
		kryo.register(GameSession.class);
		kryo.register(ArrayList.class);
		kryo.register(Entity.class);
		kryo.register(Chunk.class);
		kryo.register(Layer.class);
		kryo.register(Level.class);
		
		//Properties
		kryo.register(RenderableProperty.class);
		kryo.register(AudioProperty.class);
		kryo.register(CollidableProperty.class);
	}
	
	@Override
	public void dispose () {
		
	}

	public static GameSystem getGame() {
		return game;
	}

	public static void setGame(GameSystem game) {
		Game.game = game;
	}

	public static MenuSystem getMenus() {
		return menus;
	}

	public static void setMenus(MenuSystem menus) {
		Game.menus = menus;
	}

	public static ClientEngine getClient() {
		return client;
	}

	public static void setClient(ClientEngine client) {
		Game.client = client;
	}

	public static ServerEngine getServer() {
		return server;
	}

	public static void setServer(ServerEngine server) {
		Game.server = server;
	}

	public static Server getKryoserver() {
		return kryoserver;
	}

	public static void setKryoserver(Server kryoserver) {
		Game.kryoserver = kryoserver;
	}

	public static Client getKryoclient() {
		return kryoclient;
	}

	public static void setKryoclient(Client kryoclient) {
		Game.kryoclient = kryoclient;
	}
	
	
	
}

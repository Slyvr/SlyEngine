package com.slyvronline.engine.listeners;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import com.slyvronline.engine.ServerEngine;

public class ClientListener extends Listener {

	@Override
	public void received (Connection connection, Object object) {
		/*if (object instanceof SomeResponse) {
			SomeResponse response = (SomeResponse)object;
			System.out.println(response.text);
		}*/
		
		if (object instanceof ServerEngine) {
			ServerEngine server = (ServerEngine)object;
			
		}
		else {
			System.out.println("CLIENT: Something received.  Unknown: "+object.getClass());
		}
	}
}

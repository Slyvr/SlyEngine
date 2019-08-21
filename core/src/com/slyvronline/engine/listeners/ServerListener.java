package com.slyvronline.engine.listeners;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import com.slyvronline.engine.ClientEngine;

public class ServerListener extends Listener {
	
	@Override
	public void received (Connection connection, Object object) {
		/*if (object instanceof SomeRequest) {
			SomeRequest request = (SomeRequest)object;
			System.out.println(request.text);
			
			SomeResponse response = new SomeResponse();
			response.text = "Thanks";
			connection.sendTCP(response);
		}*/
		
		if (object instanceof ClientEngine) {
			ClientEngine client = (ClientEngine)object;
			System.out.println(client.getName() + " SERVER RECEIVED FROM "+connection.getRemoteAddressTCP().getHostName());
		}
	}

}

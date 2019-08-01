package com.slyvronline.engine.objects.entity;

import java.util.ArrayList;

import com.slyvronline.engine.objects.GameObject;
import com.slyvronline.engine.objects.layer.Layer;
import com.slyvronline.engine.objects.property.Property;

public class Entity extends GameObject implements EntityInterface{

	private int id;
	private ArrayList<Property> properties;

	@Override
	public void update(Layer l) {
		for(Property p : properties) {
			p.update(this);
		}
	}
	
}

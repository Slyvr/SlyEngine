package com.slyvronline.engine.objects.entity;

import java.util.ArrayList;

import com.slyvronline.engine.objects.GameObject;
import com.slyvronline.engine.objects.layer.Layer;
import com.slyvronline.engine.objects.property.Property;

public class Entity extends GameObject implements EntityInterface{
	
	private ArrayList<Property> properties;

	public Entity() {
		properties = new ArrayList<Property>();
	}
	
	@Override
	public void update(Layer l) {
		for(Property p : properties) {
			p.update(this);
		}
	}

	public ArrayList<Property> getProperties() {
		return properties;
	}

	public void setProperties(ArrayList<Property> properties) {
		this.properties = properties;
	}
	
	
}

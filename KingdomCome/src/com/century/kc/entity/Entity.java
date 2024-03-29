package com.century.kc.entity;

import java.util.Random;

import com.century.kc.graphics.Screen;
import com.century.kc.level.Level;

public abstract class Entity {

	public int x, y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	
	public void update(){
	}
	
	public void render(Screen screen) {
		
	}

	public void remove(){
		// remove from level
		removed = true;
	}
	
	public boolean isRemoved(){
		return removed;
	}
	
	public void init(Level level){
		this.level = level;
	}
	
}

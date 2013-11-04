package com.century.kc.level.tile;

import com.century.kc.graphics.Screen;
import com.century.kc.graphics.Sprite;

public class Wall extends Tile {

	public Wall(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
	
	public boolean solid() {
		return true;
	}
	
}

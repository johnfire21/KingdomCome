package com.century.kc.level;

import com.century.kc.graphics.Screen;
import com.century.kc.level.tile.Tile;

public class Level {

	protected int width, height;
	protected int[] tilesInt;
	protected int[] tiles;

	public Level(int width, int height) {
		this.width = width;
		this.height = height;
		tilesInt = new int[width * height];
		generateLevel();
	}

	public Level(String path) {
		loadLevel(path);
		generateLevel();
	}

	protected void generateLevel() {
	}

	protected void loadLevel(String path) {
	}
	

	public void update() {
	}

	private void time() {

	}

	public void render(int xScroll, int yScroll, Screen screen) {
		// setting offset
		screen.setOffset(xScroll, yScroll);
		// corner pins
		int x0 = xScroll >> 4;
		int x1 = (xScroll + screen.width + 16) >> 4;
		int y0 = yScroll >> 4;
		int y1 = (yScroll + screen.height + 16) >> 4;

		for (int y = y0; y < y1; y++) {
			for (int x = x0; x < x1; x++) {
				getTile(x, y).render(x, y, screen);
			}
		}
	}

	public Tile getTile(int x, int y) {
		// grass = 0x00ff00
		// flower = 0xff0000
		// wall = 0x7f7f00
		// floor = 0xFF000000
		if (x < 0 || y < 0 || x >= width || y >= height) return Tile.voidTile;
		if(tiles[x+y*width] == 0xFF00FF00) return Tile.grass2;
		if(tiles[x+y*width] == 0xffff0000) return Tile.flowerTileAlt;
		if(tiles[x+y*width] == 0xfffe0000) return Tile.grass;
		if(tiles[x+y*width] == 0xff7f7f00) return Tile.wall;
		if(tiles[x+y*width] == 0xFF000000) return Tile.wood;
		if(tiles[x+y*width] == 0xff0000FF) return Tile.tree;
		return Tile.voidTile;
	}
}

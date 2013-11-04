package com.century.kc.level.tile;

import com.century.kc.graphics.Screen;
import com.century.kc.graphics.Sprite;

public class Tile {
	
	public int x, y;
	public Sprite sprite;
	
	public static Tile grass = new GrassTile(Sprite.grass);
	public static Tile flowerTile = new FlowerTile(Sprite.flowerSprite);
	public static Tile flowerTileAlt = new FlowerTileAlt(Sprite.flowerSpriteAlt);
	public static Tile grass2 = new GrassTile2(Sprite.grass2);
	public static Tile grass3 = new GrassTile3(Sprite.grass3);
	public static Tile wood = new Wood(Sprite.wood);
	public static Tile wall = new Wall(Sprite.wall);
	public static Tile tree = new Tree(Sprite.tree);
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}
	
	public void render(int x, int y, Screen screen) {
		
	}
	
	public boolean solid() {
		return false;
	}
	
}

package com.century.kc.graphics;

public class Sprite {

	public int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;
	
	public static Sprite grass = new Sprite(16, 0, 0, SpriteSheet.tiles);
	public static Sprite voidSprite = new Sprite(16, 0x70C8A0);
	public static Sprite flowerSprite = new Sprite(16, 0, 1, SpriteSheet.tiles);
	public static Sprite flowerSpriteAlt = new Sprite(16, 1, 1, SpriteSheet.tiles);
	public static Sprite grass2 = new Sprite(16, 2, 0, SpriteSheet.tiles);
	public static Sprite grass3 = new Sprite(16, 4, 0, SpriteSheet.tiles);
	public static Sprite wood = new Sprite(16, 1, 2, SpriteSheet.tiles);
	public static Sprite wall = new Sprite(16, 2, 2, SpriteSheet.tiles);
	
	public static Sprite tree = new Sprite(16, 2, 1, SpriteSheet.tiles);
	
	public static Sprite player_up = new Sprite(32, 1, 7, SpriteSheet.tiles);
	public static Sprite player_down = new Sprite(32, 1, 4, SpriteSheet.tiles);
	public static Sprite player_left = new Sprite(32, 1, 5, SpriteSheet.tiles);
	public static Sprite player_right = new Sprite(32, 1, 6, SpriteSheet.tiles);
	
	public static Sprite player_up_1 = new Sprite(32, 2, 7, SpriteSheet.tiles);
	public static Sprite player_down_1 = new Sprite(32, 2, 4, SpriteSheet.tiles);
	public static Sprite player_left_1 = new Sprite(32, 2, 5, SpriteSheet.tiles);
	public static Sprite player_right_1 = new Sprite(32, 2, 6, SpriteSheet.tiles);
	
	public static Sprite player_up_2 = new Sprite(32, 0, 7, SpriteSheet.tiles);
	public static Sprite player_down_2 = new Sprite(32, 0, 4, SpriteSheet.tiles);
	public static Sprite player_left_2 = new Sprite(32, 0, 5, SpriteSheet.tiles);
	public static Sprite player_right_2 = new Sprite(32, 0, 6, SpriteSheet.tiles);

	public Sprite(int size, int x, int y, SpriteSheet sheet) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		this.x = x * size;
		this.y = y * size;
		this.sheet = sheet;
		load();
	}
	
	public Sprite(int size, int color) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		setColor(color);
	}

	private void setColor(int color) {
		for (int i = 0; i < SIZE*SIZE; i++) {
			pixels[i] = color;
		}
		
	}

	private void load() {
		for (int y = 0; y < SIZE; y++) {
			for (int x = 0; x < SIZE; x++) {
				pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
			}
		}
	}
}
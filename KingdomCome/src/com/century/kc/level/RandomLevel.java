package com.century.kc.level;

import java.util.Random;

public class RandomLevel extends Level {

	private static final Random random = new Random();

	public RandomLevel(int width, int height) {
		super(width, height);
	}

	
	protected void generateLevel(){
		for (int y = 0; y < height; y++){
			int block = -1;
			int side = -1;
			int block2 = -1;
			for (int x = 0; x < width; x++){
				if(block < 64) block++;
				if(side < 64) side++;
				if(block2 < 64) block2++;
				tilesInt[block] = 50;
				tilesInt[64*side] = 50;
				tilesInt[(64*side)+63] = 50;
				tilesInt[block2+(4031)] = 50;
				tilesInt[4032+63] = 50;
				tilesInt[x+y*width] = random.nextInt(50);
			}
		}
	}
}

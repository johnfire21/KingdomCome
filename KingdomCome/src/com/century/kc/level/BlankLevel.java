package com.century.kc.level;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.century.kc.level.tile.Tile;

public class BlankLevel extends Level {

	public BlankLevel(String path) {
		super(path);
	}

	protected void loadLevel(String path) {
		try {
			BufferedImage image = ImageIO.read(BlankLevel.class.getResource(path));
			int w = width = image.getWidth();
			int h = height = image.getHeight();
			tiles = new int[w*h];
			image.getRGB(0, 0, w, h, tiles, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Could not load level file!");
		}
	}
	
	// grass = 0x00ff00
	// flower = 0xff0000
	//wall = 0x7f7f00
	protected void generateLevel() {
			
		}
	}

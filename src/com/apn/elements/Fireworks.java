package com.apn.elements;

import java.awt.Graphics;

public class Fireworks {

	int screenWidth;
	int screenHeight;
	
	int width;
	int height;
	
	private int currentX;
	private int currentY;
	
	public Fireworks(int screenWidth, int screenHeight, int width, int height) {
		this.screenHeight = screenHeight;
		this.screenWidth = screenWidth;
		
		this.width = width;
		this.height = height;
	}
	
	public int getX() {
		return currentX;
	}
	
	public int getY() {
		return currentY;
	}
	
	
	
}

package com.apn.elements;

public class Fireball {
	
	int width;
	int height;
	
	private int currentX;
	private int currentY;
	
	public Fireball(int width, int height) {
		this.width = width;
		this.height = height;
		
		currentX = 0;
		currentY = 0;
	}

	public int getX() {
		return currentX;
	}
	
	public int getY() {
		return currentY;
	}
}

package com.apn.elements;

public class Cannon {

	private int width;
	private int height;
	
	private int currentX;
	private int currentY;
	
	public Cannon(int width, int height) {
		this.width = width;
		this.height = height;
		
		currentX = width/2;
		currentY = 0;
	}
	
	public int getX() {
		return currentX;
	}
	
	public int getY() {
		return currentY;
	}
	
	
	
	
}

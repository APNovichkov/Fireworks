package com.apn.elements;

import java.awt.Graphics;

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
	
	public void drawMe(Graphics g, int x, int y, int width, int length) {
		g.fillRect(x, y, width, length);
	}
	
	
}

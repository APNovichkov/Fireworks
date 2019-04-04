package com.apn.elements;

import java.awt.Graphics;

public class Fireworks {

	int width;
	int height;
	
	private int currentX;
	private int currentY;
	
	public Fireworks(int width, int height) {
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
	
	public void drawMe(Graphics g, int x, int y, int width, int length) {
		g.fillOval(x, y, width, length);
	}
}

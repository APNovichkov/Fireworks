package com.apn.elements;

import java.awt.Graphics;

public class Fireball {
	
	int screenWidth;
	int screenHeight;
	
	int width;
	int height;
	
	private int x;
	private int y;
	
	//for now
	private int time = 0;
	
	public Fireball(int screenWidth, int screenHeight, int width, int height) {
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		
		this.width = width;
		this.height = height;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setup() {
		//do we even need it
	}
	
	
}

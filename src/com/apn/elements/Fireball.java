package com.apn.elements;

import java.awt.Graphics;

public class Fireball {
	
	int screenWidth;
	int screenHeight;
	
	int width;
	int height;
	
	private boolean isInFlight = false;
	
	private int x;
	private int y;
	
	private Cannon cannon;
	
	//for now
	private int time = 0;
	
	public Fireball(int screenWidth, int screenHeight, int width, int height, Cannon cannon) {
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		
		this.width = width;
		this.height = height;
		
		this.cannon = cannon;
	}

	
	public boolean isFired(){
		//update later with button or something
		return true;
	}
	
	public boolean isInFlight() {
		//update soon with correct logic
		return isInFlight;
		
	}
	
	
	
	
	
	public void setIsInFlight(boolean value) {
		isInFlight = value;
	}
	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setX(int value) {
		x = value;
	}
	
	public void setY(int value) {
		y = value;
	}
	
	public void setup() {
		this.x = cannon.getX();
		this.y = cannon.getY() - height;
	}
	
	
}

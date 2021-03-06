package com.apn.elements;

import java.awt.Graphics;

public class Cannon {

	private int screenWidth;
	private int screenHeight;
	
	private int width;
	private int height;
	
	private int x;
	private int y;
	
	final private int Y_STARTING_OFFSET = 22;
	
	//for now
	private int time = 0;
	
	public Cannon(int screenWidth, int screenHeight, int width, int height) {
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
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setup() {
		
		System.out.println("cannon height: " + height);
		
		x = screenWidth/2;
		y = screenHeight - Y_STARTING_OFFSET - height;
		
		System.out.println("cannon y: " + y);
		
	
	}
	
	
	
	
	
}

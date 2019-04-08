package com.apn.application;

import java.awt.Graphics;

import javax.swing.JFrame;

import com.apn.elements.Cannon;
import com.apn.elements.Fireball;
import com.apn.elements.Fireworks;

public class MainFrame extends JFrame{

	private static final long serialVersionUID = 1L;

	int width;
	int height;
	
	int speed;
	int delay;
	
	
	
	ScreenPanel sPanel;
	
	public MainFrame(int width, int height, int speed, int delay, int cannonSize, int fireballSize, int fireworksSize) {
		this.width = width;
		this.height = height;
		this.speed = speed;
		this.delay = delay;
		
		ScreenPanel sPanel = new ScreenPanel(WIDTH, HEIGHT, 
				new Cannon(WIDTH, HEIGHT,cannonSize,cannonSize), 
				new Fireball(WIDTH, HEIGHT, fireballSize, fireballSize), 
				new Fireworks(WIDTH, HEIGHT, fireworksSize, fireworksSize), 
				speed, delay);
		
		this.add(sPanel);
	}
	
	
	
	
}

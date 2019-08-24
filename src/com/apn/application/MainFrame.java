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
	
	public MainFrame(int width, int height, int speed, int delay, int cannonHeight, int cannonWidth, int fireballSize, int fireworksSize) {
		this.width = width;
		this.height = height;
		this.speed = speed;
		this.delay = delay;
		
		Cannon newCannon = new Cannon(width, height,cannonWidth, cannonHeight);
		Fireball newFireball = new Fireball(width, height, fireballSize, fireballSize, newCannon);
		Fireworks newFireworks = new Fireworks(width, height, fireworksSize, fireworksSize);
		
		ScreenPanel sPanel = new ScreenPanel(width, height, newCannon, newFireball, newFireworks, speed, delay);
		
		this.add(sPanel);
	}
	
	
	
	
}

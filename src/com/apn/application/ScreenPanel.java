package com.apn.application;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.xml.crypto.dsig.CanonicalizationMethod;

import com.apn.elements.Cannon;
import com.apn.elements.Fireball;
import com.apn.elements.Fireworks;

public class ScreenPanel extends JPanel{

	private static final long serialVersionUID = 1L;

	private final int G_ACCELERATION = 10;
	private final int MILLISECONDS_IN_SECOND = 1000;
	
	private int speed;
	private int delay;
	
	private Cannon cannon;
	private Fireball fireball;
	private Fireworks fireworks;
	
	private int width;
	private int height;
	
	int test_counter = 0;
	
	public ScreenPanel(int width, int height, Cannon cannon, Fireball fireball, Fireworks fireworks, int speed, int delay) {
		this.cannon = cannon;
		this.fireball = fireball;
		this.fireworks = fireworks;
		this.speed = speed;
		this.delay = delay;
		this.width = width;
		this.height = height;
		
		cannon.setup();
		
		//fireball.setup();
		//fireworks.setup();
	}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
	
		
		//update fireball position
		if(fireball.isFired()) {
			fireball.setup();
			
			if(fireball.isInFlight()) {
				
				System.out.println("y position of fireball: " + fireball.getY());
				
				fireball.setY(fireball.getY() - 1);
				
			}
			
			fireball.setIsInFlight(true);
		}
		
		
		
		//update fireworks position
		
		
		//draw cannon
		g.setColor(Color.red);
		g.fillRect(cannon.getX(), cannon.getY(), cannon.getWidth(), cannon.getHeight());
		
		//draw fireball
		g.setColor(Color.blue);
		g.fillOval(fireball.getX(), fireball.getY(), fireball.getWidth(), fireball.getHeight());
		
		//draw fireworks
	}
	
	
}

package com.apn.application;

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
		
		cannon.setup();
		
		//fireball.setup();
		//fireworks.setup();
	}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
	
		
		
		
		
		
		//draw cannon
		g.fillOval(cannon.getX(), cannon.getY(), cannon.getWidth(), cannon.getHeight());
	}
	
	
}

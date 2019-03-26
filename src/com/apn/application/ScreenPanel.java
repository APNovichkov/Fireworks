package com.apn.application;

import java.awt.Graphics;

import javax.swing.JPanel;

import com.apn.elements.Cannon;
import com.apn.elements.Fireball;
import com.apn.elements.Fireworks;

public class ScreenPanel extends JPanel{

	private static final long serialVersionUID = 1L;

	private final double G_ACCELERATION = 9.8;
	
	private Cannon cannon;
	private Fireball fireball;
	private Fireworks fireworks;
	
	private int width;
	private int height;
	
	
	public ScreenPanel(int width, int height, Cannon cannon, Fireball fireball, Fireworks fireworks) {
		this.cannon = cannon;
		this.fireball = fireball;
		this.fireworks = fireworks;
	}
	
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
	
		
		
		
		
	}
	
	public int getXFromAngle(int x) {
		return 0;
	}
	
	public int getYWithGravity(int y) {
		return 0;
	}
}

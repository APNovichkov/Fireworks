package com.apn.application;

import javax.swing.JFrame;

import com.apn.elements.Cannon;
import com.apn.elements.Fireball;
import com.apn.elements.Fireworks;

public class RunApplication {

	final static int SPEED=100;
	final static int WIDTH=500;
	final static int HEIGHT=500;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ScreenPanel sPanel = new ScreenPanel(WIDTH, HEIGHT, new Cannon(WIDTH, HEIGHT), new Fireball(WIDTH, HEIGHT), new Fireworks(WIDTH, HEIGHT));
		MainFrame mFrame = new MainFrame(WIDTH, HEIGHT, sPanel);
		
		
		
		mFrame.setSize(500, 500);
		mFrame.add(sPanel);
		mFrame.setVisible(true);
		mFrame.setTitle("Particle IO");
		mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		while(true) {
			mFrame.repaint();
			Thread.sleep(SPEED);
		}
		
	}

}

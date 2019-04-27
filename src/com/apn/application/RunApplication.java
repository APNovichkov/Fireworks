package com.apn.application;

import javax.swing.JFrame;

import com.apn.elements.Cannon;
import com.apn.elements.Fireball;
import com.apn.elements.Fireworks;

public class RunApplication {

	final static int DELAY=10;
	final static int SPEED=100; //in pixels per second
	final static int WIDTH=500;
	final static int HEIGHT=500;
	
	final static int CANNON_SIZE = 20;
	final static int FIREBALL_SIZE = 15;
	final static int FIREWORKS_SIZE = 10;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		MainFrame mFrame = new MainFrame(WIDTH, HEIGHT, SPEED, DELAY, CANNON_SIZE, FIREBALL_SIZE, FIREWORKS_SIZE);
		
		mFrame.setSize(WIDTH, HEIGHT);
		mFrame.setVisible(true);
		mFrame.setTitle("Particle IO");
		mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		while(true) {
			mFrame.repaint();
			Thread.sleep(DELAY);
		}
		
		
	}

}

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
	
	final static int CANNON_HEIGHT = 50;
	final static int CANNON_WIDTH = 10;
	final static int FIREBALL_SIZE = CANNON_WIDTH;
	final static int FIREWORKS_SIZE = FIREBALL_SIZE/2;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		MainFrame mFrame = new MainFrame(WIDTH, HEIGHT, SPEED, DELAY, CANNON_HEIGHT, CANNON_WIDTH, FIREBALL_SIZE, FIREWORKS_SIZE);
		
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

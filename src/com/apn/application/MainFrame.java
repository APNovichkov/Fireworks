package com.apn.application;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

	private static final long serialVersionUID = 1L;

	int width;
	int height;
	
	ScreenPanel sPanel;
	
	public MainFrame(int width, int height, ScreenPanel sPanel) {
		this.width = width;
		this.height = height;
		this.sPanel = sPanel;
	}
	
	
	

}

package sample.view;

import javax.swing.JFrame;

import sample.controller.appController;

public class Frame extends JFrame {

	private Panel basePanel;
	//This creates a frame object to be called by the controller
	public Frame(appController baseController) {
		basePanel = new Panel(baseController);
		setupFrame();
	}
	
	//This sets up the frame for viewing
	
	private void setupFrame() {
		this.setContentPane(basePanel);
		this.setSize(500,500);
		this.setVisible(true);
	}
}

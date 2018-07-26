package sample.controller;

import sample.view.Frame;

public class appController {

	private Frame appFrame;
		
	public void start(){
		appFrame = new Frame(this);
	}
}

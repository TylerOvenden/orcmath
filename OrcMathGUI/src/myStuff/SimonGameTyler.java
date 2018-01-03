package myStuff;

import guiTeacher.GUIApplication;

public class SimonGameTyler extends GUIApplication {
 
	
	public SimonGameTyler(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		 SimonScreenTyler s = new SimonScreenTyler(getWidth(), getHeight());
		setScreen(s);
		
	}

	public static void main(String[] args) {
		SimonGameTyler sample = new SimonGameTyler(800, 550);
		Thread go = new Thread(sample);
		go.start();
	}
}

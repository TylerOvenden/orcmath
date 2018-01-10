package myStuff;

import guiTeacher.GUIApplication;

public class SimonGameTyler extends GUIApplication {
 
	
	public static SimonGameTyler game;
	public static SimonScreenTyler screen;

	public SimonGameTyler(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		screen = new SimonScreenTyler(getWidth(), getHeight());
		setScreen(screen);
	}

	public static void main(String[] args) {
		game = new SimonGameTyler(800, 550);
		Thread go = new Thread(game);
		go.start();
	}
}

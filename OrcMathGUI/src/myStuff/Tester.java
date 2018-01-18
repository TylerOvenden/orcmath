package myStuff;

import guiTeacher.GUIApplication;

public class Tester extends GUIApplication{


	public Tester(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	public static void main(String[] args) {
		Tester yes = new Tester(1000, 1000);
		Thread go = new Thread(yes);
		go.start();
	}

	@Override
	public void initScreen() {
		TestAssignment test = new TestAssignment(getWidth(), getHeight());
		setScreen(test);
	}

}
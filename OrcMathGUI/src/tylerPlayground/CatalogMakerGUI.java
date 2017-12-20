package tylerPlayground;

import guiTeacher.GUIApplication;
import guiTeacher.userInterfaces.Screen;

public class CatalogMakerGUI extends GUIApplication {
	//the window
	public CatalogMakerGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		CatalogScreen s = new CatalogScreen(getWidth(), getHeight());
		setScreen(s);
		
	}
	//thread used to update the screen 
	//components take in x,y width and height
	//add components through initAllObjects
	public static void main(String[] args) {
		CatalogMakerGUI sample = new CatalogMakerGUI(800, 550);
		Thread go = new Thread(sample);
		go.start();
	}

}

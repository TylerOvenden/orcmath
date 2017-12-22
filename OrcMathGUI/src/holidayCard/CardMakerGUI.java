package holidayCard;

import guiTeacher.GUIApplication;
import guiTeacher.userInterfaces.Screen;

public class CardMakerGUI extends GUIApplication {
	//the window
	static CardMakerGUI card;
	static CardMakerScreen s1;
	static CardMakerScreen2 s2;
	
	public CardMakerGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		 s1 = new CardMakerScreen(getWidth(),getHeight());
		setScreen(s1);
		 s2 = new CardMakerScreen2(getWidth(),getHeight());
	
		
		
	}
	//thread used to update the screen 
	//components take in x,y width and height
	//add components through initAllObjects
	public static void main(String[] args) {
		 card = new CardMakerGUI(600, 450);
		Thread go = new Thread(card);
		go.start();
	}

}

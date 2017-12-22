package holidayCard;

import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.FileOpenButton;
import guiTeacher.components.Graphic;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CardMakerScreen2 extends FullFunctionScreen implements FileRequester {


	private Button addButton;

	private FileOpenButton open;
	private CardMakerScreen holiday;
	
	public CardMakerScreen2(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
	
		Graphic level = new Graphic(20, 50, (int) (getWidth()*0.5),(int) (getHeight()*0.8), "resources/christmas.png");
		viewObjects.add(level);
		addButton = new Button(400,200,150,90,"go back",new Action() {
			
			@Override
			public void act() {
				CardMakerGUI.card.setScreen(CardMakerGUI.s1);
				
			}
		});
		viewObjects.add(addButton);
	}







	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFile(File f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JFrame getWindow() {
		// TODO Auto-generated method stub
		return null;
	}

}

package myStuff;

import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.*;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class TestAssignment extends FullFunctionScreen{

	private TextArea notification;
	private Button winButton;
	private Button loseButton;
	
	public TestAssignment(int width, int height) {
		super(width, height);
	}



	@Override
	public void initAllObjects(List<Visible> viewObjects) {
winButton = new Button(30,30,100,50,"Win", new Action() {
			
			public void act() {
				notification.setText("You have won!");
				loseButton.setEnabled(false);
			}
		});
		
		loseButton = new Button(90,90,100,50,"Lose", new Action() {
			
			public void act() {
				notification.setText("You have lost!");
				winButton.setEnabled(false);
			}
		});
		
		notification = new TextArea(100, 30, 200, 100, "Did you win or did you lose?");
		viewObjects.add(winButton);
		viewObjects.add(loseButton);
		viewObjects.add(notification);
	}
	
}
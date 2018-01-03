package myStuff;

import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenTyler extends ClickableScreen{
	private int round = 0;
	private int sequenceIndex;
	private int sequenceLength = 0;
	private int lastSelectedButton;
	private boolean userMove;
	private ArrayList<Sequences> simonSequence;
	
	public SimonScreenTyler(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		TextLabel currentRound = new TextLabel(100, 120,200 ,40 , "The current round is ");
		viewObjects.add(currentRound);
	}

}

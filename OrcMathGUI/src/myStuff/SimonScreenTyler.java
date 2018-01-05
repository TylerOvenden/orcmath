package myStuff;

import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenTyler extends ClickableScreen{
	private TextLabel label;
	private ButtonInterfaceTyler[] button;
	private ProgressInterfaceTyler progress;
	private ArrayList<MoveInterfaceTyler> arr;
	private int round = 0;
	private int sequenceIndex;
	private int sequenceLength = 0;
	private int lastSelectedButton;
	private boolean userMove;
	private ArrayList<MoveInterfaceTyler> simonSequence;
	
	public SimonScreenTyler(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}
	public void run(){
	    label.setText("");
	    nextRound();
	}

	private void nextRound() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		TextLabel currentRound = new TextLabel(100, 120,200 ,40 , "The current round is ");
		viewObjects.add(currentRound);
		addButtons();
		for(ButtonInterfaceTyler b: buttons){ 
		    viewObjects.add(b); 
		}
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		simonSequence = new ArrayList<MoveInterfaceTyler>();
		//add 2 moves to start
		lastSelectedButton = -1;
		simonSequence.add(randomMove());
		simonSequence.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}


	private MoveInterfaceTyler randomMove() {
		int bIndex = (int)(Math.random()*buttons.length);
		while(bIndex == lastSelectedButton){
        bIndex = (int)(Math.random()*buttons.length);
		}
		return getMove(bIndex);
		}

		/**
		Placeholder until partner finishes implementation of MoveInterface
		 */
	private MoveInterfaceTyler getMove(int bIndex) {
		return null;
		}



	private ProgressInterfaceTyler getProgress() {
		// TODO Auto-generated method stub
		
		    return null; 
	}

	private void addButtons() {
		// TODO Auto-generated method stub
		
	}

}

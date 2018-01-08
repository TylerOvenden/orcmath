package myStuff;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenTyler extends ClickableScreen{
	private TextLabel label;
	private ButtonInterfaceTyler[] button;
	private ProgressInterfaceTyler progress;
	private ArrayList<MoveInterfaceTyler> arr;
	private int round = 0;
	private ProgressInterfaceTyler info;
	private int sequenceIndex;
	private int sequenceLength = 0;
	private int lastSelectedButton;
	private boolean userMove;
	private boolean acceptingInput;
	private ArrayList<MoveInterfaceTyler> simonSequence;
	
	public SimonScreenTyler(int width, int height) {
		super(width, height);
		Thread app = new Thread();
		app.start();
	}
	public void run(){
	    label.setText("");
	    nextRound();
	}

	private void nextRound() {
		acceptingInput = false;
		round++;
		MoveInterfaceTyler move = randomMove();
		simonSequence.add(move);
		info.setRound(round);
		info.setSequenceSize(simonSequence.size());
		changeText("Simon's turn");
		label.setText("");
		playSequence();
		changeText("Your turn");
		acceptingInput = true;
		sequenceIndex = 0;
		
	}
	private void changeText(String s) {
		label.setText(s);
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	private void playSequence() {
		ButtonInterfaceTyler b = getAButton();
		for(MoveInterfaceTyler c: simonSequence){ 
		    if(b != null) {
		    		b.dim();
		    }
		    b = c.getButton();
		    b.highlight();
		    int sleepTime = (1/round)/round;
		    try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    b.dim();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		TextLabel currentRound = new TextLabel(100, 120,200 ,40 , "The current round is ");
		viewObjects.add(currentRound);
		addButtons();
		for(ButtonInterfaceTyler b: button){ 
		    viewObjects.add(b); 
		}
		progress = getProgress();
		label = new TextLabel(200,250,250,50,"Let's play Simon!");
		simonSequence = new ArrayList<MoveInterfaceTyler>();
		//add 2 moves to start
		lastSelectedButton = -1;
		simonSequence.add(randomMove());
		simonSequence.add(randomMove());
		round = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}


	private MoveInterfaceTyler randomMove() {
		int bIndex = (int)(Math.random()*button.length);
		while(bIndex == lastSelectedButton){
        bIndex = (int)(Math.random()*button.length);
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
		int numberOfButtons = 6;
		button = new ButtonInterfaceTyler[numberOfButtons];
		Color[] bColors = {Color.yellow,Color.orange,Color.magenta,Color.cyan,Color.blue,Color.gray};
		for(int i = 0; i < numberOfButtons;i++) {
			final ButtonInterfaceTyler b = getAButton();
			b.setColor(Color.red);
			b.setX(40);
			b.setY(60);
			b.setAction(new Action() {
				public void act() {
					if(acceptingInput) {
						Thread blink = new Thread (new Runnable() {
							public void run() {
								b.highlight();
								try {
									Thread.sleep(800);
									} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									}
									b.dim();
							}
						});
							blink.start();
						}
					}	
				});
			button[i] = b;
	
			if(b == simonSequence.get(sequenceIndex).getButton()) {
				sequenceIndex++;
			}else {
				ProgressInterfaceTyler.gameOver();
			}
			if(sequenceIndex == simonSequence.size()){ 
			    Thread nextRound = new Thread(); 
			    nextRound.start(); 
			}
		
		}
		
	}
	private ButtonInterfaceTyler getAButton() {
		// TODO Auto-generated method stub
		return null;
	}

}

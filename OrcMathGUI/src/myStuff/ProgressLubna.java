package myStuff;

import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class ProgressLubna extends Component implements ProgressInterfaceTyler {

	private int round;
	private int sequenceSize;
	private ProgressInterfaceTyler progress;
	private boolean lose;
	

	public ProgressLubna(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gameOver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getProgress() {
		
		
	}

	@Override
	public void setRound(int i) {
		this.round = i;
		
	}

	@Override
	public void setSequenceSize(int i) {
		this.sequenceSize = i;
		
	}

	@Override
	public void updateSequenceCount(int size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRoundNumber(int roundNumber) {
		// TODO Auto-generated method stub
		
	}

}

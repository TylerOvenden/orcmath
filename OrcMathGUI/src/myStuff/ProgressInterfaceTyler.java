package myStuff;

import guiTeacher.interfaces.Visible;

public interface ProgressInterfaceTyler extends Visible{

	void gameOver();
	void getProgress();
	void setRound(int i);
	void setSequenceSize(int i);
	void updateSequenceCount(int size);
	void updateRoundNumber(int roundNumber);
	


}

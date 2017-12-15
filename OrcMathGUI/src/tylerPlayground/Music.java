package tylerPlayground;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Music extends Component {
	String album;
	String artist;
	int releaseDate;
	


	public Music(String artist,String album, int releaseDate) {
		super(40, 40, 75, 86);
		this.album = album;
		this.artist = artist;
		this.releaseDate = releaseDate;
		//addSequence("resources/sprite.png",40, 0,0,60,86,7);
		//Thread animation = new Thread(this);
		//animation.start();
		update();
	}
	public String toString() {
		return album + " , " + album + " , " + releaseDate;
		
		
	}
	
	public void update(Graphics2D g) {
	//	super.update(g);

	}

}

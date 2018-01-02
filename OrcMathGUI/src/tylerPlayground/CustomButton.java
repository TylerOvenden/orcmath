package tylerPlayground;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class CustomButton extends Button {

	private String string1;
	private String string2;
	private Color color;
	
	public CustomButton(int x, int y) {
		super(x,y,150,100, "",null);
	}
	public void drawButton(Graphics2D g, boolean hover) {
		g.setColor(Color.blue);
		//location of a string is bottom left of the first letter
		g.drawString("abc", 25, 25);
		g.drawString("jeff", 50, 49);
		g.setColor(Color.red);
		g.drawRect(30, 50, 20, 40);
		g.fillRect(30, 50, 20, 40);
	}
	void updateString1(String string) {
		
	}

	void updateString2(String string) {
		
	}

	void setIconColor(Color color) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

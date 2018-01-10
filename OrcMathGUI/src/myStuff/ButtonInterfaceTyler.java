package myStuff;

import java.awt.Color;

import guiTeacher.components.Action;
import guiTeacher.interfaces.Clickable;
public interface ButtonInterfaceTyler extends Clickable {
	void setColor(Color color);
	void setAction(Action a);
	void highlight();
	void dim();
	void getAButton();
	void normalizeButton();
	void highlightButton();
	void setX(double d);
	void setY(double d);
}

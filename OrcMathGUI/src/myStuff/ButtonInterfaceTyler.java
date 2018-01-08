package myStuff;

import guiTeacher.interfaces.Clickable;
public interface ButtonInterfaceTyler extends Clickable {
	void setColor(Color color);
	
	void setAction(Action a);

	void highlight();

	void dim();
}

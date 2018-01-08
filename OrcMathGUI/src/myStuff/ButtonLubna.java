package myStuff;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiTeacher.components.*;
import guiTeacher.components.Button;

public class ButtonLubna extends Button implements ButtonInterfaceTyler {

	private Color og;
	private boolean hover;
	public ButtonLubna(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, "", null);
	
		//drawButton(g, hover);
	}

	@Override
	public void setColor(Color color) {
		this.setColor(color);
		color = og;
		this.hover = false;
	}

	@Override
	public void highlight() {
		this.setColor(og);
		if(hover==false) {
			setColor(og.brighter());
		}
		
	}

	@Override
	public void dim() {
		this.setColor(og);
		if(hover==false) {
			setColor(og.darker());
		}
		
	}
	public void drawButton(Graphics2D g, boolean hover){

		if(hover) {
			g.setColor(getForeground());
		}
		else {
			g.setColor(Color.GRAY);
		}

	}


}

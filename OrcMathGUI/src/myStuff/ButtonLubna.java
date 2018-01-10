package myStuff;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import guiTeacher.components.Action;
import guiTeacher.components.Button;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiTeacher.components.*;
import guiTeacher.components.Button;

public class ButtonLubna extends Button implements ButtonInterfaceTyler {

	private Color newColor;
	private Color currentColor;
	
	public ButtonLubna(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text, color, action);
		setColor(color);
		setActiveBorderColor(Color.BLACK);
		update();
	}
	@Override
	public void highlightButton() {
		currentColor = Color.gray;
		update();
	}
	@Override
	public void normalizeButton() {
		currentColor = newColor;
		update();
	}
	@Override
	public void setColor(Color color) {
		newColor = color;
		currentColor = color;
		update();
	}
	@Override
	public void setX(double x) {
		setX((int)x);
	}
	@Override
	public void setY(double y) {
		setY((int)y);
	}
	
	public void drawButton(Graphics2D g, boolean hover){
		Ellipse2D ellipse = new Ellipse2D.Double(0, 0, getWidth(), getHeight());
		g.setColor(currentColor);
		g.draw(ellipse);
		g.fill(ellipse);
	}
	public void update() {
		BufferedImage hoverImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics2D hoverG = hoverImage.createGraphics();
		applyStyles(hoverG);
		drawButton(hoverG, true);
		super.update();
	}
	@Override
	public void highlight() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dim() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getAButton() {
		// TODO Auto-generated method stub
		
	}
	
}
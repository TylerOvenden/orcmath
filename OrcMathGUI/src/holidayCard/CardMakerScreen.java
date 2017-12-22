package holidayCard;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.FileOpenButton;
import guiTeacher.components.Graphic;
import guiTeacher.components.StyledComponent;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;




	public class CardMakerScreen extends FullFunctionScreen implements FileRequester {


		private Button addButton;
		private TextField description;
		private FileOpenButton open;
		private CardMakerScreen holiday;
		
		public CardMakerScreen(int width, int height) {
			super(width, height);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void initAllObjects(List<Visible> viewObjects) {
			StyledComponent.setButtonOutline(true);
			setCustomFont();
			
			Graphic level = new Graphic(0, 0, "resources/space ghost.jpg");
			viewObjects.add(level);
			TextField header = new TextField(150,40,300,50,"Happy Holidays!!!");
			viewObjects.add(header);
			//addButton = new Button(220,300,80,90,"open",new Action()
			addButton = new Button(230,310,100,50,"open",Color.green,new Action()
					{
				
				@Override
				public void act() {
					CardMakerGUI.card.setScreen(CardMakerGUI.s2);
					
				}
			});
	
			viewObjects.add(addButton);
		}


		private void setCustomFont(){
			
			try {
				File fontFile = new File("resources//christmaseve.ttf");
				Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(48f);
				StyledComponent.setBaseFont(font);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setFile(File f) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public JFrame getWindow() {
			// TODO Auto-generated method stub
			return null;
		}

	}


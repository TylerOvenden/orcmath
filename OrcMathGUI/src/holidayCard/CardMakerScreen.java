package holidayCard;

import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.FileOpenButton;
import guiTeacher.components.Graphic;
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
		
			Graphic level = new Graphic(140, 72, "resources/space ghost.jpg");
			viewObjects.add(level);
			TextField header = new TextField(300,40,130,30,"Happy Holidays!!!");
			viewObjects.add(header);
			addButton = new Button(300,450,150,90,"open",new Action() {
				
				@Override
				public void act() {
					CardMakerGUI.card.setScreen(CardMakerGUI.s2);
					
				}
			});
			viewObjects.add(addButton);
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


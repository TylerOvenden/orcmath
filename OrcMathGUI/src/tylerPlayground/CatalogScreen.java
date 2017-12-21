package tylerPlayground;

import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.TextArea;
import guiTeacher.components.*;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen implements FileRequester {
	private TextArea test;
	private TextField artistField;
	private TextField albumField;
	private TextField dateField;
	private Button addButton;
	private Button saveButton;
	private Button deleteButton;
	private FileOpenButton open;
	private CatalogMaker musicCat;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		
		test = new TextArea(40,350,200,75,"This is where text goes");
		viewObjects.add(test);
		artistField = new TextField(40, 40, 200, 30, "artist", "");
		viewObjects.add(artistField);
		albumField = new TextField(100, 100, 200, 50, "album", "");
		viewObjects.add(albumField);
		dateField = new TextField(100, 170, 200, 50, "release date", "");
		viewObjects.add(dateField);
		
		dateField.setInputType(TextField.INPUT_TYPE_NUMERIC);
		
		
		addButton = new Button(40,450,150,90,"add",new Action() {
			
			@Override
			public void act() {
				addClicked();
				
			}
		});
		viewObjects.add(addButton);
		deleteButton = new Button(90,450,150,90,"delete",new Action() {
			
			@Override
			public void act() {
				addDelete();
				
			}
		});
		viewObjects.add(deleteButton);
		saveButton = new Button(90,450,150,90,"delete",new Action() {
			
			@Override
			public void act() {
				addDelete();
				
			}
		});
		viewObjects.add(saveButton);
		open = new FileOpenButton(90, 350, 40, 40, null, this);
		viewObjects.add(open);
	}

	protected void addDelete() {
		test.setText("deleted");
		
	}

	protected void addClicked() {
		Music b = new Music(artistField.getText(),albumField.getText(),Integer.parseInt(dateField.getText()));
		test.setText(test+"\n"+b );
		musicCat.addAlbum();
		artistField.setText("");
		albumField.setText("");
		dateField.setText("");
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

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
	private TextField descriptionField;
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
		descriptionField = new TextField(40, 40, 200, 30, "Jeff", "jeffery");
		viewObjects.add(descriptionField);
		descriptionField = new TextField(100, 100, 200, 50, "sonic youth", "daydream nation");
		viewObjects.add(descriptionField);
		descriptionField = new TextField(100, 170, 200, 50, "wavves", "wavvves");
		viewObjects.add(descriptionField);
		descriptionField = new TextField(100, 250, 200, 50, "fugazi", "repeater");
		descriptionField.setInputType(TextField.INPUT_TYPE_NUMERIC);
		viewObjects.add(descriptionField);
		
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
		Music b = new Music(descriptionField.getText(),descriptionField.getText(),Integer.parseInt(descriptionField.getText()));
		test.setText(test+"\n"+b );
		musicCat.addAlbum();
		//title.setText(" ");
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

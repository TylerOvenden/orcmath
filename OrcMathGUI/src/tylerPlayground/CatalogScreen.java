package tylerPlayground;

import java.util.List;

import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {

	private TextField descriptionField;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		descriptionField = new TextField(40, 40, 200, 30, "Jeff", "jeffery");
		viewObjects.add(descriptionField);
		descriptionField = new TextField(100, 100, 200, 50, "sonic youth", "daydream nation");
		viewObjects.add(descriptionField);
		descriptionField = new TextField(100, 170, 200, 50, "wavves", "wavvves");
		viewObjects.add(descriptionField);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

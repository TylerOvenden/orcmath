package tylerPlayground;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CatalogMaker {

	public static Scanner in;

	private ArrayList<Music> musicList;

	public CatalogMaker() {
		//instantiate the catalog
		musicList = new ArrayList<Music>();
	}

	public static void main(String[] args){
		CatalogMaker maker = new CatalogMaker();
		in = new Scanner(System.in);
		maker.menu();
	}

	private static void displayMessage(String message){
		System.out.println(message);
	}

	private void menu() {
		displayMessage("Would you like to \"load\" a save file or \"create\" a new list? ");
		String[] allowedEntry = {"load","create"};
		String input = getEntry(allowedEntry);
		if(input.equals("load")){
			load();
		}else{
			create();
		}
	}

	private void create() {
		
		boolean running = true;
		while(running){
			showCatalog();
			displayMessage("Would you like to \"add\", \"save\", or \"quit\"?");
			String[] allowedEntry = {"add","save","quit"};
			String selection = getEntry(allowedEntry);
			if(selection.equals("add")){
				add();
			}else if(selection.equals("save")){
				save();
			}else{
				running = false;
			}
		}
	}

	public void add() {
		String title = null;
		String author = null;
		int releaseDate = 0;
		displayMessage("Please enter the artist");
		author = getStringInput();
		displayMessage("Please enter the album");
		title = getStringInput();
		displayMessage("Please enter when it was released");
		releaseDate = getIntegerInput();
		addMusic(new Music(title, author, releaseDate));
	}

	private int getIntegerInput() {
		String text = in.nextLine();
		int value = 0;
		boolean valid = false;
		while(!valid){
			try{
				value = Integer.parseInt(text);
				valid = true;
			}catch(NumberFormatException nfe){
				displayMessage("You must enter an integer.");
			}
		}
		return value;
	}
	private static String getStringInput(){
		String text = in.nextLine();
		while(text.isEmpty()){
			displayMessage("You must enter a non-empty String.");
			text = in.nextLine();
		}
		return text;
	}


	private void addMusic(Music music){
		musicList.add(music);
	}

	public void save() {
		try{    
			FileWriter fw=new FileWriter("MusicCatalog.csv");
			for(Music b: musicList){
				fw.write(b+"\n");    	
			}

			fw.close();    
			System.out.println("Success! File \"MusicCatalog.csv\" saved!");
		}catch(IOException e){
			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");
		}
	}

	private static String getEntry(String[] allowedEntry) {
		String input = in.nextLine();
		while(!matchesEntry(input, allowedEntry)){
			displayMessage("You must enter one of these words: ");
			for(String s: allowedEntry){
				System.out.print(s+" ");
			}
			displayMessage("\n");
			input = in.nextLine();
		}
		return input;
	}

	private static boolean matchesEntry(String text, String[] list){
		for(String l: list){
			if(l.equals(text))return true;
		}
		return false;
	}

	private  void showCatalog() {
		displayMessage("The catalog contains these Music:\n");
		for(Music b: musicList){
			displayMessage("   "+b.toString()+"\n");
		}
	}

	private void load() {
		String fileName = "";
		//empty the catalog to prepare for a new load
		musicList = new ArrayList<Music>();
		//use this boolean to control the while loop. The user should have multiple chances to enter a correct filename
		boolean opened = false;
		while(!opened){
			try {
				System.out.println("Enter a file to open");
				fileName = in.nextLine();
				FileReader fileReader = new FileReader(new File(fileName));
				String line = "";
				//a BufferedReader enables us to read teh file one line at a time
				BufferedReader br = new BufferedReader(fileReader);
				while ((line = br.readLine()) != null) {

					String[] param = line.split(",");
					//add a new Music for each line in the save file
					musicList.add(new Music(param[0],param[1],Integer.parseInt(param[2])));



				}
				br.close();
				opened = true;
			}catch (IOException e) {
				System.out.println("The file name you specified does not exist.");
			}
		}
		create();

	}

	public void addAlbum() {
		String title = null;
		String author = null;
		int releaseDate = 0;
		displayMessage("Please enter the artist");
		author = getStringInput();
		displayMessage("Please enter the album");
		title = getStringInput();
		displayMessage("Please enter when it was released");
		releaseDate = getIntegerInput();
		addMusic(new Music(title, author, releaseDate));
		
	}
}

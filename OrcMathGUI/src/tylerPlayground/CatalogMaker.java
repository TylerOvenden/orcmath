package tylerPlayground;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogMaker {

	private static ArrayList<Music> musicList;
	 Scanner s = new Scanner(System.in);
	String musicInput = s.nextLine();
	
	public CatalogMaker() {
		musicList=new ArrayList<Music>();
		musicList.add(new Music("Sonic Youth","Daydream Nation",1988));
		musicList.add(new Music("Big Black","Atomizer",1986));
		musicList.add(new Music("White Suns","Totem",2015));
	}

	public static void main(String[] args) {
		
		CatalogMaker c = new CatalogMaker();
		addMusic();
		System.out.println(getCSVContent());
	}
	public static void addMusic() {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter an artist");
		 String artistName = s.nextLine();
		

		
			
			System.out.println("Enter an album");
			String albumTitle = s.nextLine();
			
			
				
				System.out.println("Enter the year this album was released");
				int albumYear = s.nextInt();
				
				
					musicList.add(new Music(artistName,albumTitle,albumYear));
					
			
	
	
	}
	public static void save() {
		
	}
	public static void run() 
	{
		
	}
	public static String getCSVContent() {
		String data = " ";
		for(Music m : musicList) {
			data += m + "\n" ;
		}	
		return data;
	}
}

package tylerPlayground;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogMaker {

	private static ArrayList<Music> musicList;
	static Scanner s = new Scanner(System.in);
	static String musicInput = s.nextLine();
	
	public CatalogMaker() {
		musicList=new ArrayList<Music>();
		musicList.add(new Music("Sonic Youth","Daydream Nation",1988));
		musicList.add(new Music("Big Black","Atomizer",1986));
		musicList.add(new Music("White Suns","Totem",2015));
	}

	public static void main(String[] args) {
		System.out.println("Hello");
	CatalogMaker c = new CatalogMaker();
		System.out.println(getCSVContent());
		addMusic();
	}
	public static ArrayList<Music> addMusic() {
		System.out.println("Enter an artist");
		if(musicInput.length() != 0)
		{
			String artistName = musicInput;
			System.out.println("Enter an album");
			musicInput = s.nextLine();
			
			if(musicInput.length() != 0) {
				String albumTitle = musicInput;
				System.out.println("Enter the year this album was released");
				int albumYear = s.nextInt();
				
				if(albumYear != 0) {
					musicList.add(new Music(artistName,albumTitle,albumYear));
				}
			}
		}
		return musicList;
	
	}
	public static String getCSVContent() {
		String data = " ";
		for(Music m : musicList) {
			data += m + "\n" ;
		}	
		return data;
	}
}

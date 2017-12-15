package tylerPlayground;

import java.util.ArrayList;

public class CatalogMaker {

	private static ArrayList<Music> musicList;
	
	public CatalogMaker() {
		musicList=new ArrayList<Music>();
		musicList.add(new Music("Sonic Youth","Daydream Nation",1988));
		musicList.add(new Music("Big Black","Atomizer",1986));
		musicList.add(new Music("White Suns","Totem",2015));
	}

	public static void main(String[] args) {
		CatalogMaker c = new CatalogMaker();
		System.out.println(getCSVContent());
	
	}
	public static String getCSVContent() {
		String data = " ";
		for(Music m : musicList) {
			data += m + "\n" ;
		}	
		return data;
	}
}

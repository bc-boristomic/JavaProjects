package ba.bitcamp.boris.exercises.day5.part2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Artist a1 = new Artist("The Doors", true, 1940, "RNR");
		Artist a2 = new Artist("Iron Maiden", true, 1950, "Heavy Metal");
		Artist a3 = new Artist("Jimmy Hendrix", false, 1952, "RNR");
		Artist a4 = new Artist("TBF", true, 1994, "PingPong");

		Artist[] allArtists = new Artist[] {a1, a2, a3, a4};

		
		Song[] s1 = new Song[2];
		s1[0] = new Song(a1, "LA Woman", 1960, "RNR");
		s1[1] = new Song(a1, "The End", 1964, "RNR");
		
		Song[] s2 = new Song[1];
		s2[0] = new Song(a2, "Two minutes to midnight", 1972, "Heavy Metal");
		
		Song[] s3 = new Song[1];
		s3[0] = new Song(a3, "Purple Haze", 1969, "RNR");
		
		Song[] s4 = new Song[2];
		s4[0] = new Song(a4, "Alles Gut", 2007, "Evergreen");
		s4[1] = new Song(a4, "UV Zrake", 2005, "PingPong");

		Album alb1 = new Album("The Doors", a1, s1, "RNR");
		Album alb2 = new Album("Maxus", a4, s4, "PingPong");

		Album[] all = new Album[2];
		all[0] = new Album("The Doors", a1, s1, "RNR");
		all[1] = new Album("Maxus", a4, s4, "PingPong");
		
		Concert c1 = new Concert(allArtists, new Song[4]);
		c1.preformed[0] = s1[0];
		c1.preformed[1] = s1[1];
		c1.preformed[2] = s4[0];
		c1.preformed[3] = s4[1];
		
		System.out.println("Are these two songs from same author? " + isSameAuthor(s1[0], s1[1]));

		System.out.println("Is this song from solo author? " + isFromSoloAuthor(s3[0]));

		System.out.println("Which of these two is older song? " + getOlderSong(s1[0], s1[1]));
		
		System.out.println(countGenreNumber(alb1, "RNR") + " song(s) from selected album are selected genre.");
		
		printAlbumInformation(all, s4[0]);
		
		System.out.println("Songs played at concert per album " + Arrays.toString(getNumberOfSongsPerAlbum(c1, all)));
		
		System.out.println(getMaxNumberOfSongs(c1));
		
	}

	/**
	 * Checks if two songs have same author.
	 * 
	 * @param s1
	 *            Input is song 1
	 * @param s2
	 *            Input is song 2
	 * @return <code>Boolean</code> type value
	 */
	public static boolean isSameAuthor(Song s1, Song s2) {
		if (s1.name.equals(s2.name)) {
			return true;
		}
		return false;
	}

	/**
	 * If song's artist is a band return true, if artist is alone return false.
	 * 
	 * @param s
	 *            Input is song.
	 * @return <code>Boolean</code> type value
	 */
	public static boolean isFromSoloAuthor(Song s) {
		return s.name.isBand;

	}

	/**
	 * Checks what song come out first and returns that Object.
	 * 
	 * @param s1
	 *            Input is song 1
	 * @param s2
	 *            Input is song 2
	 * @return Older song Object
	 */
	public static Song getOlderSong(Song s1, Song s2) {
		if (s1.songYear > s2.songYear) {
			return s2;
		}
		return s1;

	}

	
	
	/**
	 * Checks how many songs have same genre in album as inputed genre.
	 * 
	 * @param a Input album
	 * @param genre Input <code>String</code> type genre
	 * @return Count of songs in album that have same genre
	 */
	public static int countGenreNumber (Album a, String genre) {
		int counter = 0;
		for (int i = 0; i < a.songAlbumName.length; i++) {
			if (a.albumGenre.equals(genre)) {
				counter++;
			}
		}
		return counter;
		
		
	}
	
	/**
	 * Returns album name if inputed song is in inputed album.
	 * Otherwise returns null.
	 * 
	 * @param a Input is Album Object array
	 * @param s Input is Song Object
	 */
	public static void printAlbumInformation(Album[] a, Song s) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].songAlbumName.length; j++) {
				if (s.songName == a[i].songAlbumName[j].songName){
					System.out.println("Album is " + a[i].albumTitle);
					return;
				}
			}
		}
		System.out.println("null");
	}
	
	/**
	 * Returns array with songs played at concert from each album.
	 * Every song is represented as number at different array index.
	 * 
	 * @param c Object Concert
	 * @param a Object Album array
	 * @return <code>int</code> type array
	 */
	public static int[] getNumberOfSongsPerAlbum(Concert c, Album[] a) {
		int[] number = new int[a.length];
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			counter = 0;
			for (int j = 0; j < a[i].songAlbumName.length; j++) {
				for (int j2 = 0; j2 < c.preformed.length; j2++) {
					if (c.preformed[j2].songName == a[i].songAlbumName[j].songName) {
						counter++;
					}
				}
			}
			number[i] = counter;
		}
		return number;
	}
	
	
	public static int getMaxNumberOfSongs(Concert c) {
		int max = 0;
		
		Artist mostPopular = c.preformers[0];
		
		for (int i = 0; i < c.preformed.length; i++) {
			if (c.preformed[i].name.name.equals(mostPopular.name)) {
				max++;
			}
		}
		
		for (int i = 0; i < c.preformers.length; i++) {
			int songsPlayed = 0;
			
			for (int j = 0; j < c.preformed.length; j++) {
				if (c.preformed[i].name.name.equals(c.preformers[i].name)) {
					songsPlayed++;
				}
			}
			if (songsPlayed > max) {
				max = songsPlayed;
				mostPopular = c.preformers[i];
			}
		}
		
		return max;
	}

}

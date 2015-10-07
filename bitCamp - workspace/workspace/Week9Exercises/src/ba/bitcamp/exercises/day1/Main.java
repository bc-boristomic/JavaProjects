package ba.bitcamp.exercises.day1;

public class Main {
	
	public static void main(String[] args) {
		
		Song s1 = new Song("Pjesma 1", "Autor 1", 1990, Constants.ROCK);
		Song s2 = new Song("Pjesma 2", "Autor 1", 1990, Constants.ROCK);

		Song s3 = new Song("Da li ce obrisati", "Autor 2", 1990, Constants.POP);
		Song s4 = new Song("Pjesma za brisanje", "Autor 2", 1990, Constants.POP);
		Song s5 = new Song("Pjesma 1", "Autor 3", 1980, Constants.JAZZ);
		Song s6 = new Song("Pjesma 2", "Autor 4", 1980, Constants.JAZZ);
		
		Song s7 = new Song("Sedma pjesma", "Autor 1", 1990, Constants.ROCK);
		Song s8 = new Song("Osma pjesma", "Autor 99", 1990, Constants.ROCK);
		
		Song[] arrayOfSongs = { s3, s4, s5, s6 };
		
		ArrayListSong songsArr = new ArrayListSong(arrayOfSongs);
		
		ArrayListSong songs = new ArrayListSong();
		
		System.out.println(songs);
		
		songs.addSong(s1);
		songs.addSong(s2);
		
		System.out.println(songs);
		
		System.out.println(songs.getSong(1));
		
		System.out.println(songsArr);
		songsArr.addSong(s1);
		System.out.println(songsArr);
		
		System.out.println();
		System.out.println(songs);
		songs.removeSong(0);
		System.out.println(songs);
		
		System.out.println();
		
		System.out.println(songsArr);
		songsArr.removeSong(s3);
		System.out.println(songsArr);
		
		System.out.println("Length of ArrayListSong is " + songs.getLength());
		System.out.println("Length of ArrayListSong is " + songsArr.getLength());
		
		System.out.println("Index of song s1 is " + songsArr.getIndexOf(s1));
		System.out.println("Index of song s2 is " + songsArr.getIndexOf(s2));
		
		System.out.println();
		System.out.println(songs);
		songs.addSongMoreEfficiently(s7);
		songs.addSongMoreEfficiently(s8);
		songs.addSongMoreEfficiently(s3);
		songs.addSongMoreEfficiently(s4);

		System.out.println(songs);
		


		
	}

}

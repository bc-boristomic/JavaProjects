package ba.bitcamp.exercises.day1;

import java.util.Arrays;

public class ArrayListSong {

	private Song[] songs;

	/**
	 * Constructor that sets array of songs at length zero.
	 */
	public ArrayListSong() {
		this.songs = new Song[0];
	}

	/**
	 * Constructor that takes array of songs.
	 * 
	 * @param array
	 *            - <code>Song</code> object array
	 */
	public ArrayListSong(Song[] array) {
		this.songs = array;
	}

	/**
	 * Adds a new song to an array of songs. First enlarges array length by one
	 * then puts new song in last place of array.
	 * 
	 * @param song
	 *            - <code>Song</code> object
	 */
	public void addSong(Song song) {
		Song[] temp = new Song[songs.length + 1];
		for (int i = 0; i < songs.length; i++) {
			temp[i] = songs[i];
		}
		temp[songs.length] = song;
		songs = temp;
	}
	
	
	public void addSongMoreEfficiently (Song song) {
		Song[] temp = new Song[songs.length];
		if (temp.length == songs.length) {
			temp = new Song[songs.length * 2];
		}
		for (int i = 0; i < songs.length; i++) {
			if (songs[i] != null) {
				temp[i] = songs[i];
			} else {
				temp[i] = song;
				break;
			}
		}
		songs = temp;
	}
	

	/**
	 * Returns Song at specified index.
	 * 
	 * @param index
	 *            - <code>int</code> type array index number
	 * @return <code>Song</code> object
	 */
	public Song getSong(int index) {
		return songs[index];
	}

	/**
	 * Remove song from array of songs by given array index.
	 * 
	 * @param index
	 *            - <code>int</code> type array index
	 */
	public void removeSong(int index) {
		Song[] temp = new Song[songs.length - 1];
		for (int i = 0; i < index; i++) {
			temp[i] = songs[i];
		}
		for (int i = index + 1; i < songs.length; i++) {
			temp[i - 1] = songs[i];
		}
		songs = temp;
	}

	/**
	 * Remove song from array of songs by given Song object. Checks if song
	 * exist in array, if it does, send index to method that removes song by
	 * index.
	 * 
	 * @param song
	 *            - <code>Song</code> object
	 */
	public void removeSong(Song song) {
		for (int i = 0; i < songs.length; i++) {
			if (song.equals(songs[i])) {
				removeSong(i);
			}
		}
	}

	/**
	 * Returns the length of specified ArrayListSong.
	 * 
	 * @return - <code>int</code> type value of ArrayLisSong length
	 */
	public int getLength() {
		return songs.length;
	}

	/**
	 * Returns the index of song, if two or more same songs exist in array,
	 * returns index of first song that encounters.
	 * 
	 * @param song
	 *            - <code>Song</code> object
	 * @return <code>int</code> type value of index if song exist in array,
	 *         return -1 if there is no such song in array.
	 */
	public int getIndexOf(Song song) {
		for (int i = 0; i < songs.length; i++) {
			if (song.equals(songs[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return Arrays.toString(songs);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayListSong other = (ArrayListSong) obj;
		if (!Arrays.equals(songs, other.songs))
			return false;
		return true;
	}

}

package ba.bitcamp.homeworkweekend9.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Public class UploadedFile is used to get all the information from file that
 * is selected. Keeps track of file name, file extension, file size in bytes and
 * original file location.
 * 
 * @author boris
 *
 */
public class UploadedFile {

	// Declaring and initializing static LinedList used to add appropriate files
	// to them
	protected static LinkedList<UploadedFile> documents = new LinkedList<>();
	protected static LinkedList<UploadedFile> pictures = new LinkedList<>();
	protected static LinkedList<UploadedFile> music = new LinkedList<>();
	protected static LinkedList<UploadedFile> other = new LinkedList<>();

	// Declaring static File about used to write and read all the info from
	protected static File about;

	// Declaring private variables used to describe this class
	private String name;
	private String extension;
	private Long size;
	private File file;

	/**
	 * Default constructor of UploadedFile class, adds appropriate value to
	 * declared variables.
	 * 
	 * @param name
	 *            <code>String</code> type value of file name
	 * @param extension
	 *            <code>String</code> type value of file extension
	 * @param size
	 *            <code>Long</code> type value of file size in bytes
	 * @param file
	 *            <code>File</code> type value of selected file
	 */
	public UploadedFile(String name, String extension, Long size, File file) {
		this.name = name;
		this.extension = extension;
		this.size = size;
		this.file = file;
	}

	/**
	 * Returns <code>String</code> type value in format of file name, then file
	 * extension followed by file size in bytes. Between every information there
	 * is a line.
	 */
	@Override
	public String toString() {
		return String.format(
				"File name: %s | Extension: %s | File size: %d bytes", name,
				extension, size);
	}

	/**
	 * Getter that returns temporary selected file. Or a file from a list of
	 * files.
	 * 
	 * @return <code>File</code> type value
	 */
	public File getFile() {
		return file;
	}

	/**
	 * This method is static because it is used every time specific action is
	 * triggered.
	 * <p>
	 * Writes information about files new location to a file called info.txt
	 * <p>
	 * File info.txt is saved in master folder that is selected in start of
	 * program.
	 * <p>
	 * BufferedWriter writes all files that are in <tt>documents</tt> list of
	 * files, or files that went to newly created folder Documents.
	 * BufferedWriter writes all files that are in <tt>pictures</tt> list of
	 * files, or files that went to newly created folder Pictures.
	 * BufferedWriter writes all files that are in <tt>music</tt> list of files,
	 * or files that went to newly created folder Music. BufferedWriter writes
	 * all files that are in <tt>other</tt> list of files, or files that went to
	 * newly created folder Other.
	 */
	@SuppressWarnings("resource")
	protected static void writeListsToFile() {
		about = new File(ButtonAction.master.getPath() + "/info.txt");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(about));
			bw.write("Files in DOCUMENTS folder");
			bw.newLine();
			bw.newLine();
			for (UploadedFile docs : documents) {
				bw.write(docs.toString());
				bw.newLine();
			}
			bw.write("************************************************************************************");
			bw.newLine();
			bw.write("Files in PICTURES folder");
			bw.newLine();
			bw.newLine();
			for (UploadedFile pics : pictures) {
				bw.write(pics.toString());
				bw.newLine();
			}
			bw.write("************************************************************************************");
			bw.newLine();
			bw.write("Files in MUSIC folder");
			bw.newLine();
			bw.newLine();
			for (UploadedFile song : music) {
				bw.write(song.toString());
				bw.newLine();
			}
			bw.write("************************************************************************************");
			bw.newLine();
			bw.write("Files in OTHER folder");
			bw.newLine();
			bw.newLine();
			for (UploadedFile fil : other) {
				bw.write(fil.toString());
				bw.newLine();
			}
			bw.write("************************************************************************************");
			bw.newLine();
			bw.write("You can delete files at previous location by clicking Delete files button");
			bw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is static because it is used every time specific action is
	 * triggered.
	 * <p>
	 * Reads from info.txt file into a <code>String</code> that is used to setup
	 * <code>JLabel</code> that displays information about files being moved as
	 * they are moved.
	 * 
	 * @return <code>String</code> type value of text from info.txt file
	 */
	@SuppressWarnings("resource")
	protected static String readFromFile() {
		String s = "<html>";
		try {
			BufferedReader read = new BufferedReader(new FileReader(
					UploadedFile.about));

			while (read.ready()) {
				s += read.readLine() + "<p> ";
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		s += "</html>";
		return s;
	}

}

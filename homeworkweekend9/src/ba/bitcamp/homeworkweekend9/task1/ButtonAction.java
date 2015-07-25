package ba.bitcamp.homeworkweekend9.task1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.LinkedList;

import javax.swing.JFileChooser;

public class ButtonAction implements ActionListener {

	// Declares File variables that are used to create folders
	protected static File master;
	private static File pictures;
	private static File music;
	private static File documents;
	private static File other;

	// Declares and initializes variable used to write and read from file.
	private static String text = "";

	/**
	 * Implemented method from <tt>ActionListener</tt> interface. Calls
	 * different method for different button pressed.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Application.folder) {
			setupDirectories();
		}
		if (e.getSource() == Application.browse) {
			chooseFiles();
			UploadedFile.writeListsToFile();
			Application.list.setText(UploadedFile.readFromFile());
		}
		if (e.getSource() == Application.delete) {
			deleteAllFiles();
		}
	}

	/**
	 * Created new file with same filename as original one in directory
	 * Documents. Uses BufferedReader to write file text and saved to a static
	 * String text. After a file i written, static String text is reseted. This
	 * method is used for text files.
	 * 
	 * @param name
	 *            <code>String</code> type value of full filename
	 */
	private void copyTextFile(String name) {
		try {
			BufferedWriter write = new BufferedWriter(new FileWriter(new File(
					documents.toString() + "/" + name)));
			write.write(text);
			write.close();
			text = "";
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * Uses <tt>Files</tt> class and it's method copyOtherFiles to copy inputed
	 * file to different destination. This method is used for music, pictures
	 * and other type of files.
	 * 
	 * @param name
	 *            <code>String</code> type value of full filename
	 * @param temp
	 *            <code>File</code> type value of selected file
	 * @param destination
	 *            <code>File</code> type value of new file in newly created
	 *            directory
	 */
	private void copyOtherFiles(String name, File temp, File destination) {
		try {
			Files.copy(temp.toPath(),
					new File(destination + "/" + name).toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Read text from selected file. This method is used for text files only.
	 * Read text is saved to static String text.
	 * 
	 * @param temp
	 *            <code>File</code> type value of selected file
	 */
	private void readTextFile(File temp) {
		BufferedReader read = null;
		try {
			read = new BufferedReader(new FileReader(temp));
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		}
		try {
			while (read.ready()) {
				text += read.readLine() + "\n";
			}
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

	/**
	 * Lets user select directory in which will be created four new ones called
	 * Documents, Pictures, Music and Other. Upon creation enables browse button
	 * and disables folder button.
	 */
	private void setupDirectories() {
		JFileChooser choose = new JFileChooser();
		choose.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int option = choose.showDialog(null, "Choose folder");

		if (option == JFileChooser.APPROVE_OPTION) {
			master = choose.getSelectedFile();
			pictures = new File(choose.getSelectedFile() + "/Pictures");
			pictures.mkdir();
			music = new File(choose.getSelectedFile() + "/Music");
			music.mkdir();
			documents = new File(choose.getSelectedFile() + "/Documents");
			documents.mkdir();
			other = new File(choose.getSelectedFile() + "/Other");
			other.mkdir();

			Application.browse.setEnabled(true);
			Application.folder.setEnabled(false);
		}
	}

	/**
	 * Method used when browse button is pressed. JFileChooser is opened, user
	 * can select any file. If file is selected, makes a temporary file. Takes
	 * it's name, size, and extension and makes temporary UploadedFile that is
	 * added to appropriate list.
	 * <p>
	 * If file extension matches one of text files, creates a new file in
	 * Documents folder. UploadedFile is added to documents LinkedList.
	 * <p>
	 * If file extension matches one of picture files, creates a new file in
	 * Pictures folder. UploadedFile is added to pictures LinkedList.
	 * <p>
	 * If file extension matches one of music files, creates a new file in Music
	 * folder. UploadedFile is added to music LinkedList.
	 * <p>
	 * If file extension doesn't match any of given extension file is added to
	 * Other folder. UploadedFile is added to other LinkedList.
	 */
	private void chooseFiles() {
		JFileChooser choose = new JFileChooser();
		int option = choose.showDialog(null, "Choose file");
		if (option == JFileChooser.APPROVE_OPTION) {
			File temp = choose.getSelectedFile();
			String name = temp.getName();
			Long size = temp.length();

			UploadedFile file = new UploadedFile(name, getFileExtension(name),
					size, temp);

			if (getFileExtension(name).equals("txt")
					|| getFileExtension(name).equals("doc")
					|| getFileExtension(name).equals("xlsx")) {

				readTextFile(temp);
				copyTextFile(name);
				UploadedFile.documents.add(file);

			} else if (getFileExtension(name).equals("png")
					|| getFileExtension(name).equals("jpg")
					|| getFileExtension(name).equals("bmp")
					|| getFileExtension(name).equals("gif")) {

				UploadedFile.pictures.add(file);
				copyOtherFiles(name, temp, pictures);

			} else if (getFileExtension(name).equals("mp3")
					|| getFileExtension(name).equals("flac")
					|| getFileExtension(name).equals("wmv")) {

				UploadedFile.music.add(file);
				copyOtherFiles(name, temp, music);

			} else {
				UploadedFile.other.add(file);
				copyOtherFiles(name, temp, other);
			}

		}
	}

	/**
	 * Makes a list of all the lists that contain different UploadedFile values.
	 * Goes thru the new list and deleted every file. File that is deleted is a
	 * file at it's original location.
	 */
	private void deleteAllFiles() {
		LinkedList<UploadedFile> all = new LinkedList<>();
		all.addAll(UploadedFile.documents);
		all.addAll(UploadedFile.music);
		all.addAll(UploadedFile.pictures);
		all.addAll(UploadedFile.other);
		for (UploadedFile uploadedFile : all) {
			uploadedFile.getFile().delete();
		}
	}

	/**
	 * For a given filename returns file extension.
	 * <p>
	 * Checks last position of dot, if there is a dot in a filename, returns
	 * <code>String</code> type value of extension.
	 * <p>
	 * Makes new <code>String</code> ext representing extension with value from
	 * only part of inputed <code>String</code> from last dot until end.
	 * 
	 * @param s
	 *            <code>String</code> type value of filename
	 * @return <code>String</code> type value of file extension
	 */
	private String getFileExtension(String s) {
		String ext = null;
		int index = s.lastIndexOf(".");
		if (index > 0) {
			ext = s.substring(index + 1);
		}
		return ext;
	}

}

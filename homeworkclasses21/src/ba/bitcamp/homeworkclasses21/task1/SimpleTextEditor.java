package ba.bitcamp.homeworkclasses21.task1;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * SimpleTextEditor class extends JFrame and is used to setup and open JFrame
 * window containing one JTextArea (with scrollbars if needed) and one JMenuBar.
 * Thru this menu bar you can open any file from computer, edit it and save it
 * do specified location.
 * 
 * @author boris
 *
 */
public class SimpleTextEditor extends JFrame {
	private static final long serialVersionUID = -8228464575032366438L;

	// Declaring and initializing variables for menu bar
	private JMenuBar bar = new JMenuBar();
	private JMenu file = new JMenu("File");
	private JMenu edit = new JMenu("Edit");
	private JMenu help = new JMenu("Help");
	private JMenuItem open = new JMenuItem("Open");
	private JMenuItem save = new JMenuItem("Save As...");
	private JMenuItem exit = new JMenuItem("Exit");
	private JMenuItem copy = new JMenuItem("Copy");
	private JMenuItem about = new JMenuItem("About");

	// Declaring and initializing variables for text area
	private JTextArea text = new JTextArea();
	private JScrollPane scroll = new JScrollPane(text);

	/**
	 * Constructor of SimpleTextEditor class, calls methods used to setup and
	 * open JFrame window.
	 */
	public SimpleTextEditor() {
		initBar();
		add(scroll); // Note that variable scroll already contains JTextArea
		initFrame();
	}

	/**
	 * Setups JMenuBar and all the components in it, adds ActionListener to them
	 */
	private void initBar() {
		// Setting components to appropriate place
		setJMenuBar(bar);
		bar.add(file);
		bar.add(edit);
		bar.add(help);
		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);
		edit.add(copy);
		help.add(about);
		// Adding action to components
		open.addActionListener(new ActionBar());
		save.addActionListener(new ActionBar());
		exit.addActionListener(new ActionBar());
		copy.addActionListener(new ActionBar());
		about.addActionListener(new ActionBar());

	}

	/**
	 * Setups JFrame
	 */
	private void initFrame() {
		setTitle("Simple Text Editor");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * Private inner class ActionBar implements ActionListener and sets
	 * appropriate action to every button.
	 * <p>
	 * If button Open is pressed JFileChooser is opened, once file is opened it
	 * is read to JTextArea.
	 * <p>
	 * If button SaveAs... is pressed JFileChooser is opened, once file is
	 * selected, or new one is created, text from JTextArea is saved in it.
	 * <p>
	 * If button Copy is pressed, any selected text will be available in
	 * clipboard for pasting.
	 * <p>
	 * if button About is pressed, JOptionPane will open small instructional
	 * message.
	 * 
	 * @author boris
	 *
	 */
	private class ActionBar implements ActionListener {

		// Declaring file chooser used to setup open and close file choose
		// dialog
		private JFileChooser choose = new JFileChooser(	System.getProperty("usr.dir"));

		/**
		 * Implemented method from ActionListener, 
		 * responds to every button clicked.
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == open) {
				openAction();
			}

			if (e.getSource() == save) {
				saveAction();
			}

			if (e.getSource() == exit) {
				System.exit(EXIT_ON_CLOSE);
			}

			if (e.getSource() == copy) {
				Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
				String copy = text.getSelectedText();
				clip.setContents(new StringSelection(copy), null);
			}
			//
			if (e.getSource() == about) {
				JOptionPane.showMessageDialog(null,	"This simple text editor allows "
										+ "you to import any file, edit it and save either to "
										+ "same file or to a different one.\nYou can also select "
										+ "any part of the text and copy it to a clipboard.",
										"Simple instructions", JOptionPane.PLAIN_MESSAGE);
			}

		}

		/**
		 * Checks if button for opening file is clicked, then gets the file. 
		 * Checks if selected file is file and not folder. Reads from file to a 
		 * String line using BufferedReader until there is text to read.
		 * Sets that String to JTextArea.  
		 */
		private void openAction() {
			int option = choose.showOpenDialog(null);
			if (option == JFileChooser.APPROVE_OPTION) {
				File file = choose.getSelectedFile();
				if (file.isFile()) {
					BufferedReader in = null;
					try {
						in = new BufferedReader(new FileReader(file));
						String line = "";
						while (in.ready()) {
							line += in.readLine() + "\n";
						}
						text.setText(line);
					} catch (FileNotFoundException ex) {
						ex.printStackTrace();
					} catch (IOException ex) {
						ex.printStackTrace();
					}
				}
			}			
		}
		
		/**
		 * Checks if button for saving file is clicked, if yes then file is selected.
		 * Gets that selected file and sends it to BufferedWriter to put it in that file.
		 * BufferedWriter writes text that is taken from JTextArea at that moment, so all
		 * the writing and editing will be saved. 
		 *  
		 */
		private void saveAction() {
			int option = choose.showSaveDialog(null);
			if (option == JFileChooser.APPROVE_OPTION) {
				BufferedWriter write = null;
				File file = choose.getSelectedFile();
				try {
					write = new BufferedWriter(new FileWriter(file));
					write.write(text.getText());
					write.flush();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

	}

	/**
	 * main method that runs the program
	 * @param args
	 */
	public static void main(String[] args) {

		new SimpleTextEditor();

	}

}

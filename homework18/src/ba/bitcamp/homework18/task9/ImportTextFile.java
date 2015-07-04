package ba.bitcamp.homework18.task9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 * You can enter any filename in text field and once you press enter, 
 * text from that file will be pasted on text area.
 * 
 * @author boris
 *
 */
public class ImportTextFile extends JFrame {
	private static final long serialVersionUID = -7567175781556496418L;

	private JPanel panel = new JPanel();
	private JTextField filename = new JTextField("README.md", 20);
	private JTextArea text = new JTextArea(45, 48);
	private JButton enter = new JButton("Enter");
		
	public ImportTextFile() {
		
		JScrollPane scroll = new JScrollPane(text);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		add(panel);
		panel.add(filename);
		panel.add(enter);
		panel.add(scroll);
		
		enter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String read = "";
				try {
					TextIO.readFile(filename.getText());
					while (!TextIO.eof()) {
						read += TextIO.getln() + "\n";
					}
					if (read.length() == 0) {
						text.setText("File empty.");
					}else {
						text.setText(read);
					}
				} catch (IllegalArgumentException ex) {
					JOptionPane.showMessageDialog(null, "Enter valid filename");
				}
			}
		});

		setTitle("Read text from file");
		setSize(550, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		
		new ImportTextFile();
		
	}

}

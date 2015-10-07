package ba.bitcamp.exercises.day1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MiniTextEditor extends JFrame {
	private static final long serialVersionUID = 7112537194144182892L;

	private JMenuBar bar = new JMenuBar();
	private JMenu file = new JMenu("File");
	private JMenu edit = new JMenu("Edit");
	private JMenuItem exit = new JMenuItem("Exit");
	private JMenuItem insert = new JMenuItem("Insert");
	private JTextArea text = new JTextArea();
	
	public MiniTextEditor() {
		setJMenuBar(bar);
		bar.add(file);
		bar.add(edit);
		file.add(exit);
		edit.add(insert);
		add(text);
		text.setEditable(false);
		insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyDialog();
				
			}
		});
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
				
			}
		});
		
		setTitle("Is email available?");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	private class MyDialog extends JDialog {
		private static final long serialVersionUID = -6621423112988858400L;
		
		private JTextField index = new JTextField("Index here");
		private JTextField txt = new JTextField("Text here");
		private JButton button = new JButton("Insert text");
		
		
		public MyDialog() {
			
			add(index, BorderLayout.NORTH);
			add(txt, BorderLayout.CENTER);
			add(button, BorderLayout.SOUTH);
			
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int i = Integer.parseInt(index.getText());
					String s = text.getText();
					String s1 = s.concat(txt.getText().substring(i, txt.getText().length()));
					text.setText(s1);
					
				}
			});
			
			
			setModalityType(ModalityType.MODELESS);
			setTitle("");
			setSize(200, 200);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setVisible(true);
		}
	}
	
	
	public static void main(String[] args) {
		new MiniTextEditor();
	}
}

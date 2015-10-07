package ba.bitcamp.exercises.day1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class TwoJDialogs extends JFrame {
	private static final long serialVersionUID = 2381585542160426163L;

	private JButton button1 = new JButton("Open modeless dialog");
	private JButton button2 = new JButton("Open modal dialog");
	
	public TwoJDialogs(){
		
		add(button1, BorderLayout.NORTH);
		add(button2, BorderLayout.SOUTH);
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyDialog1();
			}
		});
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyDialog2();
				
			}
		});
		
		
		setTitle("Two JDialogs");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	private class MyDialog1 extends JDialog {
		private static final long serialVersionUID = -7302627133422592060L;

		public MyDialog1() {
			
			
			setModalityType(ModalityType.MODELESS);
			setTitle("Modeless");
			setSize(200, 200);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setVisible(true);
			
		}
	}
	
	private class MyDialog2 extends JDialog {
		private static final long serialVersionUID = -7636198897262535533L;

		public MyDialog2() {
			
			
			setModalityType(ModalityType.DOCUMENT_MODAL);
			setTitle("Modal");
			setSize(200, 200);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setVisible(true);
			
		}
	}
	
	public static void main(String[] args) {
		new TwoJDialogs();
	}
	
	
}

package ba.bitcamp.homework24.task2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ba.bitcamp.homework24.task2.ArticlePrototype.Article;
import ba.bitcamp.homework24.task2.CustomMessages.Message;
import ba.bitcamp.homework24.task2.SQLUtils.ConnectToDatabase;

/**
 * Class AddArticle adds an inputed article to database of articles.
 * 
 * @author boris
 *
 */
public class AddArticle extends JFrame {
	private static final long serialVersionUID = -5713422430967912943L;

	private static final String TYPE_ERROR = "error";
	private static final String TYPE_WARNING = "warning";
	private static final String MESSAGE_NAN = "nan";
	private static final String MESSAGE_CODE = "code";
	private static final String MESSAGE_SIZE = "size";

	private JLabel codeLabel = new JLabel("Code:");
	private JTextField codeField = new JTextField(20);
	private JLabel nameLabel = new JLabel("Name:");
	private JTextField nameField = new JTextField(20);
	private JLabel priceLabel = new JLabel("Price:");
	private JTextField priceField = new JTextField(20);
	private JButton addButton = new JButton("Add");

	/**
	 * Default constructor of AddArticle class
	 */
	public AddArticle() {
		initGUIParts();
	}

	/**
	 * Method initializes all the GUI parts and adds action listener to add
	 * button
	 */
	private void initGUIParts() {
		setLayout(new FlowLayout(FlowLayout.TRAILING, 10, 30));

		add(codeLabel);
		add(codeField);
		add(nameLabel);
		add(nameField);
		add(priceLabel);
		add(priceField);
		add(addButton);

		addButton.addActionListener(new ButtonAction());

		setTitle("Add article to database");
		setSize(300, 250);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * Private inner class used to add action to button. When button is pressed
	 * inputed data is sent to database.
	 * 
	 * @author boris
	 *
	 */
	private class ButtonAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == addButton) {
				sendData();
			}

		}

	}

	/**
	 * First it's checked if number is 10 digits long, then it's checked if
	 * number is parsable, then if name already exists in database. Then
	 * statement tries to update database with article, if code already exists
	 * error message is shown telling user to change code.
	 * <p>
	 * If everything goes well field for code input is reset and message that
	 * article is added is printed to standart output.
	 */
	private void sendData() {
		boolean goOn = false;

		String inputedCode = codeField.getText();
		if (inputedCode.length() != 10) {
			Message.message(TYPE_ERROR, MESSAGE_SIZE);
		} else {
			goOn = true;
		}

		if (goOn) {
			Integer code = null;
			try {
				code = Integer.parseInt(inputedCode);
			} catch (NumberFormatException ex) {
				Message.message(TYPE_ERROR, MESSAGE_NAN);
				System.err.println("Error message" + ex.getMessage());
				goOn = false;
			}

			if (goOn) {
				Statement statement = ConnectToDatabase.connect();
				ArrayList<String> names = new ArrayList<>();
				ResultSet res;
				try {
					res = statement.executeQuery("select * from article");

					while (res.next()) {
						String name = res.getString(2);
						if (!names.contains(name)) {
							names.add(name);
							goOn = true;
						}
					}
				} catch (SQLException ex) {
					System.out.println("Error while accessing database");
					System.err.println("Error message: " + ex.getMessage());
					System.err.println("Error message: " + ex.getErrorCode());
				}

				if (goOn) {
					if (names.contains(nameField.getText())) {
						int option = Message.message(TYPE_WARNING, "");
						if (option == 0) {
							goOn = true;
						} else if (option == 2 || option == -1) {
							goOn = false;
						}
					}

					if (goOn) {
						Article temp = new Article(code, nameField.getText(),
								priceField.getText());

						StringBuilder sb = new StringBuilder();

						sb.append("INSERT INTO article VALUES(");
						sb.append(temp.getCode());
						sb.append(", '");
						sb.append(temp.getName());
						sb.append("', '");
						sb.append(temp.getPrice());
						sb.append("');");

						try {
							statement.executeUpdate(sb.toString());
							codeField.setText("");
							System.out.println("Article added to database.");
						} catch (SQLException ex) {
							Message.message(TYPE_ERROR, MESSAGE_CODE);
							ex.printStackTrace();
						}

					}
				}
			}
		}
	}

	/**
	 * main method that runs the programm
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new AddArticle();
	}

}

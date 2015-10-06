package ba.bitcamp.homework24.task3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

import ba.bitcamp.homework24.task2.ArticlePrototype.Article;
import ba.bitcamp.homework24.task2.SQLUtils.ConnectToDatabase;

/**
 * Class DeleteArticleFromDatabase extends JFrame and is used to delete selected
 * article from database.
 * 
 * @author boris
 *
 */
public class DeleteArticleFromDatabase extends JFrame {
	static final long serialVersionUID = -2232196600758791928L;

	private JList<Article> list;
	private JButton delete = new JButton("Delete");
	private Statement statement;

	/**
	 * Default constructor of DeleteArticleFromDatabase class
	 */
	public DeleteArticleFromDatabase() {
		setLayout(new BorderLayout());
		getDataToJList();
		initGUIParts();
	}

	/**
	 * Reads data from article database and sets value as JList item
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void getDataToJList() {
		try {
			statement = ConnectToDatabase.connect();
			ResultSet res = statement.executeQuery("select * from article");

			ArrayList<Article> arr = new ArrayList<>();
			while (res.next()) {
				Integer code = res.getInt(1);
				String name = res.getString(2);
				String price = res.getString(3);
				Article temp = new Article(code, name, price);
				System.out.println(temp.toString());
				arr.add(temp);
			}
			list = new JList(arr.toArray());
		} catch (SQLException ex) {
			System.out.println("Could not read from table");
			System.err.println("Error message: " + ex.getMessage());
			System.err.println("SQL error: " + ex.getErrorCode());
			System.err.println("SQL error: " + ex.getSQLState());
			System.exit(1);
		}
	}

	/**
	 * Initializes GUI parts
	 */
	private void initGUIParts() {
		add(new JScrollPane(list), BorderLayout.CENTER);
		add(delete, BorderLayout.SOUTH);
		delete.addActionListener(new ButtonAction());

		setTitle("Delete article from database");
		setSize(500, 450);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * Private inner class used to add action to delete button. When button is
	 * pressed selected article is deleted from database.
	 * 
	 * @author boris
	 *
	 */
	private class ButtonAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Article temp = list.getSelectedValue();
			try {
				statement.executeUpdate("DELETE FROM article WHERE code = "
						+ temp.getCode() + ";");
			} catch (SQLException ex) {
				System.out.println("Could not delete from database");
				System.err.println("Error message: " + ex.getMessage());
				System.err.println("SQL message: " + ex.getSQLState());
			}
		}

	}

	/**
	 * main method that runs the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new DeleteArticleFromDatabase();
	}

}

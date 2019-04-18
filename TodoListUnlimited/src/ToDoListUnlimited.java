//CURRENTLY: Has buttons, table, title, window
//TODO: Add + Delete Behavior

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import java.awt.Panel;
import javax.swing.JTable;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import Buttons.ButtonListener;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.DefaultCellEditor;

public class ToDoListUnlimited {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToDoListUnlimited window = new ToDoListUnlimited();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ToDoListUnlimited() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("To-Do List Unlimited");
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setBounds(150, 150, 675, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTodoListUnlimited = new JLabel("To-Do List Unlimited 2019");
		lblTodoListUnlimited.setBounds(0, 17, 675, 37);
		lblTodoListUnlimited.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblTodoListUnlimited.setHorizontalAlignment(SwingConstants.CENTER);
		lblTodoListUnlimited.setToolTipText("Displays application name");
		frame.getContentPane().add(lblTodoListUnlimited);
		
		JButton btnAddItem = new JButton("ADD ITEM");
		btnAddItem.setBounds(0, 88, 117, 29);
		frame.getContentPane().add(btnAddItem);
		
		JLabel lblSortBy = new JLabel("Sort By:");
		lblSortBy.setBounds(352, 93, 61, 16);
		frame.getContentPane().add(lblSortBy);
		
		String[] options = {"Priority", "Due Date", "Name"};
		
		JComboBox<?> comboBox = new JComboBox<Object>(options);
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(414, 89, 126, 27);
		frame.getContentPane().add(comboBox);
		
		String[] actions = { "Pending","Ongoing","Done"};
		
		JComboBox<?> statusBox = new JComboBox<Object>(actions);
		statusBox.setSelectedIndex(0);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setBounds(552, 88, 117, 29);
		frame.getContentPane().add(btnPrint);
		
		JLabel lblDescription = new JLabel("DESCRIPTION");
		lblDescription.setBounds(20, 130, 100, 16);
		frame.getContentPane().add(lblDescription);
		
		JLabel lblDueDate = new JLabel("DUE DATE");
		lblDueDate.setBounds(191, 130, 84, 16);
		frame.getContentPane().add(lblDueDate);
		
		JLabel lblStatus = new JLabel("STATUS");
		lblStatus.setBounds(317, 130, 61, 16);
		frame.getContentPane().add(lblStatus);
		
		JLabel lblAction = new JLabel("ACTION");
		lblAction.setBounds(479, 130, 61, 16);
		frame.getContentPane().add(lblAction);
		
		///////////TABLE EXAMPLES////////////
		String[] columnNames = {"Descrption", "Due Date", "Status", "Action"};
		Object[][] info = new Object[50][4];
		Object[] first = {"Coffee with Jan", "10/15/2019","Done","Stuff"};
		info[0] = first;
		Object[] second = {"Coffee with Jan", "10/15/2019", "Done", "Stuff"};
		info[1] = second;
		Object[] third = {"Coffee with Jan", "10/15/2019", "Done", "Stuff"};
		info[2] = third;
		table = new JTable(info, columnNames);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		table.setBounds(20, 158, 638, 251);
		frame.getContentPane().add(table);
		TableColumn status = table.getColumnModel().getColumn(2);
		status.setCellEditor(new DefaultCellEditor(statusBox));
		DefaultTableCellRenderer renderer =
                new DefaultTableCellRenderer();
        renderer.setToolTipText("Click for combo box");
        status.setCellRenderer(renderer);
		/*
		* Tried messing with this, gave me errors for some reason.
		* Once we get the button listener Gage and I can start working 
		* on the sorting algorithm! Should be easy peasy.
		*/
		//ButtonListener listener = new ButtonListener();
		//btnAddItem.addActionListener(listener);
		//JScrollPane scrollPane = new JScrollPane(table);
		//frame.getContentPane().add(scrollPane);
	}
}

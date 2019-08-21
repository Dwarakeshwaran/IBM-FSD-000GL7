package swing.demiframe;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class DemiFrame extends JFrame{

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public DemiFrame() {
		
		getContentPane().setLayout(new MigLayout("", "[][][][][grow]", "[][][][][][][][]"));
		this.setSize(400, 300);
		JLabel lblEmployeeId = new JLabel("Employee ID");
		getContentPane().add(lblEmployeeId, "cell 1 1");
		
		textField = new JTextField();
		getContentPane().add(textField, "cell 2 1,growx");
		textField.setColumns(10);
		
		textField_4 = new JTextField();
		getContentPane().add(textField_4, "cell 4 1,growx");
		textField_4.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		getContentPane().add(lblFirstName, "cell 1 2");
		
		textField_1 = new JTextField();
		getContentPane().add(textField_1, "cell 2 2,growx");
		textField_1.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataBase db = new DataBase();
				try {
					try {
						db.createConnection();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					String id = textField_4.getText();
					db.deleteRecord(Integer.parseInt(id));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		getContentPane().add(btnDelete, "cell 4 2,growx");
		
		JLabel lblLastName = new JLabel("Last Name");
		getContentPane().add(lblLastName, "cell 1 3");
		
		textField_2 = new JTextField();
		getContentPane().add(textField_2, "cell 2 3,growx");
		textField_2.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		getContentPane().add(lblEmail, "cell 1 4");
		
		textField_3 = new JTextField();
		getContentPane().add(textField_3, "cell 2 4,growx");
		textField_3.setColumns(10);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		getContentPane().add(btnAddEmployee, "cell 1 6,alignx left");
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		getContentPane().add(btnReset, "cell 3 6,growx");
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataBase db = new DataBase();
				try {
					db.createConnection();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				new LoadFrame();
			}
		});
		getContentPane().add(btnDisplay, "cell 2 7,growx");
		
		
		
		btnAddEmployee.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int eid;
				String fname;
				String lname;
				String email;
				
				eid = Integer.parseInt(textField.getText());
				fname = textField_1.getText().toString();
				lname = textField_2.getText().toString();
				email = textField_3.getText().toString();
				System.out.println(eid+" "+fname+" "+lname+" "+email);
				JOptionPane.showMessageDialog(btnAddEmployee, "Employee Added");
				DataBase db = new DataBase(eid, fname, lname, email);
				try {
					db.createConnection();
					db.addRecord();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField.setText("");
				
			}
			
		});
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}

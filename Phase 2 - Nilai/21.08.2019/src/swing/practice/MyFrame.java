package swing.practice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	private JLabel label;
	private JTextField textField;
	private JButton button;
	
	public MyFrame() {
		//Creating Components and Define Components
		label = new JLabel();
		label.setText("Welcome to the Container");
		
		textField = new JTextField(25);
		
		button = new JButton();
		button.setText("Click Me");
		
		//Set Container Defaults
		this.setTitle("D's Container");
		this.setSize(400,300);
		this.setLayout(new FlowLayout());
	
		
		//Add Components
		this.add(label);
		this.add(textField);
		this.add(button);
		
		//Finally do this...
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		//Register the Listener
		button.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(this, "Adios "+textField.getText().toString());
		
		
	}

}

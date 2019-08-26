package networking.assignment;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ClientGui extends JFrame {
	public String text;
	private JTextField textField;
	private JTextField textField_1;
	public Client2 c;

	public ClientGui(Object o) {
		c = (Client2)o;
		getContentPane().setLayout(new MigLayout("", "[][][][grow][][][grow]", "[][][][grow][][][]"));
		this.setSize(400, 300);
		JTextArea textArea = new JTextArea();
		getContentPane().add(textArea, "cell 6 3,grow");
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// JOptionPane.showMessageDialog(btnSend, textArea.getText());
				text = textArea.getText().toString();
				
					c.sendMessage(text);
				
			}
		});

		textField = new JTextField();
		getContentPane().add(textField, "cell 3 4,growx");
		textField.setColumns(10);

		textField_1 = new JTextField();
		getContentPane().add(textField_1, "cell 3 5,growx");
		textField_1.setColumns(10);

		JButton btnFactorIt = new JButton("Factor it!");
		btnFactorIt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number = Integer.parseInt(textField.getText());

				
				Integer fact = c.factorial(number);
				textField_1.setText(fact.toString());
				System.out.println(fact);
				

			}
		});
		getContentPane().add(btnFactorIt, "cell 3 6,growx");
		getContentPane().add(btnSend, "cell 6 6,growx");

		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}

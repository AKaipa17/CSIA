import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegisterT {

	public JFrame frame;
	private JTextField tffn;
	private JTextField tfln;
	private JTextField tflog;
	private JTextField tfpass;

	public RegisterT() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sqllitedb temp = new sqllitedb();
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setBounds(79, 46, 72, 14);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setBounds(79, 79, 72, 14);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(79, 104, 72, 14);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setBounds(79, 129, 72, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tffn = new JTextField();
		tffn.setBounds(199, 43, 125, 17);
		frame.getContentPane().add(tffn);
		tffn.setColumns(10);
		
		tfln = new JTextField();
		tfln.setColumns(10);
		tfln.setBounds(199, 76, 125, 17);
		frame.getContentPane().add(tfln);
		
		tflog = new JTextField();
		tflog.setColumns(10);
		tflog.setBounds(199, 101, 125, 17);
		frame.getContentPane().add(tflog);

		tfpass = new JTextField();
		tfpass.setColumns(10);
		tfpass.setBounds(199, 126, 125, 17);
		frame.getContentPane().add(tfpass);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp.executeQuery("INSERT INTO Accounts VALUES (NULL, '"+tflog.getText()+
						"', '"+tfpass.getText()+
						"', 2, '"+tffn.getText()+
						"', '"+tfln.getText()+
						"', NULL)");
				temp.executeQuery("CREATE TABLE "+tffn.getText()+tfln.getText()+"G("
						+ "id INTEGER AUTO_INCREMENT PRIMARY KEY  NOT NULL, "
						+ "Name VARCHAR, "
						+ "MaxP INTEGER NOT NULL"
						+ ")");
				temp.executeQuery("CREATE TABLE "+tffn.getText()+tfln.getText()+"HW ("
						+ "id INTEGER AUTO_INCREMENT PRIMARY KEY  NOT NULL, "
						+ "TopicName VARCHAR, "
						+ "Homework VARCHAR"
						+ ")");
				frame.dispose();
			}
		});
		btnSignUp.setBounds(249, 189, 155, 37);
		frame.getContentPane().add(btnSignUp);
	}

}

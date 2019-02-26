import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterS {

	public JFrame frame;
	private JTextField tffn;
	private JTextField tfln;
	private JTextField tflog;
	private JTextField tfpass;
	private JTextField tftn;

	
	public RegisterS() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		sqllitedb temp = new sqllitedb();
		
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
		
		JLabel lblTeacherName = new JLabel("Teacher name:");
		lblTeacherName.setBounds(79, 167, 111, 14);
		frame.getContentPane().add(lblTeacherName);
		
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
		
		tftn = new JTextField();
		tftn.setColumns(10);
		tftn.setBounds(200, 164, 125, 17);
		frame.getContentPane().add(tftn);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp.executeQuery("INSERT INTO Accounts VALUES (NULL, '"+tflog.getText()+
						"', '"+tfpass.getText()+
						"', 1, '"+tffn.getText()+
						"', '"+tfln.getText()+
						"', '"+tftn.getText()+"')");
				int index = temp.checkLogin(tflog.getText(), tfpass.getText())[0];
				temp.executeQuery("ALTER TABLE "+tftn.getText()+"G ADD COLUMN '"
						+Integer.toString(index)+"' INTEGER NOT NULL DEFAULT 0");
				frame.dispose();
			}
		});
		btnSignUp.setBounds(301, 228, 89, 23);
		frame.getContentPane().add(btnSignUp);
	}

}

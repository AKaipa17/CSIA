import java.awt.*;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.*;


public class LoginView {

	private JFrame frame;
	private JPasswordField PassTF;
	private JTextField textField;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public LoginView() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(null);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(83, 84, 46, 14);
		frame.getContentPane().add(lblLogin);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(83, 130, 63, 14);
		frame.getContentPane().add(lblPassword);

		textField = new JTextField();
		textField.setBounds(205, 81, 110, 20);

		PassTF = new JPasswordField();
		PassTF.setBounds(205, 127, 110, 20);
		frame.getContentPane().add(PassTF);
		PassTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER) {
					String login1 = (textField.getText());
					String psword1 = (PassTF.getText());
					sqllitedb temp = new sqllitedb();
					if(temp.checkLogin(login1, psword1)[1] == 1) {
						int accid = temp.checkLogin(login1, psword1)[0];
						String accfn = temp.getNamebyLogin(login1)[0];
						String accln = temp.getNamebyLogin(login1)[1];
						JOptionPane.showMessageDialog(frame, "Correct");
						frame.dispose();
						ProfilePage frame2 = new ProfilePage(accid, accfn, accln);	
						frame2.frame.setVisible(true);
						
					}
					else if(temp.checkLogin(login1, psword1)[1] == 2) {
						int accid = temp.checkLogin(login1, psword1)[0];
						String accfn = temp.getNamebyLogin(login1)[0];
						String accln = temp.getNamebyLogin(login1)[1];
						JOptionPane.showMessageDialog(frame, "Correct");
						frame.dispose();
						ProfilePage1 frame2 = new ProfilePage1(accid, accfn, accln);	
						frame2.frame.setVisible(true);
					}
					else if(temp.checkLogin(login1, psword1)[1] == 3) {
						int accid = temp.checkLogin(login1, psword1)[0];
						String accfn = temp.getNamebyLogin(login1)[0];
						String accln = temp.getNamebyLogin(login1)[1];
						JOptionPane.showMessageDialog(frame, "Correct");
						frame.dispose();
						ProfilePage2 frame2 = new ProfilePage2(accid, accfn, accln);						
						frame2.frame.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(frame, "No such combniation of login and password found. Try Again!");
					}
				}
			}
		});



		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblLoginPage = new JLabel("Login page");
		lblLoginPage.setFont(new Font("Forte", Font.PLAIN, 23));
		lblLoginPage.setBounds(158, 27, 132, 44);
		frame.getContentPane().add(lblLoginPage);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String login1 = (textField.getText());
				String psword1 = (PassTF.getText());
				sqllitedb temp = new sqllitedb();
				if(temp.checkLogin(login1, psword1)[1] == 1) {
					int accid = temp.checkLogin(login1, psword1)[0];
					String accfn = temp.getNamebyLogin(login1)[0];
					String accln = temp.getNamebyLogin(login1)[1];
					JOptionPane.showMessageDialog(frame, "Correct");
					frame.dispose();
					ProfilePage frame2 = new ProfilePage(accid, accfn, accln);	
					frame2.frame.setVisible(true);
					
				}
				else if(temp.checkLogin(login1, psword1)[1] == 2) {
					int accid = temp.checkLogin(login1, psword1)[0];
					String accfn = temp.getNamebyLogin(login1)[0];
					String accln = temp.getNamebyLogin(login1)[1];
					JOptionPane.showMessageDialog(frame, "Correct");
					frame.dispose();
					ProfilePage1 frame2 = new ProfilePage1(accid, accfn, accln);	
					frame2.frame.setVisible(true);
				}
				else if(temp.checkLogin(login1, psword1)[1] == 3) {
					int accid = temp.checkLogin(login1, psword1)[0];
					String accfn = temp.getNamebyLogin(login1)[0];
					String accln = temp.getNamebyLogin(login1)[1];
					JOptionPane.showMessageDialog(frame, "Correct");
					frame.dispose();
					ProfilePage2 frame2 = new ProfilePage2(accid, accfn, accln);						
					frame2.frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(frame, "No such combniation of login and password found. Try Again!");
				}
			}

		});

		btnLogin.setFont(new Font("Tahoma", Font.ITALIC, 18));
		btnLogin.setBounds(176, 178, 114, 35);
		frame.getContentPane().add(btnLogin);

	}
}


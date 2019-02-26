import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfilePage2 {

	public JFrame frame;
	private int id;
	private String firstn;
	private String lastn;
	

	public ProfilePage2(int i, String fn, String ln) {
		id = i;
		firstn = fn;
		lastn = ln;
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(firstn +" "+ lastn+"'s profile");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Algerian", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(0, 0, 434, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnRegisterStudent = new JButton("Register Student");
		btnRegisterStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterS frame2 = new RegisterS();	
				frame2.frame.setVisible(true);
			}
		});
		btnRegisterStudent.setBounds(32, 64, 162, 66);
		frame.getContentPane().add(btnRegisterStudent);
		
		JButton btnRegisterTeacher = new JButton("Register Teacher");
		btnRegisterTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterT frame2 = new RegisterT();	
				frame2.frame.setVisible(true);
			}
		});
		btnRegisterTeacher.setBounds(227, 64, 162, 66);
		frame.getContentPane().add(btnRegisterTeacher);
	}
}

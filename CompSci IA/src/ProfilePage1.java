import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfilePage1 {

	public JFrame frame;
	private int id;
	private String firstn;
	private String lastn;

	
	public ProfilePage1(int i, String fn, String ln) {
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
		
		JButton btnSetGrades = new JButton("Set grades");
		btnSetGrades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GradePageT frame2 = new GradePageT(id);	
				frame2.frame.setVisible(true);
			}
		});
		btnSetGrades.setBounds(158, 71, 138, 31);
		frame.getContentPane().add(btnSetGrades);
		
		JButton btnGiveHomework = new JButton("Give Homework");
		btnGiveHomework.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeworkPageT frame2 = new HomeworkPageT(id);	
				frame2.frame.setVisible(true);
			}
		});
		btnGiveHomework.setBounds(158, 157, 138, 31);
		frame.getContentPane().add(btnGiveHomework);
	}
}

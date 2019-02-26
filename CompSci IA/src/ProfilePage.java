import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfilePage {

	public JFrame frame;
	private int id;
	private String firstn;
	private String lastn;
	
	public ProfilePage(int i, String fn, String ln) {
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
		
		JButton btnGrades = new JButton("Grades");
		btnGrades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GradesPageS frame2 = new GradesPageS(id);	
				frame2.frame.setVisible(true);
			}
		});
		btnGrades.setBounds(159, 92, 101, 29);
		frame.getContentPane().add(btnGrades);
		
		JButton btnHomework = new JButton("Homework");
		btnHomework.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeworkPageS frame2 = new HomeworkPageS(id);	
				frame2.frame.setVisible(true);
			}
		});
		btnHomework.setBounds(159, 173, 101, 29);
		frame.getContentPane().add(btnHomework);
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeworkPageT {

	public JFrame frame;
	private int l;
	private JTextField textField;
	private JTextField textField_1;

	public HomeworkPageT(int id) {
		l=id;
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		sqllitedb temp = new sqllitedb();
		
		JLabel lblTopicName = new JLabel("Topic name");
		lblTopicName.setBounds(41, 47, 131, 27);
		frame.getContentPane().add(lblTopicName);
		
		JLabel lblHomework = new JLabel("Homework");
		lblHomework.setBounds(41, 104, 131, 27);
		frame.getContentPane().add(lblHomework);
		
		textField = new JTextField();
		textField.setBounds(162, 50, 224, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(162, 107, 224, 20);
		frame.getContentPane().add(textField_1);
		
		JButton btnGive = new JButton("ASSIGN");
		btnGive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String teachername = (temp.getNamebyID(l)[0]+temp.getNamebyID(l)[1]);
				temp.executeQuery("INSERT INTO "+teachername+"HW VALUES (NULL, '"+textField.getText()+"', '"+textField_1.getText()+"')");
				frame.dispose();
			}
		});
		btnGive.setBounds(211, 173, 131, 45);
		frame.getContentPane().add(btnGive);
	}
}

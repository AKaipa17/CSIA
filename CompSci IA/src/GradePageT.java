import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GradePageT {

	public JFrame frame;
	private int l;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel student1;
	private JLabel student2;
	private JLabel student3;
	private JLabel student4;
	private JLabel student5;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnAssess;

	public GradePageT(int id) {
		l=id;
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		sqllitedb temp = new sqllitedb();
		int number = temp.getNumberOfStudents(l);
		
		JLabel lblAssessmentName = new JLabel("Assessment name");
		lblAssessmentName.setBounds(62, 25, 98, 14);
		frame.getContentPane().add(lblAssessmentName);
		
		textField = new JTextField();
		textField.setBounds(170, 22, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblMaximumPoints = new JLabel("Maximum Points");
		lblMaximumPoints.setBounds(62, 50, 98, 14);
		frame.getContentPane().add(lblMaximumPoints);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 47, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		if (number==1) {
			String s1 = temp.getColumnName(4, l);
			String[] lol = temp.getNamebyID(Integer.parseInt(s1));
			student1 = new JLabel(lol[0]+" "+lol[1]);
			student1.setBounds(62, 78, 98, 14);
			frame.getContentPane().add(student1);
			
			textField_2 = new JTextField();
			textField_2.setBounds(170, 78, 86, 20);
			frame.getContentPane().add(textField_2);
			textField_2.setColumns(10);
		}else if(number ==2) {
			String[] lol = temp.getNamebyID(Integer.parseInt(temp.getColumnName(4, l)));
			student1 = new JLabel(lol[0]+" "+lol[1]);
			student1.setBounds(62, 78, 98, 14);
			frame.getContentPane().add(student1);
			
			String[] lol1 = temp.getNamebyID(Integer.parseInt(temp.getColumnName(5, l)));
			student2 = new JLabel(lol1[0]+" "+lol1[1]);
			student2.setBounds(62, 121, 98, 14);
			frame.getContentPane().add(student2);
			
			textField_2 = new JTextField();
			textField_2.setBounds(170, 78, 86, 20);
			frame.getContentPane().add(textField_2);
			textField_2.setColumns(10);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(170, 115, 86, 20);
			frame.getContentPane().add(textField_3);
		}else if(number ==3) {
			String[] lol = temp.getNamebyID(Integer.parseInt(temp.getColumnName(4, l)));
			student1 = new JLabel(lol[0]+" "+lol[1]);
			student1.setBounds(62, 78, 98, 14);
			frame.getContentPane().add(student1);
			
			String[] lol1 = temp.getNamebyID(Integer.parseInt(temp.getColumnName(5, l)));
			student2 = new JLabel(lol1[0]+" "+lol1[1]);
			student2.setBounds(62, 121, 98, 14);
			frame.getContentPane().add(student2);
			
			String[] lol2 = temp.getNamebyID(Integer.parseInt(temp.getColumnName(6, l)));
			student3 = new JLabel(lol2[0]+" "+lol2[1]);
			student3.setBounds(62, 152, 98, 14);
			frame.getContentPane().add(student3);
			
			textField_2 = new JTextField();
			textField_2.setBounds(170, 78, 86, 20);
			frame.getContentPane().add(textField_2);
			textField_2.setColumns(10);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(170, 115, 86, 20);
			frame.getContentPane().add(textField_3);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(170, 146, 86, 20);
			frame.getContentPane().add(textField_4);
		}else if(number==4) {
			String[] lol = temp.getNamebyID(Integer.parseInt(temp.getColumnName(4, l)));
			student1 = new JLabel(lol[0]+" "+lol[1]);
			student1.setBounds(62, 78, 98, 14);
			frame.getContentPane().add(student1);
			
			String[] lol1 = temp.getNamebyID(Integer.parseInt(temp.getColumnName(5, l)));
			student2 = new JLabel(lol1[0]+" "+lol1[1]);
			student2.setBounds(62, 121, 98, 14);
			frame.getContentPane().add(student2);
			
			String[] lol2 = temp.getNamebyID(Integer.parseInt(temp.getColumnName(6, l)));
			student3 = new JLabel(lol2[0]+" "+lol2[1]);
			student3.setBounds(62, 152, 98, 14);
			frame.getContentPane().add(student3);
			
			String[] lol3 = temp.getNamebyID(Integer.parseInt(temp.getColumnName(7, l)));
			student4 = new JLabel(lol3[0]+" "+lol3[1]);
			student4.setBounds(62, 186, 98, 14);
			frame.getContentPane().add(student4);
			
			textField_2 = new JTextField();
			textField_2.setBounds(170, 78, 86, 20);
			frame.getContentPane().add(textField_2);
			textField_2.setColumns(10);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(170, 115, 86, 20);
			frame.getContentPane().add(textField_3);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(170, 146, 86, 20);
			frame.getContentPane().add(textField_4);
			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(170, 180, 86, 20);
			frame.getContentPane().add(textField_5);
		}else if(number==5) {
			String[] lol = temp.getNamebyID(Integer.parseInt(temp.getColumnName(4, l)));
			student1 = new JLabel(lol[0]+" "+lol[1]);
			student1.setBounds(62, 78, 98, 14);
			frame.getContentPane().add(student1);
			
			String[] lol1 = temp.getNamebyID(Integer.parseInt(temp.getColumnName(5, l)));
			student2 = new JLabel(lol1[0]+" "+lol1[1]);
			student2.setBounds(62, 121, 98, 14);
			frame.getContentPane().add(student2);
			
			String[] lol2 = temp.getNamebyID(Integer.parseInt(temp.getColumnName(6, l)));
			student3 = new JLabel(lol2[0]+" "+lol2[1]);
			student3.setBounds(62, 152, 98, 14);
			frame.getContentPane().add(student3);
			
			String[] lol3 = temp.getNamebyID(Integer.parseInt(temp.getColumnName(7, l)));
			student4 = new JLabel(lol3[0]+" "+lol3[1]);
			student4.setBounds(62, 186, 98, 14);
			frame.getContentPane().add(student4);
			
			String[] lol4 = temp.getNamebyID(Integer.parseInt(temp.getColumnName(8, l)));
			student5 = new JLabel(lol4[0]+" "+lol4[1]);
			student5.setBounds(62, 217, 98, 14);
			frame.getContentPane().add(student5);
			
			textField_2 = new JTextField();
			textField_2.setBounds(170, 78, 86, 20);
			frame.getContentPane().add(textField_2);
			textField_2.setColumns(10);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(170, 115, 86, 20);
			frame.getContentPane().add(textField_3);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(170, 146, 86, 20);
			frame.getContentPane().add(textField_4);
			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(170, 180, 86, 20);
			frame.getContentPane().add(textField_5);
			
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(170, 211, 86, 20);
			frame.getContentPane().add(textField_6);
		}
		
		btnAssess = new JButton("Assess");
		btnAssess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String teachername = (temp.getNamebyID(l)[0]+temp.getNamebyID(l)[1]);
				if (number == 5) {
					temp.executeQuery("INSERT INTO "+teachername+"G VALUES (NULL, '"+textField.getText()+
						"', "+Integer.parseInt(textField_1.getText())+
						", "+Integer.parseInt(textField_2.getText())+
						"', "+Integer.parseInt(textField_3.getText())+
						"', "+Integer.parseInt(textField_4.getText())+
						"', "+Integer.parseInt(textField_5.getText())+
						"', "+Integer.parseInt(textField_6.getText())+")");}
				else if (number == 4) {
					temp.executeQuery("INSERT INTO "+teachername+"G VALUES (NULL, '"+textField.getText()+
							"', "+Integer.parseInt(textField_1.getText())+
							", "+Integer.parseInt(textField_2.getText())+
							"', "+Integer.parseInt(textField_3.getText())+
							"', "+Integer.parseInt(textField_4.getText())+
							"', "+Integer.parseInt(textField_5.getText())+")");}
				else if (number == 3) {
					temp.executeQuery("INSERT INTO "+teachername+"G VALUES (NULL, '"+textField.getText()+
							"', "+Integer.parseInt(textField_1.getText())+
							", "+Integer.parseInt(textField_2.getText())+
							"', "+Integer.parseInt(textField_3.getText())+
							"', "+Integer.parseInt(textField_4.getText())+")");
				}
				else if (number == 2) {
					temp.executeQuery("INSERT INTO "+teachername+"G VALUES (NULL, '"+textField.getText()+
							"', "+Integer.parseInt(textField_1.getText())+
							", "+Integer.parseInt(textField_2.getText())+
							"', "+Integer.parseInt(textField_3.getText())+")");
				}
				else if (number == 1) {
					temp.executeQuery("INSERT INTO "+teachername+"G VALUES (NULL, '"+textField.getText()+
							"', "+Integer.parseInt(textField_1.getText())+
							", "+Integer.parseInt(textField_2.getText())+")");
				}
				frame.dispose();
			}
		});
		btnAssess.setBounds(312, 217, 89, 23);
		frame.getContentPane().add(btnAssess);
	}
}

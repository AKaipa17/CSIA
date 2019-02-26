import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HomeworkPageS {

	public JFrame frame;
	private int l;

	public HomeworkPageS(int id) {
		l=id;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Object[] columns = {"Topic Name", "Homework"};
		sqllitedb temp = new sqllitedb();
		
		
		JTable table = new JTable();
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		String[][] lol = temp.getHWbyID(l);
		for(int i=0; i<lol[0].length;i++) {
			String topicname = lol[0][i];
			String hw = lol[1][i];
			Object[] forRows = {topicname, hw};
			model.addRow(forRows);
		}
		table.setModel(model);
		JScrollPane scrollPane = new JScrollPane(table);
		frame.add(scrollPane);
	}

}

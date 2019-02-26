import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;

public class GradesPageS {

	public JFrame frame;
	private int l;

	public GradesPageS(int id) {
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
		
		Object[] columns = {"Assessment Name", "Your Score", "Maximum Score", "Percentage"};
		sqllitedb temp = new sqllitedb();
		
		
		JTable table = new JTable();
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		String[][] lol = temp.getGradesbyID(l);
		for(int i=0; i<lol[0].length;i++) {
			String assname = lol[0][i];
			int yscore = Integer.parseInt(lol[1][i]);
			int mscore = Integer.parseInt(lol[2][i]);
			Object[] forRows = {assname, yscore, mscore, Integer.toString(yscore*100/mscore)+"%"};
			model.addRow(forRows);
		}
		table.setModel(model);
		JScrollPane scrollPane = new JScrollPane(table);
		frame.add(scrollPane);
	}
}

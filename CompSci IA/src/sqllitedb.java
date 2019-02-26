import java.sql.*;



public class sqllitedb {
	Connection conn = null;
	Statement stmt = null;
	sqllitedb(){
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:CSIA.sqlite");
		} catch(Exception e){
			
		}
	}
	
	public String[] getNamebyID(int id) {
		String name[] = new String[2];
		try {
			this.stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Accounts");
			while(rs.next()) {
				if(rs.getInt("id")==id) {
					name[0]= rs.getString("firstname");
					name[1]=rs.getString("lastname");
				}
			}
		}catch(Exception e){
		}
		return name;
	}
	
	public int getNumberOfStudents(int id) {
		int nos= 0;
		try {
			this.stmt = conn.createStatement();
			String[] teachername = this.getNamebyID(id);
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+teachername[0]+teachername[1]+"G");
			ResultSetMetaData rsmd = rs.getMetaData();
			nos = rsmd.getColumnCount()-3;
			
		}catch(Exception e){
		}
		return nos;	
	}
	
	public void executeQuery(String query) {
		try {
			this.stmt = conn.createStatement();
			stmt.executeUpdate(query);
			}
		catch(Exception e) {	
		}
	}
	
	public String getColumnName(int coln, int tid) {
		String cn=null;
		try {
			this.stmt = conn.createStatement();
			String[] teachername = this.getNamebyID(tid);
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+teachername[0]+teachername[1]+"G");
			ResultSetMetaData rsmd = rs.getMetaData();
			cn = rsmd.getColumnName(coln);
			
		}catch(Exception e){
		}
		return cn;
	}
	
	public int[] checkLogin(String keyl, String keyp) {
		int log[] = new int[2];
		try {
			this.stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Accounts");
			while(rs.next()) {
				if(rs.getString("login").equals(keyl) && rs.getString("password").equals(keyp)) {
				log[0] = rs.getInt("id");
				log[1] = rs.getInt("priority");
				
				}
			}
		}catch(Exception e){
		}
		return log;
	}
	
	public String[][] getGradesbyID(int id) {
		int rowcount = 0;
		String teachername = null;
		try {
			this.stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Accounts WHERE id = "
												+ Integer.toString(id));
			teachername = rs.getString("Working with");
			ResultSet rs1 = stmt.executeQuery("SELECT * FROM "+teachername+"G");
			while(rs1.next()) {
				rowcount++;
			}
		}catch(Exception e){
			
		}
		String lol[][] = new String[3][rowcount];
		
		try {
			this.stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+teachername+"G");
			int temp = 0;
			while(rs.next()) {
				lol[0][temp] = rs.getString("Name");
				lol[1][temp] = rs.getString(Integer.toString(id));
				lol[2][temp] = rs.getString("MaxP");
				temp++;
			}
		}catch(Exception e){
			
		}
		return lol;
		
	}
	public String[][] getHWbyID(int id) {
		int rowcount = 0;
		String teachername = null;
		try {
			this.stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Accounts WHERE id = "
											+ Integer.toString(id));
			teachername = rs.getString("Working with");
			ResultSet rs1 = stmt.executeQuery("SELECT * FROM "+teachername+"HW");
			while(rs1.next()) {
				rowcount++;
			}
		}catch(Exception e){
		}
		String lol[][] = new String[2][rowcount];
		
		try {
			this.stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM "+teachername+"HW");
			int temp = 0;
			while(rs.next()) {
				lol[0][temp] = rs.getString("TopicName");
				lol[1][temp] = rs.getString("Homework");
				temp++;
			}
		}catch(Exception e){
			
		}
		return lol;	
	}
	
	public String[] getNamebyLogin(String keyl) {
		String fln[] = new String[2];
		try {
			this.stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Accounts");
			while(rs.next()) {
				if(rs.getString("login").equals(keyl)) {
				fln[0] = rs.getString("firstname");
				fln[1] = rs.getString("lastname");
				}
			}
		}catch(Exception e){
		}
		return fln;
	}
	
}

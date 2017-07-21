package _01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ReadDeptData {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdb?useSSL=true";
		String user = "root";
		String password = "1010";
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			//セ:把计
			//Connection con = DriverManager.getConnection(url
			//+"?useSSL=true&user=root&password=password");
		//セ:
			/*	Properties prop= new Properties();
				prop.put("user","root");
				prop.put("password","password");
				prop.put("useSSL","true");
			 */
		//セ:ㄢ把计
			//Connection con = DriverManager.getConnection(url,prop);
		//セ:把计
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		String sql= "SELECT * FROM DEPARTMENT";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next() ){
			int id = rs.getInt(1);
			String deptNo = rs.getString(2);
			String deptName= rs.getString(3);
			String deptLoc = rs.getString(4);
			System.out.printf("%3d %2s %-5s %-10s\n", id, deptNo, deptName, deptLoc);
		}
		rs.close();
		stmt.close();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		/*	String url = "jdbc:mysql://localhost:3306/jdbcdb?useSSL=true";
		String user = "root";
		String password = "1010";
		try {
			Connection con= DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			String sql= "SELECT * FROM DEPARTMENT";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next() ){
				int id = rs.getInt(1);
				String deptNo = rs.getString(2);
				String deptName= rs.getString(3);
				String deptLoc = rs.getString(4);
				System.out.printf("%3d %2s %-5s %-10s\n", id, deptNo, deptName, deptLoc);
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

}

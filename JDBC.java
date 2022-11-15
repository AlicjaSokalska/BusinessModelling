import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
	
	public JDBC() throws Exception {
		  
		Connection connection;
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?serverTimezone=UTC","root","rootroot");
		
		PreparedStatement createUser = connection.prepareStatement(
				"INSERT into users "
				+ "(username, password)" + " VALUES (?, ?)"
				);
		
		createUser.setString(1, "Mary Byrne");
		createUser.setString(2, "secret007");       
		int rowsUpdated = createUser.executeUpdate();
		
		createUser.close();
		 
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from users");
		
		while(rs.next()) {
			System.out.println("Column 1 in ResultSet : " + rs.getString(1));
			System.out.println("Column 2 in ResultSet : " + rs.getString(2));
		}
	}
	
	public static void main(String[] args) throws Exception {
		new JDBC();
	}
	

}  

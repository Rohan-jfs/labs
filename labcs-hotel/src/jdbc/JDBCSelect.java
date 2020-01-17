package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect {
public static void main(String[] args) {
	//get ojdbc 14.jar
	//load the driver
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		Statement statement=connection.createStatement();
		ResultSet resultset= statement.executeQuery("select * from employees");
		while(resultset.next())
		{
			int employeeId=resultset.getInt(1);
			String firstName=resultset.getString(2);
			System.out.println(employeeId+"->"+firstName);
		}
	}
	catch (ClassNotFoundException e) {
		
		System.out.println(e);
	} catch (SQLException e) {
	
		e.printStackTrace();
	}
}
}

package after;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class FileDB {
    //Single Responsibility
    String objectStr = MyUtils.serializeIntoAString(this);
	Connection connection = null;
	Statement stmt = null;

    public void dbStorage(){
        Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB","root","password");
		stmt = connection.createStatement();
		stmt.execute("INSERT INTO EMPLOYEE VALUES (" + objectStr + ")");
    }
}

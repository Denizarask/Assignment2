
import java.sql.Connection;
import java.sql.DriverManager;

public class Assignment2{

public static Connection getConnection()throws Exception{

try{
String url = "jdbc:mysql://localhost:3306/JDBC_assigment2";




Connection conn = DriverManager.getConnection(url);
System.out.println("Connected to database!");
return conn;
}catch(Exception e){System.out.println(e);}
return null;
}


public static void main(String[]args) throws Exception{
getConnection();

}
}


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a
 */
public class DbConnection {
      static String JDBC="oracle.jdbc.driver.OracleDriver";
  static  String URL="jdbc:oracle:thin:@localhost:1521:xe";
    
    
static String user="CLM";
static String pass="CLM";
static Connection con=null;
public static Connection conMethod() throws SQLException, ClassNotFoundException{
    Class.forName(JDBC);
    
    con=DriverManager.getConnection(URL,user,pass);
    return con;
    
}
    
}

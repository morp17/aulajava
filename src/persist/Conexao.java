package persist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
	
	public Conexao(){
		try {
			Class.forName("com.mysql.jdbc.driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	protected Connection getConnection() throws SQLException{
		String url = "jdbc:mysql://127.0.0.1:3306/banco";
		
		Connection conn = DriverManager.getConnection(url, "root", "");
		return conn;
	}

}


package prjProdutosDBSessionJSTL;

import java.sql.*;

public class ConnectionFactory {
	public Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://10.90.67.148:3306/produtos", "aluno", "aluno");
		} catch (Exception e){
			throw new RuntimeException(e);
		}
	}
}

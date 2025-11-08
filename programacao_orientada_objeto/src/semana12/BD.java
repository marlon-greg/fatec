package semana12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import semana12.BD;

public class BD {
    public Connection con = null; // Realiza a conexão
    public PreparedStatement st = null; // Executa instruções
    public ResultSet rs = null;

    public final String DATABASE = "Empresa"; // Nome do Banco
    // No postgres não há necessidade de definição dessa linha, que é o caminho do DRIVER
    public final String DRIVER = "";
    public final String URL = "jdbc:postgresql://localhost:5433/"+DATABASE; // Caminho para conectar ao Banco
    public final String LOGIN = "postgres"; // Usuário para conexão ao banco
    public final String SENHA = "123"; // Senha para conexão ao banco

/**
 * Realiza a conexão com o banco de dados
 * @return - true em caso de sucesso, ou false caso contrário
 */
public boolean getConnection() {
	//Class.forName(DRIVER);
	try {
		con = DriverManager.getConnection(URL,LOGIN,SENHA);
		System.out.println("Conectou!");
		return true;
	}
	catch(SQLException erro) {
		System.out.println("Falha na conexão! " + erro);
		return false;
	}
	
}

/**
 * Encerra a conexão e libera os objetos utilizados
 */
public void close() {
	try {
		if(rs!=null) rs.close();
	}
	catch(SQLException e) {}
	
	try {
		if(st!=null) st.close();
	}
	catch(SQLException e) {}
	try {
		if(con!=null) {
			con.close();
			System.out.println("Desconectou!");
		}
	}
	catch(SQLException e) {}

}

public static void main(String[] args) {
	BD bd = new BD();
	bd.getConnection();
	bd.close();
}
}

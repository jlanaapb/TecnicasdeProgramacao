package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDAO {

	private String host;
	private String usuario;
	private String senha;
	private String banco;

	public ConexaoDAO() {

		this.host = "127.0.0.1";
		this.banco = "dados_sistema_iluminacao";
		this.usuario = "root";
		this.senha = "";
	}

	public Connection getConexao() {
		String url="jdbc:mysql://" + this.host + "/" + this.banco+"?verifyServerCertificate=false&useSSL=true";
		try {
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException ex) {
			System.out.println("Conexao com MYSQL nao realizada");
			ex.printStackTrace();
		}
		return null;
	}
}

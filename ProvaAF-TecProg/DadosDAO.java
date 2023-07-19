
package Model;

import Control.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DadosDAO {

	public String selecionar() {
		String relatorio = "";

		try {
			Connection conexao = new ConexaoDAO().getConexao();

			PreparedStatement r = conexao.prepareStatement("select * from dados order by relatorio");

			ResultSet resultado = r.executeQuery();

			while (resultado.next()) {
				Dados dado = new Dados();
				dado.setDadosRelat(resultado.getString("relatorio"));

				relatorio=dado.getDadosRelat();
			}

			conexao.close();
		} catch (Exception e) {
		}
		return relatorio;
	}

	public int inserir(String relat) {
		int resp = 0;
		try {
			Connection conexao = new ConexaoDAO().getConexao();

			PreparedStatement inserir = conexao.prepareStatement("insert into dados" 
			+ "(relatorio) " + "values (?)");

			inserir.setString(1, relat);

			resp = inserir.executeUpdate();

			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resp;
	}

}

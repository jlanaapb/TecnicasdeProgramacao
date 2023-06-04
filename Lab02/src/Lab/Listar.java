package Lab;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Listar extends JPanel{


	public Listar() {
		Object [][] dados = {{ "Toin", "111.777.111-00", "00112233", "dos mamao" }};
		String[] colunas = { "Nome", "CPF", "Matrícula", "Vertente" };
		JTable tabela = new JTable(dados, colunas);		
		tabela.setRowHeight(30);
		JScrollPane painelRolagem = new JScrollPane(tabela);				
		this.add(painelRolagem);
		
		this.setVisible(true);
	}
	
}

package Lab;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;

public class Cadastro extends JPanel{
	
	
	public Cadastro() {
		Dimension dimensao = new Dimension(250,50);
		this.setLayout(new GridLayout(5,2));
		
		JLabel nome = new JLabel(" Nome:");
		JTextField textoN = new JTextField();
		textoN.setPreferredSize(dimensao);
		
		JLabel cpf = new JLabel(" CPF:");
		JTextField textoCpf = new JTextField(5);
		
		JLabel matricula = new JLabel(" Matrícula:");
		JTextField textoMat = new JTextField(5);
		
		JLabel vertente= new JLabel(" Vertente:");
		JTextField textoVert = new JTextField(5);
		
		Botao botao = new Botao("Salvar");
		
		
		
		
		this.add(nome);
		this.add(textoN);
		this.add(cpf);
		this.add(textoCpf);
		this.add(matricula);
		this.add(textoMat);
		this.add(vertente);
		this.add(textoVert);
		this.add(new JLabel(" "));
		this.add(botao);

		
		this.setVisible(true);
		
	
	}
	
	
}

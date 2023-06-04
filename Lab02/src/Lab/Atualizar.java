package Lab;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Atualizar extends JPanel{

	public Atualizar() {
		Dimension dimensao = new Dimension(250,40);
		this.setLayout(new GridLayout(3,2));
		
		JLabel matricula = new JLabel("Matrícula:");
		JTextField textoMat = new JTextField(10);
		textoMat.setPreferredSize(dimensao);
		JLabel vertente = new JLabel("Vertente:");
		JTextField textoVert = new JTextField(10);
		Botao botao = new Botao(" Atualizar");
		
		this.add(matricula);
		this.add(textoMat);
		this.add(vertente);
		this.add(textoVert);
		this.add(new JLabel(" "));
		this.add(botao);
		
		this.setVisible(true);
	}
}

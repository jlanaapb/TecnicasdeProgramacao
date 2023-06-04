package Lab;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Deletar extends JPanel{

	public Deletar() {
	Dimension dimensao = new Dimension(250,50);
	this.setLayout(new GridLayout(2,2));
		
		JLabel matricula = new JLabel("Matrícula:");
		JTextField textoMat = new JTextField(10);
		textoMat.setPreferredSize(dimensao);
		Botao botao = new Botao(" Deletar");
		
		this.add(matricula);
		this.add(textoMat);
		this.add(new JLabel(" "));
		this.add(botao);
	
		this.setVisible(true);
		
	}

	
}

package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class JanelaPrincipal extends JFrame {
	private PainelSuperior painelSuperior;
	private PainelGeral painelGeral;

	public JanelaPrincipal() {
		PainelSuperior painelSuperior = new PainelSuperior();
		PainelGeral painelGeral = new PainelGeral();
		setSize(new Dimension(600,600));
		setTitle("Palco Aeroporto");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(getBackground());
		adicionaPaineis(painelSuperior, painelGeral);
	}

	public void adicionaPaineis(PainelSuperior painelSuperior, PainelGeral painelGeral) {
		this.setLayout(new BorderLayout());
		this.add(painelSuperior, BorderLayout.NORTH);
		this.add(painelGeral, BorderLayout.CENTER);
		this.setVisible(true);
	}

}

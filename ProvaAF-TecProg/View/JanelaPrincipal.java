package View;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class JanelaPrincipal extends JFrame {
	private PainelSuperior painelSuperior;
	private PainelGeral painelGeral;


	public JanelaPrincipal() {
		PainelSuperior painelSuperior = new PainelSuperior();
		PainelGeral painelGeral = new PainelGeral();
		setSize(new Dimension(550,550));
		setTitle("Palco Aeroporto");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		adicionaPaineis(painelSuperior, painelGeral);
	
	}

	public void adicionaPaineis(PainelSuperior painelSuperior, PainelGeral painelGeral) {
		  try {
	            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		this.setLayout(new BorderLayout());
		this.add(painelSuperior, BorderLayout.NORTH);
		this.add(painelGeral, BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	
}

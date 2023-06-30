package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Janela extends JFrame {

	private static Tabuleiro tabuleiro;
	private PainelInicio painelInicio;
	private PainelPontos painelPontos;
	private ImageIcon iconeAux;

	public Janela() {
		try {
	        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
	        UIManager.put("nimbusBase", Color.PINK);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		this.setTitle("Ilha de Java 2.0");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.tabuleiro = new Tabuleiro(this);
		tabuleiro.setVisible(false);
		this.painelPontos = new PainelPontos(this);
		painelPontos.setVisible(false);
		painelInicio= new PainelInicio(this);
		painelInicio.setVisible(true);
		
		this.add(painelInicio, BorderLayout.NORTH);
		this.add(tabuleiro, BorderLayout.CENTER);
		this.add(painelPontos, BorderLayout.EAST);

		this.setVisible(true);

	}
	
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	public PainelInicio getPainelInicio() {
		return painelInicio;
	}
	public void setPainelInicio(PainelInicio painelInicio) {
		this.painelInicio = painelInicio;
	}
	public PainelPontos getPainelPontos() {
		return painelPontos;
	}
	public void setPainelPontos(PainelPontos painelPontos) {
		this.painelPontos = painelPontos;
	}
	public ImageIcon getIconeAux() {
		return iconeAux;
	}
	public void setIconeAux(Icon icon) {
		this.iconeAux = (ImageIcon) icon;
	}

}

package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Jogar implements ActionListener {
	private Janela janela;
	private Tabuleiro tabuleiro;
	public Jogar( Janela janela,Tabuleiro tabuleiro ) {
		this.janela=janela;
	}

	public void actionPerformed(ActionEvent e) {
		janela.getPainelPontos().setVisible(true);
		janela.getTabuleiro().setVisible(true);
		
		
		
		

		
	}
}

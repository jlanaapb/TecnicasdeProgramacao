package View;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PainelInicio extends JPanel{
	private Janela janela;
	private Botao botaoJogar;
	private Botao  botaoRelatorio;
	private String nomeAux;
	
	
	public PainelInicio(Janela janela){
		this.janela=janela;
		criarBotoes();
	}
	
	public void criarBotoes() {
	JLabel nomeJogador = new JLabel("Nome:");
	JTextField textoNome = new JTextField(10);
	this.nomeAux= textoNome.getText();
	Botao botaoJogar= new Botao("Jogar",Color.gray);
	botaoJogar.addActionListener(new Jogar(janela, janela.getTabuleiro()));
	Botao botaoRelatorio= new Botao("Relatorio",Color.gray);
	botaoRelatorio.addActionListener(new Relatorio(janela));

	this.add(nomeJogador);
	this.add(textoNome);
	this.add(botaoJogar);
	this.add(botaoRelatorio);
	this.setVisible(true);
	}

	public String getNomeAux() {
		return nomeAux;
	}

	public void setNomeAux(String nomeAux) {
		this.nomeAux = nomeAux;
	}

	
	
	
}

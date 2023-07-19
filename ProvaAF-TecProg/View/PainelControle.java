package View;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Control.Dados;
import Model.LeituraDeArquivo;

public class PainelControle extends JPanel {

	private PainelPalco painelp = new PainelPalco();
	private LeituraDeArquivo arquivo = new LeituraDeArquivo();
	private Dados dados = new Dados();
	private Botao butRock;
	private Botao butReggae;
	private Botao butEletro;
	private Botao butForte;
	private Botao butFraco;
	private Botao butRapido;
	private Botao butLento;

	public PainelControle() {

		this.setSize(new Dimension(180,400));
		this.setBackground(Color.lightGray);
		this.setVisible(true);
		criaPainel();
	}

	public void criaPainel() {

		JLabel txtRitmo = new JLabel("Ritmos");
		JLabel txtIntensidade = new JLabel("Intensidade das cores");
		JLabel txtvelocidade = new JLabel("Velocidade");
		butRock = new Botao("Rock", Color.WHITE);
		butRock.addActionListener(new acaoRock());
		butReggae = new Botao("Reggae", Color.WHITE);
		butReggae.addActionListener(new acaoReggae());
		butEletro = new Botao("Eletro", Color.WHITE);
		butEletro.addActionListener(new acaoEletro());
		butForte = new Botao("Cor Forte", Color.WHITE);
		butForte.addActionListener(new acaoCorForte());
		butFraco = new Botao("Cor Fraca", Color.WHITE);
		butFraco.addActionListener(new acaoCorFraca());
		butRapido = new Botao("Rápido", Color.WHITE);
		butRapido.addActionListener(new acaoRapido());
		butLento = new Botao("Lento", Color.WHITE);
		butLento.addActionListener(new acaoLento());

		this.setLayout(new GridLayout(12, 1));
		this.add(txtRitmo);
		this.add(butRock);
		this.add(butReggae);
		this.add(butEletro);
		this.add(new JLabel(""));
		this.add(txtIntensidade);
		this.add(butForte);
		this.add(butFraco);
		this.add(new JLabel(""));
		this.add(txtvelocidade);
		this.add(butRapido);
		this.add(butLento);

	}

	public class acaoRock implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String nomeBotao = e.getActionCommand();
			dados.adiciona(nomeBotao);

			String caminho = "src\\Ritmos\\rock.txt";
			arquivo.separaArquivos(caminho);

			painelp.r1.ligaRefletor(arquivo.getRefletor1());
			painelp.r2.ligaRefletor(arquivo.getRefletor2());
			painelp.r3.ligaRefletor(arquivo.getRefletor3());
			painelp.r4.ligaRefletor(arquivo.getRefletor4());
			painelp.r5.ligaRefletor(arquivo.getRefletor5());
			painelp.r6.ligaRefletor(arquivo.getRefletor6());

		}
	}

	public class acaoReggae implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String nome = e.getActionCommand();
			dados.adiciona(nome);

			String caminho = "src\\Ritmos\\reggae.txt";
			arquivo.separaArquivos(caminho);

			painelp.r1.ligaRefletor(arquivo.getRefletor1());
			painelp.r2.ligaRefletor(arquivo.getRefletor2());
			painelp.r3.ligaRefletor(arquivo.getRefletor3());
			painelp.r4.ligaRefletor(arquivo.getRefletor4());
			painelp.r5.ligaRefletor(arquivo.getRefletor5());
			painelp.r6.ligaRefletor(arquivo.getRefletor6());

		}
	}

	public class acaoEletro implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String nomeBotao = ((Botao) e.getSource()).getText();
			dados.adiciona(nomeBotao);

			String caminho = "src\\Ritmos\\eletronico.txt";
			arquivo.separaArquivos(caminho);

			painelp.r1.ligaRefletor(arquivo.getRefletor1());
			painelp.r2.ligaRefletor(arquivo.getRefletor2());
			painelp.r3.ligaRefletor(arquivo.getRefletor3());
			painelp.r4.ligaRefletor(arquivo.getRefletor4());
			painelp.r5.ligaRefletor(arquivo.getRefletor5());
			painelp.r6.ligaRefletor(arquivo.getRefletor6());

		}
	}

	public class acaoCorForte implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String nomeBotao = ((Botao) e.getSource()).getText();
			dados.adiciona(nomeBotao);

			painelp.r1.corForte();
			painelp.r2.corForte();
			painelp.r3.corForte();
			painelp.r4.corForte();
			painelp.r5.corForte();
			painelp.r6.corForte();

		}
	}

	public class acaoCorFraca implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String nomeBotao = ((Botao) e.getSource()).getText();
			dados.adiciona(nomeBotao);

			painelp.r1.corFraca();
			painelp.r2.corFraca();
			painelp.r3.corFraca();
			painelp.r4.corFraca();
			painelp.r5.corFraca();
			painelp.r6.corFraca();


		}
	}

	public class acaoRapido implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String nomeBotao = ((Botao) e.getSource()).getText();
			dados.adiciona(nomeBotao);
		}
	}

	public class acaoLento implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String nomeBotao = ((Botao) e.getSource()).getText();
			dados.adiciona(nomeBotao);
		}

	}

	public Botao getButRock() {
		return butRock;
	}

	public void setButRock(Botao butRock) {
		this.butRock = butRock;
	}

	public Botao getButReggae() {
		return butReggae;
	}

	public void setButReggae(Botao butReggae) {
		this.butReggae = butReggae;
	}

	public Botao getButEletro() {
		return butEletro;
	}

	public void setButEletro(Botao butEletro) {
		this.butEletro = butEletro;
	}

	public Botao getButForte() {
		return butForte;
	}

	public void setButForte(Botao butForte) {
		this.butForte = butForte;
	}

	public Botao getButFraco() {
		return butFraco;
	}

	public void setButFraco(Botao butFraco) {
		this.butFraco = butFraco;
	}

	public Botao getButRapido() {
		return butRapido;
	}

	public void setButRapido(Botao butRapido) {
		this.butRapido = butRapido;
	}

	public Botao getButLento() {
		return butLento;
	}

	public void setButLento(Botao butLento) {
		this.butLento = butLento;
	}

}

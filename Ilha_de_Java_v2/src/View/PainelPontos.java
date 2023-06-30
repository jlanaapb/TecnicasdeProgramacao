package View;

import javax.swing.JPanel;

import Controller.GerenciadorJogo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PainelPontos extends JPanel {

	private JPanel dados = new JPanel();
	private JPanel botoesMenu= new JPanel();
	private JPanel botoesRobo = new JPanel();
	private JPanel organiza = new JPanel();
	private Janela janela;
	private GerenciadorJogo gerencia;
	
	public PainelPontos(Janela janela){
		this.setSize(300,400);
		this.setBackground(Color.white);
		
		JLabel pontuacao= new JLabel("Pontuação:");
		JLabel pontoJogador = new JLabel("pontos");
		JLabel total = new JLabel("Total:");
		JLabel totalAlu = new JLabel("totaldealunos");
		JLabel totalBug = new JLabel("totaldebug:");
		JLabel pontosRobo1 = new JLabel("pontorobo1");
		JLabel pontosRobo2 = new JLabel("pontorobo2");
		JLabel pontosRobo3 = new JLabel("pontorobo3");
		
		
		
//		brainha.addActionListener(new EventoRainha(janela));
//		ImageIcon a = new ImageIcon("C:\\Users\\Usuário\\eclipse-workspace\\Ilha_de_Java_v2\\src\\View\\img\\xadrez-rainha-alt.png");
//		brainha.setIcon(a);
//		
//		JButton  bfischer = new JButton();
//		brainha.addActionListener(new EventoFischer(janela));
//		ImageIcon b = new ImageIcon("C:\\\\Users\\\\Usuário\\\\eclipse-workspace\\\\Ilha_de_Java_v2\\\\src\\\\View\\\\img\\\\programador.png");
//		bfischer.setIcon(b);
//		
//		JButton  peao= new JButton();
//		brainha.addActionListener(new EventoRainha(janela));
//		ImageIcon c = new ImageIcon("C:\\\\Users\\\\Usuário\\\\eclipse-workspace\\\\Ilha_de_Java_v2\\\\src\\\\View\\\\img\\\\peca-de-xadrez.png");
		//peao.setIcon(c);
		
		Rainha botaoRainha = new Rainha(1);
	//	botaoRainha.addActionListener(new EventoRainha(janela,botaoRainha));
		
		Fischer botaoFischer = new Fischer(2);
		Peao botaoPeao = new Peao(3);

		
		Botao botaoVerificar= new Botao("Verificar",Color.green);
		botaoVerificar.addActionListener(new Verificar(janela));
		Botao botaoProximo=new Botao("Próxima Jogada",Color.green);
		botaoProximo.addActionListener(new ProximaJogada(janela));
		Botao botaoSair=new Botao("Sair",Color.green);
		botaoSair.addActionListener(new Sair(janela));
		
		dados.setLayout(new GridLayout(3,5));
		dados.add(pontoJogador);
//		dados.add(pontos);
		dados.add(total);
		
		dados.add(totalAlu);
		dados.add(totalBug);
		dados.add(pontosRobo1);
		dados.add(pontosRobo2);
		dados.add(pontosRobo3);
	
		botoesRobo.setLayout(new FlowLayout());
		botoesRobo.add(botaoPeao);
		botoesRobo.add(botaoFischer);
		botoesRobo.add(botaoRainha);

		botoesMenu.setLayout(new GridLayout(3,1));
		botoesMenu.add(botaoVerificar);
		botoesMenu.add(botaoProximo);
		botoesMenu.add(botaoSair);
	
		organiza.setLayout(new GridLayout(3,1));
		organiza.add(dados);
		organiza.add(botoesRobo);
		organiza.add(botoesMenu);
		
		this.add(organiza);
		
	}

	public JPanel getDados() {
		return dados;
	}

	public void setDados(JPanel dados) {
		this.dados = dados;
	}

	public JPanel getBotoesMenu() {
		return botoesMenu;
	}

	public void setBotoesMenu(JPanel botoesMenu) {
		this.botoesMenu = botoesMenu;
	}

	public JPanel getBotoesRobo() {
		return botoesRobo;
	}

	public void setBotoesRobo(JPanel botoesRobo) {
		this.botoesRobo = botoesRobo;
	}

	
}

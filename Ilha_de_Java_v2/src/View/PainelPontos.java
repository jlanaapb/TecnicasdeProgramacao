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
	private JPanel pontosJogador = new JPanel();
	private JPanel alunoseBugs = new JPanel();
	private JPanel pontosrobos = new JPanel();
	private JPanel botoesMenu= new JPanel();
	private JPanel botoesRobo = new JPanel();
	private JPanel organiza = new JPanel();
	private Janela janela;
	private GerenciadorJogo gerencia;
	
	public PainelPontos(Janela janela){
		this.setSize(300,400);
		this.setBackground(Color.white);
		organizaComponentes();	
	}
	
	private void organizaComponentes() {
		criaPainelDados();
		criaBotoesRobo();
		criaBotoesMenu();
		
        organiza.setLayout(new GridLayout(5, 1));
        organiza.add(pontosJogador);
        organiza.add(alunoseBugs);
        organiza.add(pontosrobos);
        organiza.add(botoesRobo);
        organiza.add(botoesMenu);
        this.add(organiza);
      
    }
	
	public void criaBotoesRobo() {
        Rainha botaoRainha = new Rainha(1);
        Fischer botaoFischer = new Fischer(2);
        Peao botaoPeao = new Peao(3);
        
        botoesRobo.setLayout(new FlowLayout());
        botoesRobo.add(botaoPeao);
        botoesRobo.add(botaoFischer);
        botoesRobo.add(botaoRainha);
	}
	public void criaPainelDados() {
		JLabel pontuacao = new JLabel("Sua pontuação:");
		JLabel pontoJogador = new JLabel("0");// variavel

		ImageIcon imgAlu = new ImageIcon(
				"C:\\Users\\Usuário\\eclipse-workspace\\Ilha_de_Java_v2\\src\\View\\img\\rosto-incrivel.png");
		imgAlu.setImage(imgAlu.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		JLabel Alu = new JLabel(imgAlu);
		JLabel totalAlu = new JLabel("0");// variavel

		ImageIcon imgBug = new ImageIcon(
				"C:\\Users\\Usuário\\eclipse-workspace\\Ilha_de_Java_v2\\src\\View\\img\\erro.png");
		imgBug.setImage(imgBug.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		JLabel bug = new JLabel(imgBug);
		JLabel totalBug = new JLabel("0");// variavel

		ImageIcon imgR1 = new ImageIcon(
				"C:\\Users\\Usuário\\eclipse-workspace\\Ilha_de_Java_v2\\src\\View\\img\\xadrez-rainha-alt.png");
		imgR1.setImage(imgR1.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		JLabel roboRainha = new JLabel(imgR1);
		JLabel pontosRobo1 = new JLabel("0");// variavel

		ImageIcon imgR2 = new ImageIcon(
				"C:\\Users\\Usuário\\eclipse-workspace\\Ilha_de_Java_v2\\src\\View\\img\\programador.png");
		imgR2.setImage(imgR2.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		JLabel roboFischer = new JLabel(imgR2);
		JLabel pontosRobo2 = new JLabel("0");// variavel

		ImageIcon imgR3 = new ImageIcon(
				"C:\\Users\\Usuário\\eclipse-workspace\\Ilha_de_Java_v2\\src\\View\\img\\peca-de-xadrez.png");
		imgR3.setImage(imgR3.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		JLabel roboPeao = new JLabel(imgR3);
		JLabel pontosRobo3 = new JLabel("0");// variavel

        pontosJogador.setLayout(new GridLayout(1,2));
        pontosJogador.add(pontuacao);
        pontosJogador.add(pontoJogador);
 
        alunoseBugs.setLayout(new GridLayout(1,4));
        alunoseBugs.add(Alu);
        alunoseBugs.add(totalAlu);
        alunoseBugs.add(bug);
        alunoseBugs.add(totalBug);
        
        pontosrobos.setLayout(new GridLayout(1,6));
        pontosrobos.add(roboRainha);
        pontosrobos.add(pontosRobo1);
        pontosrobos.add(roboFischer);
        pontosrobos.add(pontosRobo2);
        pontosrobos.add(roboPeao);
        pontosrobos.add(pontosRobo3);
	}
	public void criaBotoesMenu() {
		Botao botaoVerificar = new Botao("Verificar", Color.green);
		botaoVerificar.addActionListener(new Verificar(janela));
		Botao botaoProximo = new Botao("Próxima Jogada", Color.green);
		botaoProximo.addActionListener(new ProximaJogada(janela));
		Botao botaoSair = new Botao("Sair", Color.green);
		botaoSair.addActionListener(new Sair(janela));
		
		botoesMenu.setLayout(new GridLayout(3, 1));
		botoesMenu.add(botaoVerificar);
		botoesMenu.add(botaoProximo);
		botoesMenu.add(botaoSair);
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

package View;

import java.awt.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import Model.*;
import Control.Dados;

public class PainelSuperior extends JPanel {
	private JTextField textoNome;
	private PainelControle pc = new PainelControle();
	private Dados dados = new Dados();
	DadosDAO d = new DadosDAO();

	public PainelSuperior() {
		this.setSize(900, 50);
		criaPainel();
	}

	public void criaPainel() {
		JLabel nome = new JLabel("Técnico de Palco:");
		textoNome = new JTextField(8);
		Botao butIniciar = new Botao("Iniciar", Color.GRAY);
		butIniciar.addActionListener(new acaoIniciar());
		Botao butRelat = new Botao("Relatório", Color.gray);
		butRelat.addActionListener(new acaoRelat());
		Botao butSair = new Botao("Sair", Color.gray);
		butSair.addActionListener(new acaoSair());

		this.setLayout(new FlowLayout());
		this.add(nome);
		this.add(textoNome);
		this.add(butIniciar);
		this.add(butRelat);
		this.add(butSair);
		setVisible(true);
	}

	public static void exibeRelatorio(String string) {
		JFrame frame = new JFrame("Relatório do Sistema");
		JPanel panel = new JPanel();
		JTextArea textArea = new JTextArea(10,30);
		
		
		textArea.setText(string);
		JScrollPane scrollPane = new JScrollPane(textArea);

		panel.add(scrollPane);
		frame.add(panel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public class acaoIniciar implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (textoNome != null) {
				String nome = textoNome.getText();
				dados.adiciona(nome);

			} else {
				JOptionPane.showInputDialog(null, "Digite o nome do jogador:", "Nome do Jogador",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	public class acaoRelat implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			exibeRelatorio(d.selecionar());

		}

	}

	public class acaoSair implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			d.inserir(dados.getDadosRelat());

		}
	}
}

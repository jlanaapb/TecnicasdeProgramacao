package View;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Control.TecnicoSom;

public class PainelSuperior extends JPanel{
	private Botao botao;
	private JanelaPrincipal janela;
	private JTextField textoNome;
	public PainelSuperior() {
		this.setSize(900,50);
		criaPainel();
	}
	
	public void criaPainel() {
	JLabel nome= new JLabel("Técnico de Palco:");
	textoNome = new JTextField(10);
	Botao butIniciar = new Botao("Iniciar",Color.getHSBColor(135,206,235));
	butIniciar.addActionListener(new acaoIniciar());
	Botao butRelat = new Botao("Relatório",Color.getHSBColor(135,206,235));
	Botao butSair = new Botao("Sair",Color.getHSBColor(135,206,235));
	butSair.addActionListener(new acaoSair());
	
	this.setLayout(new FlowLayout());
	this.add(nome);
	this.add(textoNome);
	this.add(butIniciar);
	this.add(butRelat);
	this.add(butSair);
	setVisible(true);
	}
	
	public class acaoIniciar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String nomeTecnico;
			TecnicoSom tecnico = new TecnicoSom();
			nomeTecnico=textoNome.getText();
			tecnico.setNome(nomeTecnico);
		}
		
	}
	public class acaoRelat implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}
	public class acaoSair implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			janela.dispose();
		}
		
	}
}

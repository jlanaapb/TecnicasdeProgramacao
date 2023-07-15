package View;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Control.LeituraDeArquivo;

public class PainelControle extends JPanel {
	public PainelControle() {
	this.setSize(new Dimension(400,840));
		setBackground(Color.gray);
		setVisible(true);
		criaPainel();
	}

	public void criaPainel() {
	
		JLabel txtRitmo = new JLabel("Ritmos");
		JLabel txtIntensidade = new JLabel("Intensidade das cores");
		JLabel txtvelocidade = new JLabel("Velocidade");
		Botao butRock = new Botao("Rock",Color.getHSBColor(211,211,211));
		butRock.addActionListener(new acaoRock());
		Botao butReggae = new Botao("Reggae",Color.getHSBColor(211,211,211));
		Botao butEletro = new Botao("Eletro",Color.getHSBColor(211,211,211));
		Botao butForte = new Botao("Cor Forte",Color.getHSBColor(211,211,211));
		Botao butFraco = new Botao("Cor Fraca",Color.getHSBColor(211,211,211));
		Botao butRapido = new Botao("Rápido",Color.getHSBColor(211,211,211));
		Botao butLento = new Botao("Lento",Color.getHSBColor(211,211,211));
		
		this.setLayout(new GridLayout(12,1));
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
		@Override
		public void actionPerformed(ActionEvent e) {
			String caminho="C:\\Users\\Usuário\\eclipse-workspace\\ProvaAF\\src\\Ritmos\\rock.txt";
			LeituraDeArquivo arquivo = new LeituraDeArquivo(caminho);
			
		}
	}
	
}

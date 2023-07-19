package View;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import Control.*;
import Model.LeituraDeArquivo;

public class PainelPalco extends JPanel {

	LeituraDeArquivo leitura = new LeituraDeArquivo();
	JPanel refletores = new JPanel();
	Refletor r1 = new Refletor(Color.blue);
	Refletor r2 = new Refletor(Color.red);
	Refletor r3 = new Refletor(Color.green);
	Refletor r4 = new Refletor(Color.pink);
	Refletor r5 = new Refletor(Color.yellow);
	Refletor r6 = new Refletor(Color.cyan);

	public PainelPalco() {
		this.setPreferredSize(new Dimension(350, 350));
		this.setBackground(Color.white);
		this.setVisible(true);
		criaPainel();
	}

	public void criaPainel() {

		r1.setPreferredSize(new Dimension(50, 50));
		r2.setPreferredSize(new Dimension(50, 50));
		r3.setPreferredSize(new Dimension(50, 50));
		r4.setPreferredSize(new Dimension(50, 50));
		r5.setPreferredSize(new Dimension(50, 50));
		r6.setPreferredSize(new Dimension(50, 50));

		refletores.setLayout(new FlowLayout());
		refletores.setBackground(Color.white);
		refletores.add(r1);
		refletores.add(r2);
		refletores.add(r3);
		refletores.add(r4);
		refletores.add(r5);
		refletores.add(r6);

		this.setLayout(new BorderLayout());
		this.add(refletores, BorderLayout.NORTH);
		this.setVisible(true);
	}


}

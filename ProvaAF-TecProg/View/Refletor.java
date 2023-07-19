package View;

import javax.swing.Timer;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Refletor extends JPanel {
	private Color cor;

	public Refletor(Color cor) {
		this.cor = cor;
		this.setBackground(cor);
	}

	public void ligaRefletor(ArrayList<String> ligar) {
		int num1 = 1;
		int num0 = 0;
		for (String string : ligar) {
			if (string.equals(String.valueOf(num1))) {
				this.setBackground(cor);
				System.out.println(1);

			}
			if (string.equals(String.valueOf(num0))) {
				this.setBackground(Color.lightGray);
				System.out.println(0);
			}

		}
		this.revalidate();
		this.repaint();

	}

	public void corForte() {
		this.setCor(getCor().darker());
		this.revalidate();
		this.repaint();
	}

	public void corFraca() {
		this.setCor(getCor().brighter());
		this.revalidate();
		this.repaint();
	}

	public Color getCor() {
		return this.cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
		this.setBackground(cor);
	}

}

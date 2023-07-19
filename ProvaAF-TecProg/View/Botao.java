package View;

import java.awt.Color;

import javax.swing.JButton;

public class Botao extends JButton {
	private String texto;
	private Color cor;

	public Botao(String texto, Color cor) {
		this.setText(texto);
		this.setCor(cor);

	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
		this.setBackground(cor);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}

package View;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Botao extends JButton{
	private ImageIcon iconeBotao;
	
	
	public Botao(String nome, Color cor) {
		this.setText(nome);
		this.setBackground(cor);
	}
	
	public ImageIcon getIconeBotao() {
		return iconeBotao;
	}

	public void setIconeBotao(ImageIcon iconeBotao) {
		this.iconeBotao = iconeBotao;
	}

}

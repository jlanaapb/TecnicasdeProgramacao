package View;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Rainha extends Robo {
	private ImageIcon iconeRainha;
	private boolean clicado;
	


	public Rainha(int id) {
	    super(id);
	    iconeRainha = new ImageIcon("C:\\Users\\Usuário\\eclipse-workspace\\Ilha_de_Java_v2\\src\\View\\img\\xadrez-rainha-alt.png");
	    iconeRainha.setImage(iconeRainha.getImage().getScaledInstance(38, 38, Image.SCALE_SMOOTH));
	    setIcon(iconeRainha);
	}

	
	public ImageIcon getIcon()
	{
		return iconeRainha;
	}

	public boolean isClicado() {
		return clicado;
	}

	public void setClicado(boolean clicado) {
		this.clicado = clicado;
	}
}

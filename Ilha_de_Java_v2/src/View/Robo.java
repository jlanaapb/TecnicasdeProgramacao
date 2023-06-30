package View;

import javax.swing.Icon;
import javax.swing.JButton;

public abstract class Robo extends JButton{
	private int pontuacao;
	private int id;
	private Icon icone;
	private boolean clicado;
	
	public Robo(int id) {
		this.id=id;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public Icon getIcone() {
		return icone;
	}

	public void setIcone(Icon icone) {
		this.icone = icone;
	}

	public boolean isClicado() {
		return clicado;
	}

	public void setClicado(boolean clicado) {
		this.clicado = clicado;
	}
	
}

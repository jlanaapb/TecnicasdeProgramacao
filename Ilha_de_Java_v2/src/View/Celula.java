package View;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Celula {
	private boolean temAluno;
	private boolean temBug;
	private int x;
	private Janela janela;
	private int y;
	private ImageIcon icone;
	private BotaoCelula botao;
	
	
	public Celula(int x, int y, Janela janela) {
		super();
		this.janela = janela;
		this.x=x;
		this.y=y;
		temAluno = false;
		temBug = false;
		this.botao = new BotaoCelula("", Color.PINK);
	}
	

	public BotaoCelula getBotao() {
		return botao;
	}


	public void setBotao(BotaoCelula botao) {
		this.botao = botao;
	}


	public boolean isTemAluno() {
		return temAluno;
	}

	public boolean isTemBug() {
		return temBug;
	}

	public boolean isPreenchida() {
		if (temAluno) {
			return true;
		} else if (temBug) {
			return true;
		} else {
			return false;
		}
	}

	public void adicionarAluno() {
		temAluno = true;
//		setBackground(new Color(0x00ff00));
//		setIcon(new ImageIcon(new ImageIcon(
//				"C:\\Users\\Usuário\\eclipse-workspace\\Ilha_de_Java_v2\\src\\View\\img\\rosto-incrivel.png")
//				.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
//		setVisible(true);

	}

	public void adicionarBug() {
		temBug = true;
//		setBackground(new Color(0xff0000));
//		setIcon(new ImageIcon(new ImageIcon(
//				"C:\\Users\\Usuário\\eclipse-workspace\\Ilha_de_Java_v2\\src\\View\\img\\erro.png")
//				.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));setVisible(true);
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public ImageIcon getIcone() {
		return icone;
	}


	public void setIcone(ImageIcon icone) {
		this.icone = icone;
	}

	public BotaoCelula getBotaoCelula() {
		return botao;
	}
	
	public void setBotaoCelula(BotaoCelula botao) {
		this.botao=botao;
	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		icone = janela.getIconeAux();
//		this.setIcon(icone);
//		
//	}
	

}

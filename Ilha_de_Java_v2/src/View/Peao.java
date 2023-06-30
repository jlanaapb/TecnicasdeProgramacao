package View;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
public class Peao extends Robo{
private ImageIcon iconePeao;

public Peao(int id) {
    super(id);
    iconePeao = new ImageIcon("C:\\Users\\Usuário\\eclipse-workspace\\Ilha_de_Java_v2\\src\\View\\img\\peca-de-xadrez.png");
    iconePeao.setImage(iconePeao.getImage().getScaledInstance(38, 38, Image.SCALE_SMOOTH));
    setIcon(iconePeao);
}

	public ImageIcon getIconePeao() {
		return iconePeao;
	}

	public void setIconePeao(ImageIcon iconePeao) {
		this.iconePeao = iconePeao;
	}

	
}

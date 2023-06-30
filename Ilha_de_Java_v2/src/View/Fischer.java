package View;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class Fischer extends Robo {
	ImageIcon iconeFischer;
	
	public Fischer(int id) {
	    super(id);
	    ImageIcon iconeFischer = new ImageIcon("C:\\Users\\Usuário\\eclipse-workspace\\Ilha_de_Java_v2\\src\\View\\img\\programador.png");
	    iconeFischer.setImage(iconeFischer.getImage().getScaledInstance(38, 38, Image.SCALE_SMOOTH));
	    setIcon(iconeFischer);
	}


	public ImageIcon getIconeFischer() {
		return iconeFischer;
	}

	public void setIconeFischer(ImageIcon iconeFischer) {
		this.iconeFischer = iconeFischer;
	}

}

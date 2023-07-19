package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;


public class PainelGeral extends JPanel {
	private PainelPalco palco;
	private PainelControle pControle;
	
	public PainelGeral() {
		PainelPalco palco= new PainelPalco();
		PainelControle pControle=new PainelControle();
		this.palco=palco;
		this.pControle=pControle;
		this.setPreferredSize(new Dimension(600,560));
		criaPainel();
	}
	
	public void criaPainel() {
		this.add(palco, BorderLayout.WEST);
		this.add(pControle, BorderLayout.EAST);
		setVisible(true);
	}
	
	}



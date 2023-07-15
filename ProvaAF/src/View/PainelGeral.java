package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelGeral extends JPanel {
	private PainelPalco palco;
	private PainelControle pControle;
	public PainelGeral() {
		PainelPalco palco= new PainelPalco();
		PainelControle pControle=new PainelControle();
		this.palco=palco;
		this.pControle=pControle;
		setSize(new Dimension(500,550));
		criaPainel();
	}

	public void criaPainel() {
		this.add(palco, BorderLayout.WEST);
		this.add(pControle, BorderLayout.EAST);
		setVisible(true);
	}
}

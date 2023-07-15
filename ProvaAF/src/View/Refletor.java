package View;

import java.awt.Color;

import javax.swing.JPanel;

public class Refletor extends JPanel{
	public Color getCor() {
		return cor;
	}
	public void setCor(Color cor) {
		this.cor = cor;
		this.setBackground(cor);
	}
	private Color cor;
	public Refletor() {
	}
	
	
	
//	public void dormir() {
//		try {
//			Thread.sleep(500);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public void piscar() {
//		while(true) {
//			//painel.setbackgroung(color.ncoie);
//			//dormir();
//			//painel.setback(color.white);
//			//dormi();
//		}
//	}
//	
//	/*
//	 * public statis void main
//	 * janela j = new janela();
//	 * j.piscar();
//	 * */

}

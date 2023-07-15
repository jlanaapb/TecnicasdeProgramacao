package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelPalco extends JPanel{
	JPanel refletores= new JPanel();
	Refletor r1 = new Refletor();
	JPanel r2 = new JPanel();
	JPanel r3 = new JPanel();
	JPanel r4 = new JPanel();
	JPanel r5 = new JPanel();
	JPanel r6 = new JPanel();
	public PainelPalco() {
		this.setPreferredSize(new Dimension(400,400));
		this.setBackground(Color.pink);
		this.setVisible(true);
		criaPainel();
		
	}
	public void criaPainel() {
	

		r1.setPreferredSize(new Dimension(50,50));
		r1.setCor(Color.blue);
		piscar(r1);
		
		r2.setPreferredSize(new Dimension(50,50));
		r2.setBackground(Color.red);
		
		r3.setPreferredSize(new Dimension(50,50));
		r3.setBackground(Color.green);
		
		r4.setPreferredSize(new Dimension(50,50));
		r4.setBackground(Color.pink);
		
		r5.setPreferredSize(new Dimension(50,50));
		r5.setBackground(Color.yellow);
		
		r6.setPreferredSize(new Dimension(50,50));
		r6.setBackground(Color.cyan);
		
		refletores.setLayout(new FlowLayout());
		refletores.setBackground(Color.white);
		refletores.add(r1);
		refletores.add(r2);
		refletores.add(r3);
		refletores.add(r4);
		refletores.add(r5);
		refletores.add(r6);
		
		this.setLayout(new BorderLayout());
		this.add(refletores,BorderLayout.NORTH);
		this.setVisible(true);
	}
	
	public void dormir() {
		try {
			Thread.sleep(500);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void piscar(Refletor painel) {
		
		while(true) {
			painel.setBackground(painel.getCor());
			dormir();
			painel.setBackground(Color.white);
			dormir();
		}
	}


}

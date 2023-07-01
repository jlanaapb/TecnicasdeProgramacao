package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoCelula extends Botao implements ActionListener{

	public boolean clicado;
	public BotaoCelula(String nome, Color cor) {
		super(nome, cor);
		clicado = false;
		
	}

	public void actionPerformed(ActionEvent e) 
	{
		clicado = true;		
	}
	public boolean getClick()
	{
		return clicado;
	}
}

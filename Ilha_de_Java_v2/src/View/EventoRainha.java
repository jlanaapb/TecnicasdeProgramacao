package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoRainha implements ActionListener{
	private Janela janela;
	private Rainha rainha;
	public EventoRainha(Janela janela, Rainha rainha)
	{
		this.janela=janela;
		this.rainha = rainha;
	}
	public void actionPerformed(ActionEvent e) {
		janela.getTabuleiro().setIconeAux(rainha.getIcon());
		rainha.setClicado(true);
		
	}

}

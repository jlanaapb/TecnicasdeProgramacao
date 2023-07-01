package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoFischer implements ActionListener{

	private Janela janela;
	private Fischer fischer;
	
	public EventoFischer(Janela janela) {
		this.janela=janela;
		this.fischer=fischer;
	}

	public void actionPerformed(ActionEvent e) {
		janela.setIconeAux(fischer.getIcon());	
		fischer.setClicado(true);
	}
	}




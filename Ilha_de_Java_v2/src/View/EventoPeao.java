package View;

import java.awt.event.ActionEvent;

public class EventoPeao {
	private Janela janela;
	private Fischer fischer;
	
	public EventoPeao(Janela janela) {
		this.janela=janela;
		
	}

	public void actionPerformed(ActionEvent e) {
		janela.setIconeAux(fischer.getIcon());		
	}
}

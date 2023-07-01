package View;

import java.awt.event.ActionEvent;

public class EventoPeao {
	private Janela janela;
	private Peao peao;
	
	public EventoPeao(Janela janela) {
		this.janela=janela;
		this.peao=peao;
	}

	public void actionPerformed(ActionEvent e) {
		janela.setIconeAux(peao.getIcon());	
		peao.setClicado(true);
	}
}

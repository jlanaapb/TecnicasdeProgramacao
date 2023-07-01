package View;

import java.awt.Color;
import java.util.*;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tabuleiro extends JPanel {

	private ArrayList<Celula> listaCelulas;
	private Janela janela;
	private ImageIcon iconeAux;
	
	public ImageIcon getIconeAux() {
		return iconeAux;
	}

	public void setIconeAux(ImageIcon iconeAux) {
		this.iconeAux = iconeAux;
	}

	
	public Tabuleiro(Janela janela) {
		this.janela = janela;
		listaCelulas = new ArrayList<>();
		setPreferredSize(new Dimension(600, 600));
		setLayout(new GridLayout(8, 8));
		povoarTabuleiro();
		addAlunosEBugs();
	}
	
	

	public void povoarTabuleiro()
	{
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				Celula celula = new Celula(i,j, getJanela());
				this.listaCelulas.add(celula);
				add(celula.getBotao());
				if((i+j)%2==0)
					celula.getBotao().setBackground(Color.WHITE);
			}
		}
	}
public void verificarClique() {
		
		for (Celula celula : listaCelulas) 
		{
			if(celula.getBotaoCelula().clicado == true)
			{
				celula.getBotaoCelula().setIcon(iconeAux);
			}
		}
	}
	

	public void addAlunosEBugs()
	{
		Random r = new Random();
		int somaNumeroAlunosEBugs = 30;
		
		
		for(int i = 0; i < somaNumeroAlunosEBugs; i++) {
			int indexCelula;
			Celula celula;
			boolean pree;
			
			do {
				indexCelula = r.nextInt(0, 64);
				celula = listaCelulas.get(indexCelula);
				
				pree = celula.isPreenchida();
				
				if (!celula.isPreenchida()) {
					if (r.nextInt(100) + 1 > 20) {
						celula.adicionarAluno();
					} else {
						celula.adicionarBug();
					}
				}
				
			} while (pree);
			
		}
		
	}
	public ArrayList<Celula> getListaCelulas() {
		return listaCelulas;
	}


	public void setListaCelulas(ArrayList<Celula> listaCelulas) {
		this.listaCelulas = listaCelulas;
	}

	public Janela getJanela() {
		return janela;
	}


	public void setJanela(Janela janela) {
		this.janela = janela;
	}


}

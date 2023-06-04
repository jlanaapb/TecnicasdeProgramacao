package Lab;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame{

	private Cadastro cadastro;
	private Deletar deletar;
	private Atualizar atualizar;
	private Listar listar;
	
	public Janela() {
		this.setTitle("Laboratório-02");
		this.setSize(600,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		JPanel botoeSup = new JPanel();
		JPanel telas =new JPanel();
	
		Botao botaoCadastro = new Botao("Cadastro");
		botaoCadastro.addActionListener(new acaoCadastro());
		
		Botao botaoAtualizar = new Botao("Atualizar");
		botaoAtualizar.addActionListener(new acaoAtualizar());
		
		Botao botaoListar = new Botao("Listar");
		botaoListar.addActionListener(new acaoListar());
		
		Botao botaoDeletar = new Botao("Deletar");
		botaoDeletar.addActionListener(new acaoDeletar());
		
		botoeSup.add(botaoCadastro);
		botoeSup.add(botaoDeletar);
		botoeSup.add(botaoListar);
		botoeSup.add(botaoAtualizar);
		
		this.cadastro= new Cadastro();
		cadastro.setVisible(false);
		this.atualizar= new Atualizar();
		atualizar.setVisible(false);
		this.deletar= new Deletar();
		deletar.setVisible(false);
		this.listar= new Listar();
		listar.setVisible(false);
		
		telas.add(cadastro);
		telas.add(atualizar);
		telas.add(listar);
		telas.add(deletar);
		
	
		this.add(botoeSup, BorderLayout.NORTH);
		this.add(telas, BorderLayout.CENTER);
		
		this.setVisible(true);
	
	}
	

	private class acaoCadastro implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			if(cadastro.isVisible()) {
				cadastro.setVisible(false);
				atualizar.setVisible(false);
				deletar.setVisible(false);
				listar.setVisible(false);
			}else { 
				cadastro.setVisible(true);
				atualizar.setVisible(false);
				deletar.setVisible(false);
				listar.setVisible(false);
			}
			
			
			
			
		}
		
	}
	
	
	private class acaoAtualizar implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(atualizar.isVisible()) {
				cadastro.setVisible(false);
				atualizar.setVisible(false);
				deletar.setVisible(false);
				listar.setVisible(false);
			}else { 
				cadastro.setVisible(false);
				atualizar.setVisible(true);
				deletar.setVisible(false);
				listar.setVisible(false);
			}
		}
		
	}
	private class acaoDeletar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(deletar.isVisible()) {
				cadastro.setVisible(false);
				atualizar.setVisible(false);
				deletar.setVisible(false);
				listar.setVisible(false);
			}else { 
				cadastro.setVisible(false);
				atualizar.setVisible(false);
				deletar.setVisible(true);
				listar.setVisible(false);
			}
		}
		
	}
	
	private class acaoListar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(listar.isVisible()) {
				cadastro.setVisible(false);
				atualizar.setVisible(false);
				deletar.setVisible(false);
				listar.setVisible(false);
			}else { 
				cadastro.setVisible(false);
				atualizar.setVisible(false);
				deletar.setVisible(false);
				listar.setVisible(true);
			}
		}
		
	}
}


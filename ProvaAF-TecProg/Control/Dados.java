package Control;

import java.util.ArrayList;
import View.*;

public class Dados {
	private static ArrayList<String> infoSistema = new ArrayList<>();
	private String dadosRelat="";


	public void setInfoSistema(ArrayList<String> dadosDoSistema) {
		this.infoSistema = dadosDoSistema;
	}

	public void setDadosRelat(String string) {
		this.dadosRelat = string;
	}

	public ArrayList<String> getInfoSistema() {
		return infoSistema;
	}

	public void adiciona(String string) {
	this.infoSistema.add(string);
	}

	public String getDadosRelat() {
		String separa = ";";
		String info = String.join(separa, getInfoSistema());
		dadosRelat = info;
		return dadosRelat;
	}

}

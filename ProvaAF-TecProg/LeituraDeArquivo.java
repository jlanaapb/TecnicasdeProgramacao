package Model;

import java.io.BufferedReader;

import java.util.ArrayList;
import java.io.FileReader;

public class LeituraDeArquivo {
	private String arquivo;
	private ArrayList<String> Refletor1;
	private ArrayList<String> Refletor2;
	private ArrayList<String> Refletor3;
	private ArrayList<String> Refletor4;
	private ArrayList<String> Refletor5;
	private ArrayList<String> Refletor6;

	
	
	public void  separaArquivos(String arquivo) {
		String caminho = arquivo;

		Refletor1 = new ArrayList<>();
		Refletor2 = new ArrayList<>();
		Refletor3 = new ArrayList<>();
		Refletor4 = new ArrayList<>();
		Refletor5 = new ArrayList<>();
		Refletor6 = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String linha;
			while ((linha = br.readLine()) != null) {
				String[] numbers = linha.split(";");
				
				Refletor1.add(numbers[0]);
				Refletor2.add(numbers[1]);
				Refletor3.add(numbers[2]);
				Refletor4.add(numbers[3]);
				Refletor5.add(numbers[4]);
				Refletor6.add(numbers[5]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public ArrayList<String> getRefletor1() {
		return Refletor1;
	}

	public void setRefletor1(ArrayList<String> refletor1) {
		Refletor1 = refletor1;
	}

	public ArrayList<String> getRefletor2() {
		return Refletor2;
	}

	public void setRefletor2(ArrayList<String> refletor2) {
		Refletor2 = refletor2;
	}

	public ArrayList<String> getRefletor3() {
		return Refletor3;
	}

	public void setRefletor3(ArrayList<String> refletor3) {
		Refletor3 = refletor3;
	}

	public ArrayList<String> getRefletor4() {
		return Refletor4;
	}

	public void setRefletor4(ArrayList<String> refletor4) {
		Refletor4 = refletor4;
	}

	public ArrayList<String> getRefletor5() {
		return Refletor5;
	}

	public void setRefletor5(ArrayList<String> refletor5) {
		Refletor5 = refletor5;
	}

	public ArrayList<String> getRefletor6() {
		return Refletor6;
	}

	public void setRefletor6(ArrayList<String> refletor6) {
		Refletor6 = refletor6;
	}

}

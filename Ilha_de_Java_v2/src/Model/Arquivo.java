package Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {

	public void escrever(String mensagem, File file) {
		FileWriter arquivo;
		try {
			arquivo=new FileWriter(file,true);
			arquivo.write(mensagem);
			arquivo.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

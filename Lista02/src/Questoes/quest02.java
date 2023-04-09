
package Questoes;
import java.util.Scanner;
public class quest02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
	for(int valor=1;valor>0;valor++) {
		System.out.println(" digite um numero");
		
		valor=entrada.nextInt();
		if(valor>0)
		 soma= soma+ valor;
	}
	System.out.println(soma);
		
	}

}

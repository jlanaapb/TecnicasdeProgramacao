package Questoes;

import java.util.Scanner;

public class quest03 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);

		int guess=0;
		int answer=10;
	
		 
		while(guess != answer) {
			System.out.print("Digite um numero entre 1 e 100: ");
			
			guess = entrada.nextInt();
			  if(guess>answer)
				  System.out.println("menos");
			   
			  if(guess < answer)
				  System.out.println("mais");
				  
			  if(guess == answer) 
				  System.out.println("parabens");
			
		}

	}

}

package Questoes;
import java.util.Iterator;
import java.util.Scanner;
public class quest07 {

	public static void main(String[] args) {
		

		Scanner input= new Scanner(System.in);
		int j=1;
		int i=2;
		int numberdividers=0;
		int number=0;
		int prime=0;
		
	
		System.out.println("Digite um numero: ");
		number= input.nextInt();
		while(i<number) {
			while(j<number) {
				if(i%j==0)
					numberdividers++;
				if(j==(number-1))
					j=0;
				j++;
			}
			i++;
			if(numberdividers == 2)
				prime=i;
			
		}

			System.out.println(prime);
	}

		
	
	
	}


package questoes;

import java.util.Scanner;

public class Quest16 {
//verificar primo, lista passada
	
	
	public static boolean verifyPrime() {
		Scanner input= new Scanner(System.in);
		
		int numberdividers=0;
		int number=0;
		int prime=0;
		
	
		System.out.println("Digite um numero: ");
		number= input.nextInt();
		
		
		for(int i=1;i<number;i++) {
			for(int j=1;j<number;j++) {
				if(i%j==0)
					numberdividers=numberdividers+1;
			}
		}
		if(numberdividers==2) {
			System.out.println("true");
			return true;
			}
		else {
			System.out.println("false");
			return false;
			}
	
	}

		
	
	public static void main(String[] args) {
		verifyPrime();
	}
	}



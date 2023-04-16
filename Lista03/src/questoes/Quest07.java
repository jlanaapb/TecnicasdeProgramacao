package questoes;

import java.util.Scanner;

public class Quest07 {

	public static void verifyOrder(int[] vector) {
		for(int i=0; i<vector.length-1;i++) {
			if(vector[i]<vector[i+1])
				System.out.println("vetor ordenado");
			else
				System.out.println("vetor não ordenado");
				
		}
		
	}
	
	public static void populateVector(int[] vector) {
		Scanner input= new Scanner(System.in);
		System.out.println("Digite os valores do vetor: ");
		for(int a=0; a<vector.length;a++) {
			System.out.println("indice "+a+":");
			vector[a]=input.nextInt();
		}
	}
	
	public static void main(String[] args) {
		
	int vector[]= new int[5];
	
	populateVector(vector);
	verifyOrder(vector);

		
		
	}

}

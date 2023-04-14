package questoes;
import java.util.Scanner;
public class Quest05 {
	
	double vectorOne[]= new double[10];
	
	public static void populateVector(double vectorOne[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite os valores do vetor: ");
		for(int a=0; a<vectorOne.length;a++) {
			System.out.println("indice "+a+":");
			vectorOne[a]=input.nextInt();
			
		}
		copyVector(vectorOne);
	}
	
	public static void copyVector(double vectorOne[]) {
		int b;
		double copyOfVector[]=new double[10];
		
		for( b=0;b<vectorOne.length;b++) {
			copyOfVector[b]=vectorOne[b];
			
		}
		System.out.print("copia: "+copyOfVector[]);
	}

	public static void main(String[] args) {
		double vectorOne[]= new double[10];
	populateVector(vectorOne);

	}

}

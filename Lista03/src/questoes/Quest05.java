package questoes;
import java.util.Scanner;
public class Quest05 {
	
	public static void populateVector(int vectorOne[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite os valores do vetor: ");
		for(int a=0; a<vectorOne.length;a++) {
			System.out.println("indice "+a+":");
			vectorOne[a]=input.nextInt();

	     }
		
//		vectorOne[0]= 1;
//		vectorOne[1]=852;
//		vectorOne[2]=95;
//		vectorOne[3]=78;
//	    vectorOne[4]=74;
//		vectorOne[5]=0;
//		vectorOne[6]=20;
//		vectorOne[7]=55;
//		vectorOne[8]=23;
//		vectorOne[9]=88;
	
		copyVector(vectorOne);
		
	}
	
	public static void copyVector(int vectorOne[]) {
		
		int copyOfVector[]=new int[10];
		
		System.out.print(" Cópia: ");
		
		for( int b=0;b<copyOfVector.length;b++) {
			copyOfVector[b]=vectorOne[b];
			
			System.out.print(" "+copyOfVector[b]+" ");
			
		}
	}

	
	public static void main(String[] args) {
		int vectorOne[]= new int [10];
	populateVector(vectorOne);

	}

}

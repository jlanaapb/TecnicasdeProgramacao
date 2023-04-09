package Questoes;
import java.util.Scanner;
public class quest05 {

	public static void main(String[] args) {
		 Scanner input= new Scanner(System.in);
		 System.out.println("Digite o limite:");
		 int limit= input.nextInt();
		 
		 for(int i=0;i<=limit;i++) {
			 for(int j=0;j<=limit;j++) {
				 System.out.println(i+"-"+j);
			 }
		 } 
	}

}

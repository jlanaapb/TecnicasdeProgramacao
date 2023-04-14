package questoes;

import java.util.Scanner;

public class Quest03 {

	
	public static void  weightedAverage(double[] grades, double[] value) {
		double stepOne[]= new double[5];
		
		for(int a=0,i=0,j=0;a<stepOne.length;a++,i++,j++) {
			stepOne[a]=grades[i]*value[j];
			System.out.println(stepOne[a]);
		}
		
		double sum=0;
		for(int i=0; i<stepOne.length; i++) {
			sum+= stepOne[i];
		} 
		sum=sum/5;
		System.out.println("Media ponderada: "+sum);
	}
		
	
	
	
	public static void main(String[] args) {
		double grades[]= new double[5];
		double value[]= new double[5];
		
		grades[0]= 8;
		grades[1]= 9;
		grades[2]= 10;
		grades[3]= 7;
		grades[4]= 5;
		
		value[0]= 1;
		value[1]= 3;
		value[2]= 1;
		value[3]= 8;
		value[4]= 2;
		
		
		weightedAverage(grades, value);
	}

}

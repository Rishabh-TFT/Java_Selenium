package Automation1;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
	
		int i = 0;
		
		
		while(i<=10){
			System.out.println(i);
			System.out.println("My Name is Rishabh");
		    i=i+1;
		}
		for(i=1; i<=10; i++){
        System.out.println(i);
        System.out.println("My Name is Rishabh");
		}
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int n=num.nextInt();

		for(i=1; i<=10; i++){
			
			System.out.println(n+ "x" + i +"=" + n*i);
		
		}
        Scanner age = new Scanner(System.in);
		
		System.out.println("Enter Age:");
		int n1=age.nextInt();

		

		
		if(n1>=18){
			System.out.println("Eligible for clubbing");
		 }
			else if(n1==17){
				System.out.println("May Be eligible");
			}		
			else{
				System.out.println("Not eligible for clubbing");
			
			} 
	
		
			
	}
}
		
				
		


	



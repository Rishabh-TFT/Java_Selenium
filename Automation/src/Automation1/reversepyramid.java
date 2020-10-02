package Automation1;
import java.util.*; 
public class reversepyramid {
	
	
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in); //Scanner class in java
	System.out.print("Enter the rows you want");
	int rw=sc.nextInt();
	System.out.println("");
	/*for (int i=1; i<=rw; i++){
	  for (int j=1; j<=i; j++){
	  System.out.print("*");
	  }*/
	for(int i=0; i<rw; i++) 
    { 

        // inner loop to handle number spaces 
        // values changing acc. to requirement 
        for(int j=(rw-i); j>=0; j--) 
        { 
            // printing spaces 
            System.out.print(" "); 
        } 
         
        //  inner loop to handle number of columns 
        //  values changing acc. to outer loop 
        for(int j=0; j<=i; j++) 
        { 
            // printing stars 
            System.out.print("*");  
        }
	
	System.out.println();
	}
	                                                   
	}


}

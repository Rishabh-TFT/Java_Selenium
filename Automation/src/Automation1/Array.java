package Automation1;

public class Array {

	
	public static void main(String[] args) {
	
	// one dimensional array
		
		/*int s[] = new int[5];
		
		s[0] = 20;
		s[1] = 10;
		s[2] = 30;
     	s[3] = 40;
     	s[4] = 50;

     	int i;
     	for(i=0; i< s.length; i++){
     		System.out.println(s[i]);
     	}*/
     	
     	//Two dimensional array
		
	
     	
		int s[][] = new int[3][5];
		
		s[0][0] = 01;
		s[0][1] = 02;
		s[0][2] = 03;
		s[0][3] = 04;
		s[0][4] = 05;
		s[1][0] = 10;
		s[1][1] = 11;
		s[1][2] = 12;
		s[1][3] = 13;
		s[1][4] = 14;
		s[2][0] = 20;
		s[2][1] = 21;
		s[2][2] = 22;
		s[2][3] = 23;
		s[2][4] = 23;
				
		int r;
		int c;
		
		for(r=0; r<=2; r++){
			
			System.out.println("row is" +r);
			
			for(c=0; c<=4; c++){
				System.out.println(s[r][c]);
			}
		}
			}
			

	
	
	
     	
     	
	}



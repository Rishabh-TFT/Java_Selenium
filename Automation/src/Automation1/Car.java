package Automation1;

public class Car {

int wheelcount;
int noofseats;
int windows;


public Car() {
	wheelcount = 4;
	noofseats = 4;
}
public Car(int num){
	noofseats = num;
}
public Car(int a, int b){
	wheelcount = a;
	noofseats = b;
}

public void start(){
	
	System.out.println("Car starts");
	
}
	public static void main(String[] args) {
		Car c1 = new Car(7, 9);
		/*c1.wheelcount = 4;
		c1.noofseats = 3;*/
		c1.windows = 4;
		
		Car c2 = new Car();
		/*c2.wheelcount = 4;
		c2.noofseats = 6;*/
		c2.windows = 6;
		
		System.out.println(c1.noofseats);
		System.out.println(c1.wheelcount);
		System.out.println(c1.windows);
		
		

	}

}

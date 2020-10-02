package Automation1;

import Automation1.demointerface;

public class man implements demointerface{

	

	public void run() {
		System.out.println("Person run ");
		
	}

	public void eat() {
		System.out.println("Person eat");
		
	}


	public static void main(String[] args) {
		
		man m = new man();
		m.run();
		m.eat();
		
	}

	
}

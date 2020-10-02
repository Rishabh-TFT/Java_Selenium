package Automation1;

import java.util.ArrayList;

public class arraylistdemo {


	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("A");
		arr.add("B");
		arr.add("C");
		arr.add(2, "*");
		
		arr.remove(2);
		arr.remove("B");
		
		for(String str : arr){
			System.out.println(str);
		}

	}

}

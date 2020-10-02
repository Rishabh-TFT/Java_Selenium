package FunctionalTesting;

import org.testng.annotations.DataProvider;

public class testdata {

	@DataProvider
	public static Object[][] logindata() {
		Object[][] obj = new Object[3][2];
	
		obj[0][0]="kuldeep.kaur+test04@takecareof.com";
		obj[0][1]="1234";
		
		obj[1][0]="kuldeep.kaur+test04takecareof.com";
		obj[1][1]="123456";
		
		obj[2][0]="kuldeep.kaur+test004@takecareof.com";
		obj[2][1]="123456";
			
		
		return obj;
		
	
		
		
		

	}

}

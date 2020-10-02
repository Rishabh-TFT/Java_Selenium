package myPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestParallel extends BaseClass{

	@Test
	public void test_01() throws InterruptedException{
		getWebDriver().get("http://www.w3schools.com/");
		Thread.sleep(5000);
		
		getWebDriver().findElement(By.xpath("//div[5]//div[1]//a[1]//i[1]")).click();
	    Thread.sleep(5000);
	    
	    getWebDriver().findElement(By.xpath("//input[@name='search']")).sendKeys("test");
	    Thread.sleep(5000);
		
		
	

	}
	
	public void quit(){
	getWebDriver().quit();
	
	}
}

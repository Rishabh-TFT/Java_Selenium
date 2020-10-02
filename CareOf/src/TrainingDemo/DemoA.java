package TrainingDemo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoA {

	public static void main(String[] args) throws InterruptedException {
		

			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\workspace\\CareOf\\Driver\\chromedriver1.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				
				String baseUrl = "https://www.guru99.com/";
		        String expectedTitle = "Meet Guru99 - Free Training Tutorials & Video for IT Courses";
		        String actualTitle = "";
		        
		        driver.get(baseUrl);
			    actualTitle = driver.getTitle();

		        
		        Assert.assertEquals(actualTitle, expectedTitle);
		        System.out.println("Passed");

		        //if (actualTitle.contentEquals(expectedTitle)){
		          //  System.out.println("Test Passed!");
		       // } else {
		            //System.out.println("Test Failed");
		            
		      

		
				Thread.sleep(7000);

				driver.quit();



			}

		}


	}



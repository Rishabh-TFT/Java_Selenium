package TrainingDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class logintask {


		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\risha\\workspace2\\CareOf\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.navigate().to ("https://careof-staging-solidus.herokuapp.com");
			driver.manage().window().maximize();

			WebElement SignIn = driver.findElement(By.xpath("//SPAN[@class='global-nav_user-name'][text()='Sign in']"));

			SignIn.click();
			Thread.sleep(7000);


			WebElement username=driver.findElement(By.xpath("//INPUT[@id='spree_user_email']")); 
			WebElement password=driver.findElement(By.xpath("//INPUT[@id='spree_user_password']")); 
			WebElement login=driver.findElement(By.cssSelector("input[type='submit']")); 
			username.sendKeys("Kuldeep.kaur+test2261@takecareof.com");
			password.sendKeys("123456");
			login.click();
			Thread.sleep(5000);
			String actualUrl="https://careof-staging-solidus.herokuapp.com/account/plan/upcoming"; 
			String expectedUrl= driver.getCurrentUrl(); 
			Assert.assertEquals(expectedUrl,actualUrl);
			System.out.println("Pass");
			Thread.sleep(7000);

			driver.quit();



		}

	}




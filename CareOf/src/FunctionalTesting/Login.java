package FunctionalTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {

	public WebDriver driver;

	@BeforeTest
	public void beforelogin(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\risha\\workspace2\\CareOf\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

	}
	@Test(dataProviderClass=testdata.class,dataProvider="logindata")
	public void loginuser(String email, String Password) throws InterruptedException {


		driver.navigate().to ("https://careof-staging-solidus.herokuapp.com");
		

		WebElement SignIn = driver.findElement(By.xpath("//SPAN[@class='global-nav_user-name'][text()='Sign in']"));

		SignIn.click();
		Thread.sleep(7000);


		WebElement username=driver.findElement(By.id("spree_user_email")); 
		WebElement password=driver.findElement(By.id("spree_user_password")); 
		WebElement login=driver.findElement(By.cssSelector("input[type='submit']")); 
		username.sendKeys(email);
		password.sendKeys(Password);
		login.click();

		Thread.sleep(7000);
		
		String actualUrl="https://careof-staging-solidus.herokuapp.com/account/plan/upcoming"; 
		String expectedUrl= driver.getCurrentUrl(); 
		Assert.assertEquals(expectedUrl,actualUrl);
		System.out.println("Pass");
		Thread.sleep(7000);
	}
	@AfterClass
	public void afterlogin(){
		driver.close();


	}

}

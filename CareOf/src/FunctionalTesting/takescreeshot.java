package FunctionalTesting;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class takescreeshot {

	@Test


	public void screensh() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\workspace\\CareOf\\Driver\\chromedriver.exe");

		final WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.navigate().to ("https://careof-staging-solidus.herokuapp.com");
		driver.manage().window().maximize();
		
		Date d =new Date();

		final File file = new File("C:\\Users\\Sachin\\Documents\\testscs/"+d.toString().replace(":", "_")+".png");
		/*file.getParentFile().mkdirs();
		if (file.exists()) {
			file.createNewFile();
		} */
		Runnable takeScreenshot = new Runnable()
		{
			public void run() {
				try {
					takeScreenshot(driver, file);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(takeScreenshot,0,1,TimeUnit.SECONDS);

		WebElement SignIn = driver.findElement(By.xpath("//SPAN[@class='global-nav_user-name'][text()='Sign in']"));

		SignIn.click();
		Thread.sleep(7000);


		WebElement username=driver.findElement(By.id("spree_user_email")); 
		WebElement password=driver.findElement(By.id("spree_user_password")); 
		WebElement login=driver.findElement(By.cssSelector("input[type='submit']")); 
		username.sendKeys("kaur.kuldeep+test04@takecareof.com");
		password.sendKeys("123456");
		login.click();

		Thread.sleep(7000);

		driver.close();



	}

	private void takeScreenshot(WebDriver driver, File file) throws IOException {


		//Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot =((TakesScreenshot)driver);

		//Call getScreenshotAs method to create image file

		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		//Move image file to new destination

		File DestFile= file;


		//Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);	

	}

}




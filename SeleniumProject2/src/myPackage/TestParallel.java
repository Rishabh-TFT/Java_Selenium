package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParallel {

	@DataProvider(parallel=true)
	public Object[][] getData(){
		return new Object[][]{ {"test 1"},
				{"test 2"},
				{"test 3"}
		};
	}


	@Test(dataProvider="getData")
	//@Test
	public void test_01(String value){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\workspace\\CareOf\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.get("http://www.w3schools.com/");
		driver.findElement(By.xpath("//body/div[5]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(value);

		driver.quit();
	}
}

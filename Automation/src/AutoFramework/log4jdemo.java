package AutoFramework;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class log4jdemo {
	
	Logger log;
	
	@Test
	
	public void testlog(){
		
		log = Logger.getLogger("devpinoyLogger");
		
		
		log.debug("Startingtest");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\workspace\\Automation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		log.debug("opeing browser");
		driver.navigate().to("https://google.com");
		log.debug("navigated google");
	}

}

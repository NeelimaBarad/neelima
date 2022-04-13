package tests;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeSuite;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest {

public static WebDriver driver;
	
  @BeforeSuite
  public void beforeSuite() throws IOException {
	 
	  WebDriverManager.chromedriver().setup();
	  
		 driver= new ChromeDriver();
		
		 driver.manage().window().maximize();
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
  }

  @AfterSuite
  public void afterSuite() {
	  
	  driver.close();
  }

}

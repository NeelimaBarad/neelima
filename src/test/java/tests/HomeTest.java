package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import org.testng.annotations.BeforeSuite;

public class HomeTest extends BaseTest {
	
public HomePage hp;
	
	@BeforeSuite
	public void initObject() {
		
		hp=new HomePage (driver);
		
	}
	
  @Test
  public void logout() {
	  
	  hp.getProfileLinkElement().click();
	  hp.getLogoutLink().click();
	  
  }

}

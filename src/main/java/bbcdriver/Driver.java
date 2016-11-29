package bbcdriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Driver {
  protected FirefoxDriver driver;
  @BeforeMethod
  public void start(){
	  driver = new FirefoxDriver();
  }
  
  @AfterMethod
  public void quit(){
	  driver.quit();
  }
}

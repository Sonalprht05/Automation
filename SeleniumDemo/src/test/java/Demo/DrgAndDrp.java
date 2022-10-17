package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrgAndDrp 
{
      WebDriver driver;
      
      @BeforeTest
      public void first() 
      {
    	  WebDriverManager.chromedriver().setup();
    	  driver = new ChromeDriver();
    	  driver.get("https://jqueryui.com/droppable/");
    	  driver.manage().window().maximize();
      }
      @Test
      public void set() throws InterruptedException
      {
    	  Thread.sleep(3000);
    	  driver.switchTo().frame(0);
      }
}

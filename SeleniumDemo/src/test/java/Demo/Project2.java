package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project2 
{
          WebDriver driver;
          @BeforeTest
          public void first()
          {
        	  WebDriverManager.chromedriver().setup();
        	  driver=new ChromeDriver();
        	  driver.get("https://demo.nopcommerce.com/");
        	  driver.manage().window().maximize();
          }
          
          @Test
          public void mac() throws InterruptedException
          {
        	  WebElement check = driver.findElement(By.linkText("Computers"));
        	  Actions a = new Actions(driver);
        	  a.moveToElement(check).perform();
        	  Thread.sleep(2000);
        	  a.moveToElement(driver.findElement(By.linkText("Notebooks"))).click().build().perform();
        	  //a.sendKeys(opt,Keys.ARROW_DOWN).click().build().perform();
        	  Thread.sleep(2000);
        	  WebElement image = driver.findElement(By.linkText("Build your own computer"));
        	  a.contextClick(image).perform();
          }
}

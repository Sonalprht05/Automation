package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ohrm 
{
      WebDriver driver;
      String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
      String url_1 ="https://parabank.parasoft.com/parabank/index.htm";
      @BeforeTest
      public void first()
      {
    	  WebDriverManager.chromedriver().setup();
    	  driver=new ChromeDriver();
    	  driver.get(url);
    	  driver.manage().window().maximize();
      }
      
      @Test
      public void mac() throws InterruptedException
      {
    	  Thread.sleep(3000);
    	  WebElement login = driver.findElement(By.name("username"));
    	  if(login.isEnabled())
    	  {
    		  login.sendKeys("Admin");
    	  }
    	  Thread.sleep(2000);
    	  WebElement pass = driver.findElement(By.name("password"));
    	  if(pass.isEnabled())
    	  {
    		  pass.sendKeys("admin123");
    	  }
    	  Thread.sleep(2000);
    	 WebElement btn = driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
    	 if(btn.isDisplayed())
    	 {
    		 btn.click();
    	 }
    	 Thread.sleep(2000);
    	 
      }
      
      @Test
      public void windoHandle()
      {
    	  driver.getWindowHandle();
    	  
    	  driver.switchTo().newWindow(WindowType.WINDOW);
    	 // driver.switchTo().newWindow(WindowType.TAB);
    	  driver.navigate().to(url_1);
    	  driver.quit();
      }
      @Test(enabled = false)
      public void link()
      {
    	  
    	  List<WebElement> li = driver.findElements(By.tagName("a"));
    	  System.out.println(li.size());
    	  for(int i=0;i<li.size();i++)
    	  {
    		  System.out.println(li.get(i).getText());
    		  System.out.println(li.get(i).getAttribute("href"));
    		 // System.out.println(li.get(i).getTagName());
    		  //System.out.println(li.get(i).getLocation());
    	  }
      }
      
      @Test(enabled = false)
      public void mac1() throws InterruptedException
      {
    	  
    	 driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
    	 Thread.sleep(2000);
    	 
    	 List<WebElement> list = driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
 	     System.out.println("SIZE OF LIST= " +list.size());
         Thread.sleep(3000);
         driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(3).click();
         Thread.sleep(3000);
         String text = driver.findElement(By.xpath("//*[@class='oxd-table-card'][3]//div[2]/div")).getText();
         System.out.println("User name= "+text);
         Thread.sleep(2000);
         driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(3).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
         Thread.sleep(2000);
       }
      
      @Test(enabled = false)
      public void mac2() throws InterruptedException 
      {
    	  driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
     	  Thread.sleep(2000);
    	  Actions a = new Actions(driver);
    	  WebElement str = driver.findElement(By.xpath("//*[@class='oxd-select-wrapper']"));
    	  a.click(str).perform();
    	  a.sendKeys(str,Keys.ARROW_DOWN).click().build().perform();
    	  a.sendKeys(str,Keys.ARROW_DOWN).click().build().perform();
    	  Thread.sleep(2000);
    	  WebElement btn = driver.findElement(By.xpath("//*[@type='submit']"));
    	 // a.moveToElement(btn).click().perform();
    	  a.contextClick(btn).perform();
      }
      
      @AfterTest(enabled = false)
      public void last() throws InterruptedException
      {
    	  Thread.sleep(2000);
    	  driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
    	  Thread.sleep(4000);
    	  driver.findElement(By.xpath("//a[text()='Logout']")).click();
    	  driver.quit();
    	  Thread.sleep(2000);
	      
      }
}
 
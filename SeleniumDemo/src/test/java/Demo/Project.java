package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project 
{
      WebDriver driver;

      
      @BeforeTest
      public void first()
      {
    	  WebDriverManager.chromedriver().setup();
    	 driver = new ChromeDriver();
    	  driver.get("https://demo.guru99.com/test/newtours/");
    	  driver.manage().window().maximize();
      }
      
      @Test(enabled = true,priority = 0)
      public void test() throws InterruptedException
      {
    	  driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("user");
    	  Thread.sleep(1000);
    	  driver.findElement(By.name("password")).sendKeys("user");
    	  Thread.sleep(1000);
    	  driver.findElement(By.xpath("//*[@name='submit']")).click();
    	  System.out.println(driver.getCurrentUrl());
      }
      
      @Test(enabled = true,priority = 1)
      public void test1() throws InterruptedException
      {
    	  Thread.sleep(2000);
    	  driver.findElement(By.linkText("REGISTER")).click();
    	  Thread.sleep(3000);
    	            /****CONTACT INFORMATION****/
    	  driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Raj");
    	  driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Sharma");
    	  driver.findElement(By.name("phone")).sendKeys("9876543212");
    	  driver.findElement(By.id("userName")).sendKeys("sp@gmail.com");
     }
      
      @Test(enabled = true,priority = 2)
      public void test2() throws InterruptedException
      {
    	  Thread.sleep(2000);
    	           /*****USER INFORMATION*****/
    	  driver.findElement(By.id("email")).sendKeys("RAJ");
    	  driver.findElement(By.name("password")).sendKeys("qwerty123");
    	  driver.findElement(By.name("confirmPassword")).sendKeys("qwerty123");
    	 // driver.findElement(By.name("submit")).click();
      }
      
      @Test(enabled = true,priority=3)
      public void east3() throws InterruptedException
      {
    	  Thread.sleep(5000);
    	            /*****MAILING INFORMATION*****/
    	 // driver.findElement(By.name("address1")).sendKeys("plot no.-19,new power house road");
    	  //driver.findElement(By.xpath("//*[@name='city']")).sendKeys("jodhpur");
    	  //driver.findElement(By.xpath("//*[@name='state']")).sendKeys("RAJASTHAN");
    	  //driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys("342001");
    	  WebElement count= driver.findElement(By.name("country"));
    	  Select s = new Select(count);
    	 // s.selectByValue("AUSTRIA");
    	  //s.selectByIndex(0);
    	  s.selectByVisibleText("ARGENTINA");
    	  
      }
      
    /*  @AfterTest
      public void last() throws InterruptedException
      {
    	  System.out.println(driver.getCurrentUrl());
    	  Thread.sleep(2000);
    	  driver.close();
      }*/
}

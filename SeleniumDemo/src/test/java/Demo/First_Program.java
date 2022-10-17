package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class First_Program 
{
	@Test
	public void testcase1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver   driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(5000);
	    driver.manage().window().maximize();
	 
	    String beforelogin = driver.getTitle();
	    System.out.println(beforelogin);
	    
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	    
	    
	    List<WebElement> list = driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
	    System.out.println("SIZE OF LIST= " +list.size());
	    
	    driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
	    Thread.sleep(2000);
	    driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(8).click();
	    Thread.sleep(2000);
	    driver.findElements(By.xpath("//*[@class='oxd-table-card-cell-checkbox']")).get(8).click();
	    Thread.sleep(2000);
	    driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(8).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
	    Thread.sleep(2000);
	    
	    
	    
	    
	    
	/*	Thread.sleep(3000);
		Actions action = new Actions(driver);
		WebElement element =driver.findElement(By.xpath("//*[@class='oxd-main-menu-item-wrapper']/li[10]/a"));
		action.click(element).perform();
		action.sendKeys(element,Keys.ARROW_DOWN).click().perform();
		//action.sendKeys(element,Keys.ARROW_DOWN).click().perform();
		driver.findElement(By.xpath("//*[@type='submit']")).click();*/
	    /*String afterlogin = driver.getTitle();
	    System.out.println(afterlogin);
	    
	    Thread.sleep(3000);
	    if(beforelogin.equals(afterlogin))
	    {
	    	driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	    	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    	System.out.println("The title of the page is same");
	    }
	    else
	    {
	    	System.out.println("The title of the page is not same");
	    }*/
	}
	
       
}

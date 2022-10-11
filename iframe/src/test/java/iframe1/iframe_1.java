package iframe1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe_1 {
 @Test
  public void tc_001() {
	 //browser open
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.get("file:///C:/Users/Sagar/OneDrive/Desktop/frame.html");
	 driver.manage().window().maximize();
	 
	//calculate size of iframe
	 System.out.println(driver.findElement(By.tagName("iframe")).getSize());
	 
	 //switch to iframe by using index
	 driver.switchTo().frame(1);
	 
	 //identify the element
	 WebElement iframe=driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']"));
	 iframe.click();
	 
	 
	 driver.switchTo().defaultContent();
	 WebElement login=driver.findElement(By.xpath("//a[text()=' Click here for Login FaceBook ']"));
	 login.click();
	 
 }
 
}

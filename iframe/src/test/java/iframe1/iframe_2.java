package iframe1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe_2 {
	 @Test
	  public void tc_001() {
		 //browser open
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/Sagar/OneDrive/Desktop/frame.html");
		 driver.manage().window().maximize();
		 
		//calculate size of iframe
		 System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		 
		 //switch to iframe by using element
		 WebElement k2=driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']"));
		 driver.switchTo().frame(k2);
		 
		 //identify the element
		// WebElement iframe=driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']"));
		 k2.click();
		 
		 
		 driver.switchTo().defaultContent();
		 WebElement login=driver.findElement(By.xpath("//a[text()=' Click here for Login FaceBook ']"));
		 login.click();
}
}
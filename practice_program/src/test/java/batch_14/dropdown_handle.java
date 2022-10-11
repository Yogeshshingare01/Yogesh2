package batch_14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown_handle {

	public static void main(String[] args) throws Exception {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.guru99.com/test/newtours/register.php");
    driver.manage().window().maximize();
    
    //identify WebElement
    WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
    
    //create the object of select class
    Select sel=new Select(drp_country);
    
    //dropdown handle by indecx
      sel.selectByIndex(2);
      Thread.sleep(2000);
    
    //dropdown handle by value
      sel.selectByValue("ARMENIA");
      Thread.sleep(2000);
    
   //dropdown handle by value
     sel.selectByVisibleText("ARUBA");
     Thread.sleep(2000);
    
     List<WebElement> list=sel.getOptions();
     
     for(int i=0; i<list.size();i++) {
    	 System.out.println(list.get(i).getText());
    	 
    	 if(list.get(i).getText().equals("AUSTRALIA"));
    	 list.get(i).click();
    	 break;
     }
    
    
   
    	
    }
    
	 public static void HandleDropDown(WebElement element,String text) {
	    	Select select=new Select(element);
	    	select.selectByVisibleText(text);
	}

}

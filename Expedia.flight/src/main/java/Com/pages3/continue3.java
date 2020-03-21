package Com.pages3;


	

	import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

	public class continue3 {
	  WebDriver driver;
	  
	  @FindBy(xpath="//*[@id='bookButton']")
	  WebElement mycontinue3;
	  
	 
	  
	  public continue3(WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	    
	  }
	  
	    public void con3() {
	        String prentwindowids=driver.getWindowHandle();
	        System.out.println(prentwindowids);
	        Set<String> windows=driver.getWindowHandles();
	        for(String contr:windows) {
	          System.out.println(contr);
	          if(!contr.equals(prentwindowids)) {
	            driver.switchTo().window(contr);
	            
	            mycontinue3.click();
	          }
	        }
	        }
	}
		
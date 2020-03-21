package Common3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class browsers3 {
	public static WebDriver driver;
  @BeforeClass
  @Parameters({"url","browser"})
  public void beforeClass(String wbsite, String br) {
			 if(br.equalsIgnoreCase("chrome")){
				 System.setProperty("webdriver.chrome.driver", "C:\\Users\\koorosh\\eclipse-workspace2\\Expedia.flight\\Drivers3\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.navigate().to(wbsite);
			 driver.manage().window().maximize();
			 
		  }else if(br.equalsIgnoreCase("firefox")) {
			  System.setProperty("webdriver.gecko.driver", "C:\\Users\\koorosh\\eclipse-workspace2\\Expedia.flight\\Drivers3\\geckodriver.exe");
			  driver=new FirefoxDriver();
			  driver.navigate().to(wbsite);
			  driver.manage().window().maximize();
			
		  }else{
			  System.out.println("Please check name");
		  }
		}}
	  
  
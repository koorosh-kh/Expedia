package Com.pages3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page3 {
	WebDriver driver;
	@FindBy(xpath="//span[contains(text(),'Flights')]")
	WebElement flights;
	
	@FindBy(xpath="//label[@id='flight-type-roundtrip-label-hp-flight']")
	WebElement rountrip;
	
	@FindBy(xpath="//input[@id='flight-origin-hp-flight']")
	WebElement from;
	
	@FindBy(xpath="//input[@id='flight-destination-hp-flight']")
	WebElement destination;
	
	@FindBy(xpath="//input[@id='flight-departing-hp-flight']")
	WebElement dep_time;
	
	@FindBy(xpath="//button[contains(text(),'31')]")
	WebElement dep_date;
	
	@FindBy(xpath="//input[@id='flight-returning-hp-flight']")
	WebElement ret_time;
	
	@FindBy(xpath="//div[@class='col gcw-date-field']//div[3]//table[1]//tbody[1]//tr[1]//td[6]//button[1]")
	WebElement ret_date;
	
	@FindBy(xpath="//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']")
	WebElement search;
	
	
	public Home_page3(WebDriver driver) {
		// TODO Auto-generated constructor stub
	 
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void fligt() {
		flights.click();
		
	}
	public void rndtrip() {
		rountrip.click();
	}
	public void fromcity(String cityid) {
		from.sendKeys(cityid);
	}
	public void destcity(String destid) {
		destination.sendKeys(destid);
	}
		public void deptim() {
			dep_time.click();
		}
		public void depdat() {
			dep_date.click();
		}
		public void rettim() {
			ret_time.click();
		}
		public void retdat() {
			ret_date.click();
			
		}public void serch() {
			search.click();
		}
		
}

package Com.pages3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Passenger_information {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='firstname[0]']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='lastname[0]']")
	WebElement lastname;
	
	
	
	@FindBy(xpath = "//*[@id='phone-number[0]']")
	WebElement phone;
	
	@FindBy(xpath = "//*[@id='gender_male[0]']")
	WebElement gender;
	
	
	public Passenger_information(WebDriver driver) {
		// TODO Auto-generated constructor stub
	 
		this.driver=driver;
		PageFactory.initElements(driver, this);
		

}
	public void fistnam(String firstnameid) {
		firstname.sendKeys(firstnameid);
		
	}
	public void lastnam(String lastnameid) {
		lastname.sendKeys(lastnameid);
	}
	
	public void phon(String phoneid) {
		phone.sendKeys(phoneid);
	}
		public void gndr() {
			gender.click();
		}
		public void dat() {
			
			
			WebElement m=driver.findElement(By.id("date_of_birth_month0"));
			 Select dropitdown=new Select(m);
			 dropitdown.selectByValue("04");

			 WebElement d=driver.findElement(By.id("date_of_birth_day[0]"));
			 Select dropitdown1=new Select(d);
			 dropitdown1.selectByValue("12");

			 WebElement y=driver.findElement(By.id("date_of_birth_year[0]"));
			 Select dropitdown2=new Select(y);
			 dropitdown2.selectByValue("1970");

			
	}}

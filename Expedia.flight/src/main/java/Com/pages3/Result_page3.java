package Com.pages3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Result_page3 {

	WebDriver driver;
	@FindBy(xpath="//li[@id='flight-module-2020-03-31t09:40:00-04:00-coach-bwi-atl-nk-4-coach-atl-ewr-nk-1165_2020-04-03t08:52:00-04:00-coach-ewr-clt-nk-875-coach-clt-bwi-nk-1704_']//div[contains(@class,'grid-container standard-padding')]//button[@class='btn-secondary btn-action t-select-btn']")
	WebElement select1;
	
	@FindBy(xpath="//div[@id='basic-economy-tray-content-1']//button[@class='btn-secondary btn-action t-select-btn']")
	WebElement select2;
	
	@FindBy(xpath="//li[@id='flight-module-2020-03-31t09:40:00-04:00-coach-bwi-atl-nk-4-coach-atl-ewr-nk-1165_2020-04-03t08:52:00-04:00-coach-ewr-clt-nk-875-coach-clt-bwi-nk-1704_']//div[contains(@class,'grid-container standard-padding')]//button[@class='btn-secondary btn-action t-select-btn']")
	WebElement select3;
	
	@FindBy(xpath="//div[@id='basic-economy-tray-content-1']//button[@class='btn-secondary btn-action t-select-btn']")
	WebElement select4;
	
	@FindBy(xpath="//a[@id='forcedChoiceNoThanks']")
	WebElement Nothanks;


   public Result_page3(WebDriver driver) {
	// TODO Auto-generated constructor stub
 
	this.driver=driver;
	PageFactory.initElements(driver, this);	
}
    public void s1() {
	select1.click();
	
}
    public void s2() {
	select2.click();
}
    public void s3() {
	select3.click();
}

	public void s4() {
		select4.click();
	}
	public void notanks() {
		Nothanks.click();
	}
	
	
}

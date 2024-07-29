package airlines.Project2_Airline.easyMyTrip.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EasyMyTrip_SearchResult_Page {

	static WebDriver driver;
	
	@FindBy(xpath = "//select[@id='noptClass']")
	WebElement selectClass;

	public void clickOnClass() {
		selectClass.click();
	}
	
	
	
	
	
	
	public EasyMyTrip_SearchResult_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}

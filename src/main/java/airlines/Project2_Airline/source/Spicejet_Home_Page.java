package airlines.Project2_Airline.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Spicejet_Home_Page {

	static WebDriver driver;
	
	@FindBy(xpath ="//div[contains(text(),'Signup')]")
	WebElement signUpButton;
	
	public void spicejetSignUp() {
		signUpButton.click();
	}
	
	public Spicejet_Home_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
}

package airlines.Project2_Airline.spicejet.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Goibibo_HomePage {

	static WebDriver driver;
	
	@FindBy(xpath = "//span[@role='presentation']")
	WebElement closeIcon;
	
	public void closeIconOnHomePage() {
		closeIcon.click();
	}
	
	public boolean checkHomePagePopup() {
		return closeIcon.isDisplayed();
	}
	
	@FindBy(xpath = "//div[@class='sc-1f95z5i-41 japeUm']//li[2]")
	WebElement login_signin_hower;
	
	public void loginSignHowerOver(WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(login_signin_hower).perform();;
	}
	
	@FindBy(xpath = "//button[normalize-space()='Login/Sign Up']")
	WebElement login_signin_button;
	
	public void loginSign() {
		login_signin_button.click();
	}
	
	public Goibibo_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
}

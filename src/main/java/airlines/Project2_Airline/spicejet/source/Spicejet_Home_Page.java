package airlines.Project2_Airline.spicejet.source;

import java.util.Date;
import java.util.List;

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
	
	
	@FindBy(xpath ="//div[contains(text(),'Login')]")
	WebElement loginButtonInHomePage;
	
	public void spicejetLogin() {
		loginButtonInHomePage.click();
	}
	
	@FindBy(xpath ="//input[@data-testid='user-mobileno-input-box']")
	WebElement mobileNoTextBox;
	
	public void mobileNo() {
		mobileNoTextBox.sendKeys("8097545793");
	}
	
	@FindBy(xpath ="//input[@type='password']")
	WebElement passwordTextBox;
	
	public void invalidPassword() {
		passwordTextBox.sendKeys("8097545793");
	}
	
	public void validPassword() {
		passwordTextBox.sendKeys("Paloskr@123");
	}

	@FindBy(xpath ="(//div[normalize-space()='LOGIN'])[1]")
	WebElement loginButton;
	
	public void login() {
		loginButton.click();
	}
	
	public boolean assertTC02() {
		return !(loginButtonInHomePage.isDisplayed());
	}
	
	@FindBy(xpath ="(//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'])[2]")
	WebElement roundTripButton;
	
	public void selectRoundTrip() {
		roundTripButton.click();
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	@FindBy(xpath ="(//input[@autocapitalize='sentences'])[1]")
	WebElement fromLocation1;
	
	public void fromLocation1() {
		fromLocation1.sendKeys("bOM");
	}
	
	@FindBy(xpath ="(//input[@autocapitalize='sentences'])[2]")
	WebElement toDestination1;
	
	public void toSuggestDestination1() {
		toDestination1.sendKeys("dxb");
	}
	
	
	@FindBy(xpath ="//div[normalize-space()='Departure Date']")
	WebElement departureDate;
	
	
	public void departureDate() {
		departureDate.click();
		
		
		/*
		 * Date date1 = new Date();
		 * 
		 * Date futuredate = new Date(date1.getTime() + (60 * 60 * 1000 * 24 * 22));
		 * System.out.println("Future Date -> " + futuredate);
		 * 
		 * String futureDateInString = futuredate.toString(); String day =
		 * futureDateInString.substring(0, 3); System.out.println(day);
		 * 
		 * String date = futureDateInString.substring(8, 10); System.out.println(date);
		 * 
		 * String month = futureDateInString.substring(4, 7); System.out.println(month);
		 * 
		 * String year = futureDateInString.substring(futureDateInString.length()-4);
		 * System.out.println(year);
		 * 
		 * String finalDate =
		 * day.concat(", ").concat(date+" ").concat(month+" ").concat(year);
		 * System.out.println(finalDate);
		 * 
		 * departureDate.sendKeys(finalDate);
		 */
		
		
	}

	
	@FindBy(xpath ="//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']//*[name()='svg']//*[name()='g' and contains(@fill,'none')]")
	WebElement selectNextMonth;
	
	public void toNextMonth() {
		selectNextMonth.click();
	}

	
	
	
	
	
	
	
	
	
	public Spicejet_Home_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
}

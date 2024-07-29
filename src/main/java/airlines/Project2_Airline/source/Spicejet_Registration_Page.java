package airlines.Project2_Airline.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_Registration_Page {

	static WebDriver driver;

	@FindBy(css = "[class='form-control form-select ']")
	WebElement titleDropdown;

	public void selectTitle() {
		Select selectTitle = new Select(titleDropdown);
		selectTitle.selectByValue("MR");
	}

	@FindBy(xpath = "//input[@id='first_name']")
	WebElement firstNameAndMiddleTextBox;

	public void firstName() {
		firstNameAndMiddleTextBox.sendKeys("Shekhar");
	}

	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastNameTextBox;

	public void lastName() {
		lastNameTextBox.sendKeys("Palo");
	}

	@FindBy(xpath = "//input[@id='dobDate']")
	WebElement dobTextBox;

	public void dobArea() {
		dobTextBox.click();
	}
	
	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
	WebElement selectDOBMonth;
	
	public void selectMonth() {
		Select selectMonth = new Select(selectDOBMonth);
		selectMonth.selectByVisibleText("January");
	}

	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	WebElement selectDOBYear;
	
	public void selectYear() {
		Select selectYear = new Select(selectDOBYear);
		selectYear.selectByValue("2000");
	}
	
	@FindBy(xpath = "//div[@aria-label='Choose Saturday, January 1st, 2000']")
	WebElement dayOfBirth;

	public void dayOfBirth() {
		dayOfBirth.click();
	}
	
	@FindBy(css = "[type='tel']")
	WebElement phoneText;

	public void phoneNo() {
		phoneText.sendKeys("1122334455");
	}
	
	@FindBy(id = "email_id")
	WebElement emailTextBox;

	public void emailID() {
		emailTextBox.sendKeys("spicejet123@gmail.com");
	}
	
	@FindBy(xpath = "//input[@id='new-password']")
	WebElement passwordTextBox;

	public void password() {
		passwordTextBox.sendKeys("Spicejet@123");
	}
	
	@FindBy(xpath = "//input[@id='c-password']")
	WebElement confirmPasswordTextBox;

	public void confirmPassword() {
		confirmPasswordTextBox.sendKeys("Spicejet@123");
	}
	
	@FindBy(css = "[id='defaultCheck1']")
	WebElement agreeCheckBox;

	public void agreeCondition() {
		agreeCheckBox.click();
	}
	
	@FindBy(xpath = "")
	WebElement submitButton;

	public void submit() {
		submitButton.click();
	}
	
	public Spicejet_Registration_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

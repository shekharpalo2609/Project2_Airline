//Verify that the users can successfully register for a new account
package airlines.Project2_Airline.testCases;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import airlines.Project2_Airline.launch_quit.SpiceJet_Launch;
import airlines.Project2_Airline.listener.AirlineListener;
import airlines.Project2_Airline.spicejet.source.Spicejet_Home_Page;
import airlines.Project2_Airline.spicejet.source.Spicejet_Registration_Page;

@Listeners(AirlineListener.class)
public class TC01 extends AirlineListener {

	@Test // (retryAnalyzer = GoibiboRetryAnalyzer.class)
	public void registrationSpicejet() throws InterruptedException {

		SpiceJet_Launch launch = new SpiceJet_Launch();
		launch.launchSpicejet();

		Spicejet_Home_Page homePage = new Spicejet_Home_Page(driver);
		homePage.spicejetSignUp();

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> parentChildId = windowHandles.iterator();
		String parentId = parentChildId.next();
		String childId = parentChildId.next();
		driver.switchTo().window(childId);

		Spicejet_Registration_Page spicejetRegister = new Spicejet_Registration_Page(driver);
		spicejetRegister.selectTitle();
		spicejetRegister.firstName();
		spicejetRegister.lastName();
		spicejetRegister.dobArea();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='react-datepicker__month-container']")));

		spicejetRegister.selectMonth();
		spicejetRegister.selectYear();
		spicejetRegister.dayOfBirth();
		Thread.sleep(1000);
		spicejetRegister.phoneNo();
		Thread.sleep(1000);
		spicejetRegister.emailID();
		Thread.sleep(1000);
		spicejetRegister.password();
		Thread.sleep(1000);
		spicejetRegister.confirmPassword();
		Thread.sleep(1000);
		spicejetRegister.agreeCondition();
		spicejetRegister.submit();
	}

}

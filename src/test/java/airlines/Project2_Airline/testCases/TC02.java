//Verify the login functionality with valid credentials

package airlines.Project2_Airline.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import airlines.Project2_Airline.launch_quit.SpiceJet_Launch;
import airlines.Project2_Airline.listener.AirlineListener;
import airlines.Project2_Airline.retryAnalyzer.AirlineRetryAnalyzer;
import airlines.Project2_Airline.spicejet.source.Spicejet_Home_Page;

@Listeners(AirlineListener.class)
public class TC02 extends AirlineListener{

	@Test(retryAnalyzer = AirlineRetryAnalyzer.class)
	public void validLogin() {
		
		SpiceJet_Launch launch = new SpiceJet_Launch();
		launch.launchSpicejet();
		
		Spicejet_Home_Page homePage = new Spicejet_Home_Page(driver);
		homePage.spicejetLogin();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//div[normalize-space()='Or login as'])[2]")));

		homePage.mobileNo();
		homePage.validPassword();
		homePage.login();
		
		Assert.assertEquals(homePage.assertTC02(), false, "Test case 2 failed");
		
	}

}

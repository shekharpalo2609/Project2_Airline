//Test the search functionality for round-trip fights

package airlines.Project2_Airline.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import airlines.Project2_Airline.easyMyTrip.source.EasyMyTrip_Home_Page;
import airlines.Project2_Airline.launch_quit.EasyMyTrip_Launch;
import airlines.Project2_Airline.listener.AirlineListener;
import airlines.Project2_Airline.retryAnalyzer.AirlineRetryAnalyzer;

@Listeners(AirlineListener.class)
public class TC05 extends AirlineListener {

	@Test(retryAnalyzer = AirlineRetryAnalyzer.class)
	public void searchRoundTrip() {
		
		EasyMyTrip_Launch launch = new EasyMyTrip_Launch();
		launch.launchEasyMyTrip();
		
		
		EasyMyTrip_Home_Page homePage = new EasyMyTrip_Home_Page(driver);		
		homePage.selectRoundTrip();
		homePage.sourceLocation();
		homePage.sourceLocationSearch();
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='showOWRT']//div[@class='fss_flex depcity_colm sechver']//li[1]//div[1]//div[1]//p[1]")));
		homePage.selectSourceLocation();
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='To'])[3]")));
		homePage.destinationLocationSearch();
		homePage.selectDestinationLocation();
		
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@alt='Arrow'])[2]")));
		homePage.nextMonth();
		homePage.selectDepartureDate();
		homePage.selectArrivalDate();
		homePage.searchFlights();
		
		Assert.assertEquals(homePage.assertTC05(), true, "TestCase 05 failed!");
		
		
	}
	
}

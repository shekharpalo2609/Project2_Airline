//Test the search functionality for one-way flights

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

@Listeners(AirlineListener.class)
public class TC04 extends AirlineListener {

	@Test // (retryAnalyzer = GoibiboRetryAnalyzer.class)
	public void searchOneWayFlight() {
		
		EasyMyTrip_Launch launch = new EasyMyTrip_Launch();
		launch.launchEasyMyTrip();
		
		
		EasyMyTrip_Home_Page homePage = new EasyMyTrip_Home_Page(driver);
		homePage.sourceLocation();
		homePage.sourceLocationSearch();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='showOWRT']//div[@class='fss_flex depcity_colm sechver']//li[1]//div[1]//div[1]//p[1]")));
		homePage.selectSourceLocation();
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='To'])[3]")));
		homePage.destinationLocationSearch();
		homePage.selectDestinationLocation();
		homePage.nextMonth();
		homePage.selectDepartureDate();
		homePage.searchFlights();
		
		Assert.assertEquals(homePage.assertTC04(), true, "TestCase 04 failed!");
		
		
	}

}

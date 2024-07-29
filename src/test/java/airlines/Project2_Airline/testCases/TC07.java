//Test for multi-city flight search

package airlines.Project2_Airline.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import airlines.Project2_Airline.easyMyTrip.source.EasyMyTrip_Home_Page;
import airlines.Project2_Airline.launch_quit.EasyMyTrip_Launch;
import airlines.Project2_Airline.listener.AirlineListener;
import airlines.Project2_Airline.retryAnalyzer.AirlineRetryAnalyzer;

@Listeners(AirlineListener.class)
public class TC07 extends AirlineListener {

	@Test(retryAnalyzer = AirlineRetryAnalyzer.class)
	public void multiCityFlight() throws InterruptedException {
		
		EasyMyTrip_Launch launch = new EasyMyTrip_Launch();
		launch.launchEasyMyTrip();
		
		EasyMyTrip_Home_Page homePage = new EasyMyTrip_Home_Page(driver);		
		homePage.selectMultiCityTrip();
		
		//source location
		homePage.sourceLocationTextboxForMultiCity();
		homePage.sourceLocationSearchForMultiCity();
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='spnMumbai']")));
		homePage.selectSourceLocationForMultiCity();
		
		//intermediate location
		homePage.intermediateLocationTextboxForMultiCity();
		homePage.intermediateLocationSearchForMultiCity();
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ToMulti1']//div[@class='mflexcol']")));
		homePage.selectIntermediateLocationForMultiCity();
		Thread.sleep(2000);
		homePage.clickDepartureDateForMultiCity();
		
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@alt='Arrow'])[2]")));
		homePage.nextMonth();
		homePage.selectDepartureDate();
		homePage.destinationLocationTextboxForMultiCity();
		homePage.destinationLocationSearchForMultiCity();
		homePage.selectDestinationLocationForMultiCity();
		homePage.clickArrivalDateForMultiCity();
		homePage.selectArrivalDate();
		homePage.searchFlightsForMultiCity();
		
		
		
		
		
		
		
	}
}

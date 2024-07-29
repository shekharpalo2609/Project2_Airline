//Check for seat selection during booking process

package airlines.Project2_Airline.testCases;

import org.testng.annotations.Test;

import airlines.Project2_Airline.launch_quit.SpiceJet_Launch;
import airlines.Project2_Airline.listener.AirlineListener;
import airlines.Project2_Airline.spicejet.source.Spicejet_Home_Page;

public class TC08 extends AirlineListener {

	@Test // (retryAnalyzer = GoibiboRetryAnalyzer.class)
	public void selectSeat() {
		
		
		SpiceJet_Launch launch = new SpiceJet_Launch();
		launch.launchSpicejet();
		
		Spicejet_Home_Page homePage = new Spicejet_Home_Page(driver);
		homePage.spicejetLogin();
		homePage.mobileNo();
		homePage.validPassword();
		homePage.login();
	}
}

//Verify that the users can successfully register for a new account
package airlines.Project2_Airline.testCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import airlines.Project2_Airline.launch_quit.Goibibo_Launch;
import airlines.Project2_Airline.listener.GoibiboListener;
import airlines.Project2_Airline.retryAnalyzer.GoibiboRetryAnalyzer;
import airlines.Project2_Airline.source.Goibibo_HomePage;

@Listeners(GoibiboListener.class)
public class TC01 extends GoibiboListener {
	
	@Test//(retryAnalyzer = GoibiboRetryAnalyzer.class)
	public void registrationGoibibo() {
		
		Goibibo_Launch launch = new Goibibo_Launch();
		launch.launchGoibibo();
		
		Goibibo_HomePage homePage = new Goibibo_HomePage(driver);
		
		if(homePage.checkHomePagePopup() == true) {
			
			homePage.closeIconOnHomePage();
		}
		
		homePage.loginSignHowerOver(driver);
		homePage.loginSign();
		
	}
	
	
	

}

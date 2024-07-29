package airlines.Project2_Airline.launch_quit;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import airlines.Project2_Airline.listener.AirlineListener;

public class SpiceJet_Launch extends AirlineListener{

	public void launchSpicejet() {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		driver = new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		//driver.switchTo().alert().dismiss();
		
	}
}

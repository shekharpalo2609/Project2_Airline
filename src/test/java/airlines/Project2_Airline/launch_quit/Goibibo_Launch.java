package airlines.Project2_Airline.launch_quit;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import airlines.Project2_Airline.listener.GoibiboListener;

public class Goibibo_Launch extends GoibiboListener{

	public void launchGoibibo() {
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
}

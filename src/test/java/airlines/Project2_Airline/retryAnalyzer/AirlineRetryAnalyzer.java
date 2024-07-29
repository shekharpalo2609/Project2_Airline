package airlines.Project2_Airline.retryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class AirlineRetryAnalyzer implements IRetryAnalyzer{

	int initialCount = 0;
	int retryCount = 3;

	public boolean retry(ITestResult result) {
		if(initialCount < retryCount) {
			initialCount++;
			return true;
		}
		
		return false;
	}

}

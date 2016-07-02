package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Application_validation_Equals_Method {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrm.com/index.php/dashboard");
		
		String expResult = "OrangeHRm";
		String actResult = driver.getTitle();
		
		System.out.println("Actual Result is :"+ actResult);
		
		if(expResult.equals(actResult))
		{
			System.out.println("Test Passed");
			
		}
		else
		{
			
			System.out.println("Test Failed");
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}

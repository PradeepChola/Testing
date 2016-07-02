package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		Sleeper.sleepTightInSeconds(5);
		//takescreenshot and get screenshot as output file and save it as input file in the specific folder with name
		//Remember the code....
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\ScreenShots_Webdriver\\google.jpg"));
		driver.close();
	}

}

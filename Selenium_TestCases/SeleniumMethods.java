package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SeleniumMethods {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		String expectedTitle = "My Title";
		assertEquals(actualTitle, expectedTitle);
		@SuppressWarnings("unused")
		String pageSource=driver.getPageSource();
		boolean b=driver.getPageSource().contains("Google");
		assertTrue(b);

	}
	private static void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}
	private static void assertEquals(String actualTitle, String expectedTitle) {
		// TODO Auto-generated method stub
		
	}

}

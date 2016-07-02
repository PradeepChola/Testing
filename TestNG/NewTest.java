package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test(priority=2)
  public void f() {
	  System.out.println("Second");
  }
  
  @Test
  public void a(){
	  System.out.println("First");
  }
 
  @Test
  public void z(){
	  System.out.println("Third");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Start");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("End/Stop");
  }

}

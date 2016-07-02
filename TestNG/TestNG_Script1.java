package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNG_Script1 {
  @Test
  public void f() {
	 System.out.println("Second");
  }
  
  @Test
  public void a(){
	 System.out.println("First");
  }
  
  @Test
  public void g(){
	  System.out.println("Third");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("START");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Close OR Stop");
  }

}

package myPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testgoogle {
	
	@Test
	public void testGoogle(){
	 
	WebDriver driver=new FirefoxDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("http://www.google.com");
	 
	driver.quit();
	 
	}

}


import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Testing {
	
	WebDriver driver;
	@BeforeClass
	public void before(){
		driver = new FirefoxDriver();
	}

	@Test
	public void Google() {
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void Yahoo(){
		driver.get("http://www.yahoo.com");
		System.out.println(driver.getTitle());
	}

}

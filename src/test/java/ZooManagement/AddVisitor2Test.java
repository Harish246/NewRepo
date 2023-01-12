package ZooManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static GenericUtility.PropertyFile.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddVisitor2Test {
	@Test
	public void addVisitor() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get(readDataFromPropertyFile("url"));
		
	}

}

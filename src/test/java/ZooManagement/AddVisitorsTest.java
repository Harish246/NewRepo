package ZooManagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepo.LoginPage;

import static GenericUtility.PropertyFile.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddVisitorsTest {
	@Test
	private void addVisitorsTest() throws Throwable{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(101, TimeUnit.SECONDS);
		driver.get(readDataFromPropertyFile("url"));
		driver.manage().window().maximize();
		
		LoginPage loginpage= new LoginPage(driver);
		loginpage.getUserNameff().sendKeys(readDataFromPropertyFile("username"));
		loginpage.getPasswordff().sendKeys(readDataFromPropertyFile("password"));
		loginpage.getLoginBTN().click();
	}

}

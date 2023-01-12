package GenericUtility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.github.javafaker.File;
import com.google.common.io.Files;

import ObjectRepo.HomePageClass;
import ObjectRepo.LoginPage;

import static GenericUtility.PropertyFile.*;
import java.io.IOException;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sdDriver;
	WebdriverUtility webdriverUtility;
	@BeforeSuite
	public void connectToDb() {
		System.out.println(" connect to Db ");
	}
	@AfterSuite
	public void disConnectDb(){
		System.out.println(" disConnect to Db ");
	}
	@BeforeClass
	public void launchTheBrowser() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(readDataFromPropertyFile("url"));
		webdriverUtility= new WebdriverUtility(driver);
		webdriverUtility.maximize();
		webdriverUtility.implicitlyWait();
	}
	@AfterClass
	public void closeTheBrowser() {
		driver.close();
	}
	
	@BeforeMethod
	public void loginToApp() throws Throwable {
		LoginPage loginPage= new LoginPage(driver);
		loginPage.getUserNameff().sendKeys(readDataFromPropertyFile("username"));
		loginPage.getPasswordff().sendKeys(readDataFromPropertyFile("password"));
		loginPage.getLoginBTN().click();
		}
	@AfterMethod
	public void logoutFromapp() {
		HomePageClass homepage= new HomePageClass(driver);
		homepage.getHomeBTN().click();
		homepage.getAdminBTN().click();
		homepage.getLogOutBTN().click();
	}
	
	public static String takeScreenShort(String name) {
		TakesScreenshot ts= (TakesScreenshot)sdDriver;
		java.io.File src = ts.getScreenshotAs(OutputType.FILE);
		String path= "./ScreenShort1/"+name+".PNG";
		java.io.File dest = new java.io.File(path);
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
	}
	

}

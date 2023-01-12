package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {
	WebDriver driver;
	
	@FindBy(className ="ti-dashboard")
	private WebElement dashBoard;
	
	@FindBy(xpath = "//span[text()='Animals Details']")
	private WebElement animalsDetails;
	
//	[class='ti-layout-sidebar-left']
	
	@FindBy(xpath = "//span[normalize-space(text())='Manage Type Ticket']")
	private WebElement manageTypeTicket;
	
	@FindBy(xpath = "//span[text()='Normal Ticket']")
	private WebElement normalTicket;
	
	@FindBy(xpath = "//span[text()='Foreigners Ticket']")
	private WebElement foreignersTicket;
	
	@FindBy(xpath = "//span[text()='Page']")
	private WebElement page;
	
	@FindBy(xpath = "//span[text()='Reports']")
	private WebElement reports;
	
	@FindBy(linkText = "Home")
	private WebElement homeBTN;
	
	@FindBy(xpath = "//h4[text()='Admin ']")
	private WebElement AdminBTN;
	
	@FindBy(xpath = "//a[text()='Log Out']")
	private WebElement logOutBTN;
	
	@FindBy(xpath = "//span[text()='Search']")
	private WebElement search;
	
	public  HomePageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getHomeBTN() {
		return homeBTN;
	}

	public WebElement getAdminBTN() {
		return AdminBTN;
	}

	public WebElement getLogOutBTN() {
		return logOutBTN;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDashBoard() {
		return dashBoard;
	}

	public WebElement getAnimalsDetails() {
		return animalsDetails;
	}

	public WebElement getManageTypeTicket() {
		return manageTypeTicket;
	}

	public WebElement getNormalTicket() {
		return normalTicket;
	}

	public WebElement getForeignersTicket() {
		return foreignersTicket;
	}

	public WebElement getPage() {
		return page;
	}

	public WebElement getReports() {
		return reports;
	}

	public WebElement getSearch() {
		return search;
	}

}

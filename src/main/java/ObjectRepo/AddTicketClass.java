package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddTicketClass {
	WebDriver driver;
	@FindBy(linkText = "Add Ticket")
	private WebElement addTicket;
	
	@FindBy(id= "visitorname")
	private WebElement visitorTF;
	
	@FindBy(id="noadult")
	private WebElement adultTF;
	
	@FindBy(id="nochildren")
	private WebElement childrenTF;
	
	@FindBy(name = "submit")
	private WebElement submitBTN;
	

}

package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		WebDriver driver;
		
		@FindBy(id="username")
		private WebElement userNameff;
		@FindBy(id="password")
		private WebElement passwordff;
		@FindBy(id="form_submit")
		private WebElement LoginBTN;
		
		public LoginPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getUserNameff() {
			return userNameff;
		}

		public WebElement getPasswordff() {
			return passwordff;
		}

		public WebElement getLoginBTN() {
			return LoginBTN;
		}
		


}

package ZooManagement;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepo.HomePageClass;

public class AddVisitor4TEST extends BaseClass{
	@Test
	public void foreign() {
		HomePageClass homePageClass= new HomePageClass(driver);
		homePageClass.getForeignersTicket().click();
	
	}

}

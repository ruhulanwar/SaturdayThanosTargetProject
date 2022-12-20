package upskill.target.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.target.pageElements.TargetHomePageLocators;
import upskill.utilities.SetupDrivers;

public class TargetHomePageActions {

	TargetHomePageLocators TargetHomePageLocatorsObj;

	public TargetHomePageActions() {
		TargetHomePageLocatorsObj = new TargetHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, TargetHomePageLocatorsObj);
	}

	public void searchItems(String items) throws Exception {
		TargetHomePageLocatorsObj.txtbxSearch.sendKeys(items);
		TargetHomePageLocatorsObj.btnSearch.click();
		Thread.sleep(2000);
	}
}
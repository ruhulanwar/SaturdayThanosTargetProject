package upskill.target.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TargetHomePageLocators {

	@FindBy(xpath = "//*[@aria-label='Search: suggestions appear below']")
	public WebElement txtbxSearch;

	@FindBy(xpath = "//*[text()='go']")
	public WebElement btnSearch;

}
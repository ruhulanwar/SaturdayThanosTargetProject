package upskill.target.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TargetSearchResultLocators {

	// Validate Brand Items
	@FindBy(xpath = "//h2[@class='Heading__StyledHeading-sc-1ihrzmk-0 esAStc h-display-block h-margin-b-tiny']")
	public WebElement verifyProductsOfBrand;

	// Click Brand Filter
	@FindBy(xpath = "//*[text()='Brand']")
	public WebElement clickBrandBtn;

	// Checkbox Brand Batman
	@FindBy(xpath = "//div[contains(text(),'Batman')]")
	public WebElement cbxBrandBatman;

	// Checkbox Brand ASICS
	@FindBy(xpath = "//div[contains(text(),'ASICS')]")
	public WebElement cbxBrandASICS;

	// Checkbox Brand AVENUE
	@FindBy(xpath = "//div[contains(text(),'AVENUE')]")
	public WebElement cbxBrandAVENUE;

	// Click Update
	@FindBy(xpath = "//button[@aria-label='Update']")
	public WebElement clickUpdateBrand;

}
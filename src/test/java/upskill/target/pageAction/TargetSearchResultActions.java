package upskill.target.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import upskill.target.pageElements.TargetSearchResultLocators;
import upskill.utilities.SetupDrivers;

public class TargetSearchResultActions {

	TargetSearchResultLocators TargetSearchResultLocatorsObj;

	public TargetSearchResultActions() {
		TargetSearchResultLocatorsObj = new TargetSearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, TargetSearchResultLocatorsObj);
	}

	public void clickBrandButton() {
		TargetSearchResultLocatorsObj.clickBrandBtn.click();
	}

	public void clickUpdateButton() {
		TargetSearchResultLocatorsObj.clickUpdateBrand.click();
	}

	public void verifyShoesItems() {
		Assert.assertTrue(TargetSearchResultLocatorsObj.verifyProductsOfBrand.isDisplayed());
	}

	public void filterBrand(String brand) {
		if (brand.equals("Batman")) {
			TargetSearchResultLocatorsObj.cbxBrandBatman.click();
		} else if (brand.equals("ASICS")) {
			TargetSearchResultLocatorsObj.cbxBrandASICS.click();
		} else if (brand.equals("AVENUE")) {
			TargetSearchResultLocatorsObj.cbxBrandAVENUE.click();
		} else {
			System.out.println("Brand not found");
		}
	}

	public void VerifyBrandItems(String brand) {
		if (brand.equals("Batman")) {
			Assert.assertTrue(TargetSearchResultLocatorsObj.verifyProductsOfBrand.isDisplayed());
		} else if (brand.equals("ASICS")) {
			Assert.assertTrue(TargetSearchResultLocatorsObj.verifyProductsOfBrand.isDisplayed());
		} else if (brand.equals("AVENUE")) {
			Assert.assertTrue(TargetSearchResultLocatorsObj.verifyProductsOfBrand.isDisplayed());
		} else {
			System.out.println("Brand not found");
		}
	}

}
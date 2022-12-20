package upskill.target.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.target.pageAction.TargetSearchResultActions;

public class TargetSearchResultSteps {

	TargetSearchResultActions TargetSearchResultActionsObj = new TargetSearchResultActions();

	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		Thread.sleep(2000);
		TargetSearchResultActionsObj.clickBrandButton();
		Thread.sleep(2000);
		TargetSearchResultActionsObj.filterBrand(brand);
		Thread.sleep(2000);
		TargetSearchResultActionsObj.clickUpdateButton();
		Thread.sleep(2000);
	}

	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String brand) throws Throwable {
		TargetSearchResultActionsObj.VerifyBrandItems(brand);
	}

}
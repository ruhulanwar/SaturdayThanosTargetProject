package upskill.target.stepDef;

import cucumber.api.java.en.*;
import upskill.target.pageAction.TargetHomePageActions;

public class TargetHomePageSteps {

	TargetHomePageActions TargetHomePageActionsObj = new TargetHomePageActions();

	@Given("^Open Target Homepage$")
	public void open_Target_Homepage() throws Throwable {


	}

	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		TargetHomePageActionsObj.searchItems(items);

	}
}
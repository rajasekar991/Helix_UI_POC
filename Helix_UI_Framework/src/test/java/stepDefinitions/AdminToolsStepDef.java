package stepDefinitions;

import java.util.List;
import java.util.Map;

import com.helix.team.factory.DriverFactory;
import com.helix.team.pages.HelixLoginPage;
import com.helix.team.pages.HelixMeetingListPage;
import com.helix.team.pages.HelixRequestMeetingPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class AdminToolsStepDef {
	
	HelixLoginPage helixLogin = new HelixLoginPage(DriverFactory.getDriver());
	HelixMeetingListPage helixmeetingListPage;
	
	
	
	@Given("Validate Admin Tools label on the page")
	public void validate_Admin_Tools_label_on_the_page()
	{
		
	}

}

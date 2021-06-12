package stepDef;

import java.util.List;

import org.testng.Assert;

import Pages.HomePage;
import base.BaseUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class steps extends BaseUtils{
	private  BaseUtils base;

	public steps(BaseUtils base) {
		this.base=base;
	}
	@Given("launch the application")
	public void launch_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("print the title")
	public void print_the_title() { 
	    base.driver.get("https://www.google.com/");
	    System.out.println(base.driver.getTitle());
	}
	@Given("launch the application url {string}")
	public void launch_the_application_url(String string) {	   
	    HomePage hp= new HomePage(base);
	    hp.OpenUrl(string);
	}

	@And("print the title of the url {string}")
	public void print_the_title_of_the_url(String string) {
	}
	
	@Given("I want to launch the website")
	public void i_want_to_launch_the_website() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("inside backgroud");
	}

	@When("User enter the username {string} and password {string}")
	public void user_enter_the_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("inside backgroud");
	}
	@Then("User is able to login the application")
	public void user_is_able_to_login_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("inside backgroud");
	}

	@Given("User should able to see the dashboard tab")
	public void user_should_able_to_see_the_dashboard_tab() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Scenario 1");
	}

	@Then("user should click on search button")
	public void user_should_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Scenario 1");
	}

	@Given("User should able to see the Report tab")
	public void user_should_able_to_see_the_report_tab() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Scenario 2");
	}

	@Then("User should able to export the report")
	public void user_should_able_to_export_the_report() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Scenario 2");
		Assert.assertTrue(true);
	}
	@Then("Provide the data")
	public void provide_the_data(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<List<String>> obj =dataTable.asLists();
	    System.out.println(obj.get(0).get(1));
	}

}

package cucumber_learning;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MMA {
	@Given("I am intrested in reading MMA Books")
	public void i_am() {
		System.out.println("I am intrested in reading MMA Books");
	}
	@And("I went online to find different MMA Stores")
	public void i_Went() {
		System.out.println("I went online to find different MMA Stores");
	}
    @And("I shortlisted 4 MMA Book Stores near my place")
    public void i_shortlisted() {
		System.out.println("I shortlisted 4 MMA Book Stores near my place");
	}
    @When("I enquired about one store closest to my place they asked me to come and have a look")
    public void i_enquired() {
		System.out.println("I enquired about one store closest to my place they asked me to come and have a look");
	}
    @And("I decided to visit them")
    public void i_decided() {
		System.out.println("I decided to visit them");
	}
    @When("I went to visit the sore on 20 may 2022")
    public void i_Went_Visit() {
		System.out.println("I went to visit the sore on 20 may 2022");
	}
    @And("I decided to book membership for 3 months")
    public void i_decided_to() {
		System.out.println("I decided to book membership for 3 months");
	}
    @But("I decided to keep a shopKeepar")
    public void shopKeepar() {
		System.out.println("I decided to keep a shopKeepar");
	}
    @Then("I purchased a Rich dad and poor dad book")
    public void i_purchased() {
		System.out.println("I purchased a Rich dad and poor dad book");
	}
}

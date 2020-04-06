package shouty;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    Person lucy = new Person();
    static Person sean = new Person();
    
    public static void Main() {
    	sean.setLocation(0);
    }
    
	@Given("^Lucy is (\\d+)m from Sean$")
	public void lucy_is_350m_from_Sean(int distance) {
	    lucy.setLocation(sean.getLocation() + distance);
	}

	@When("^Sean shouts \"(.*?)\"$")
	public void sean_shouts(String message) {
	    sean.shout(message);
	}

	@Then("^Lucy should hear Sean's message$")
	public void lucy_should_hear_Sean_s_message() {
		Assert.assertEquals(sean.getShout(), lucy.getShout());
	}
}

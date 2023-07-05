package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.LoggedInQuestions;
import tasks.LoginTo;
import tasks.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LogInSteps {


   @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("I am on the login view")
    public void i_am_on_the_login_view() {
        theActorCalled("Josimar")
                .attemptsTo(new NavigateTo());
    }
    @When("I login with {string} and {string}")
    public void i_login_with_and(String email, String password) {
     theActorInTheSpotlight().attemptsTo(
             new LoginTo(email,password)
     );

    }
    @Then("I should see a flash message saying {string}")
    public void i_should_see_a_flash_message_saying(String message) {
        theActorInTheSpotlight().should(
                seeThat("the welcome text", LoggedInQuestions.value(),
                        equalTo(message))
        );
    }
}

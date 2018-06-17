package example.steps.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import questions.SerenityProjectTitle;
import tasks.Search;
import tasks.Select;
import ui.GoogleSearchPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class SearchForFrameworkSteps {
    GoogleSearchPage googleSearchPage;

    @Given("^(\\w+) search for \"(.*)\"$")
    public void test(String actor, String searchParameter) {
        theActorCalled(actor).attemptsTo(
                Open.browserOn(googleSearchPage),
                Search.by(searchParameter)
        );
    }

    @When("^he opens first link in google$")
    public void heOpensFirstLinkInGoogle() {
        theActorInTheSpotlight().attemptsTo(
                Select.firstResult()
        );
    }

    @Then("^he is able to see BDD examples project$")
    public void heIsAbleToSeeBDDExamplesProject() {
        theActorInTheSpotlight().should(
            seeThat(SerenityProjectTitle.isDisplayed(), is(true))
        );
    }
}

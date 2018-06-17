package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import ui.GoogleSearchPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Search implements Task {
    private String searchParameter;

    public Search(String searchParameter) {
        this.searchParameter = searchParameter;
    }

    public static Performable by(String searchParameter) {
        return instrumented(Search.class, searchParameter);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(searchParameter).into(GoogleSearchPage.SEARCH_FIELD).thenHit(Keys.ENTER)
        );
    }
}

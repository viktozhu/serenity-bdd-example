package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.GoogleSearchPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Select implements Task {
    public static Performable firstResult() {
        return instrumented(Select.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(GoogleSearchPage.FIRST_SEARCH_RESULT));
    }
}

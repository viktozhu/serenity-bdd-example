package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import ui.SerenitySampleProjectPage;

public class SerenityProjectTitle implements Question<Boolean> {

    public static SerenityProjectTitle isDisplayed() {
        return new SerenityProjectTitle();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(SerenitySampleProjectPage.PROJECT_TITLE).viewedBy(actor).value();
    }
}

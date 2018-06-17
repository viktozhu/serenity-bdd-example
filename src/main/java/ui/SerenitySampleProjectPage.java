package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenitySampleProjectPage extends PageObject {
        public static final Target PROJECT_TITLE = Target.the("Serenity bdd project title").located(By.id("user-content-serenity-sample-projects"));
}

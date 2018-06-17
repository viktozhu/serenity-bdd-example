package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.google.com/")
public class GoogleSearchPage extends PageObject {
    public static final Target SEARCH_FIELD = Target.the("google search").located(By.id("lst-ib"));
    public static final Target FIRST_SEARCH_RESULT = Target.the("first search result").locatedBy("//*[@id='ires']//a");
}

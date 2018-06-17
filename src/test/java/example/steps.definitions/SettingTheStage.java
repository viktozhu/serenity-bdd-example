package example.steps.definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SettingTheStage {
    @Before
    public void prepareTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void finishUp() {
        OnStage.drawTheCurtain();
    }
}

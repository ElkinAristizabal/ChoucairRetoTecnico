package choucair.stepdefinitions;

import choucair.questions.ElementVisible;
import choucair.questions.ValidateText;
import choucair.tasks.RegisterNewUser;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import choucair.tasks.Login;
import choucair.tasks.NavigateToWebsite;

import static choucair.userinterfaces.EmplyeeListUI.*;
import static choucair.userinterfaces.HomePageUI.PHOTO_USER;
import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class PruebaStepDefinitions {

    public static Actor actor = Actor.named("Usuario");

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setupInitial() {
        setTheStage(new OnlineCast());
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^paso uno$")
    public void pasoUno() {
        actor.wasAbleTo(
                NavigateToWebsite.withLink()
        );
    }

    @When("^paso dos$")
    public void pasoDos() {
        actor.attemptsTo(
                Login.exitoso()
        );
    }

    @And("^paso tres$")
    public void pasoTres() {
        actor.should(
                seeThat(
                        ElementVisible.of(PHOTO_USER), equalTo(true)
                )
        );
    }

    @Then( "^paso cuatro$")
    public void pasoCuatro () {
        actor.attemptsTo(
                RegisterNewUser.inApp()
        );
    }

    @And( "^paso cinco")
    public void pasoCinco () {
        actor.should(
                seeThat(
                        ValidateText.ofElement(INPUT_EMPLOYEE_NAME_VALIDATE, "Choucair Test")
                )
        );
    }
}

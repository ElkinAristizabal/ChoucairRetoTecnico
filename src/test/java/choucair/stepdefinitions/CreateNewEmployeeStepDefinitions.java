package choucair.stepdefinitions;

import choucair.questions.ElementVisible;
import choucair.questions.ValidateText;
import choucair.tasks.DeleteUserCreated;
import choucair.tasks.RegisterNewUser;
import io.cucumber.java.After;
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

public class CreateNewEmployeeStepDefinitions {

    public static Actor actor = Actor.named("Usuario");

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setupInitial() {
        setTheStage(new OnlineCast());
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^user navegate to web site login page$")
    public void pasoUno() {
        actor.wasAbleTo(
                NavigateToWebsite.withLink()
        );
    }

    @When("user login in the app whit the user {string} and password {string}")
    public void userLoginInTheAppWhitTheUserAndPassword(String username, String password) {
        actor.attemptsTo(
                Login.exitoso(username, password)
        );
        actor.should(
                seeThat(
                        ElementVisible.of(PHOTO_USER), equalTo(true)
                )
        );
    }

    @And("^register a new employee$")
    public void pasoTres() {
        actor.attemptsTo(
                RegisterNewUser.inApp()
        );
    }

    @Then( "^could see the new employee register$")
    public void pasoCuatro () {
        actor.should(
                seeThat(
                        ValidateText.ofElement(INPUT_EMPLOYEE_NAME_VALIDATE, "Choucair Test")
                )
        );
    }

    @After("@createNewEmployee")
    public void deleteUserCreated(){
        actor.attemptsTo(DeleteUserCreated.inApp());
    }


}

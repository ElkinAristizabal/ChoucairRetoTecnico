package choucair.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static choucair.userinterfaces.AddEmployeeUI.*;
import static choucair.userinterfaces.EmplyeeListUI.*;
import static choucair.userinterfaces.HomePageUI.BUTTON_PIM;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class RegisterNewUser implements Task {


    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_PIM),
                Click.on(BUTTON_ADD_USER),
                WaitUntil.the(INPUT_FIRST_NAME, isVisible()).
                        forNoMoreThan(10).seconds().then(Enter.theValue("Choucair").into(INPUT_FIRST_NAME)),
                Enter.theValue("Test").into(INPUT_MIDDLE_NAME),
                Enter.theValue("User").into(INPUT_LAST_NAME),
                Clear.field(INPUT_EMPLOYEE_ID).then(Enter.theValue("777").into(INPUT_EMPLOYEE_ID)),
                Click.on(SWIPE_LOGIN_DETAILS),
                WaitUntil.the(INPUT_USERNAME, isVisible()).
                        forNoMoreThan(10).seconds().then( Enter.theValue("choutest").into(INPUT_USERNAME)),
                Enter.theValue("choutest123").into(INPUT_PASSWORD),
                Enter.theValue("choutest123").into(INPUT_CONFIRM_PASSWORD),
                Click.on(BUTTON_SAVE),
                Click.on(BUTTON_EMPLOYEE_LIST),
                Click.on(BUTTON_SUBMIT),
                WaitUntil.the(INPUT_EMPLOYEE_NAME, isVisible()).
                        forNoMoreThan(10).seconds().then( Enter.theValue("choutest").into(INPUT_EMPLOYEE_NAME))

        );
    }

    public static RegisterNewUser inApp(){
        return Instrumented.instanceOf(RegisterNewUser.class).withProperties();
    }
}

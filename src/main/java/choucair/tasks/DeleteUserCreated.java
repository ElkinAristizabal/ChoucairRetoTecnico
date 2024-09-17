package choucair.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static choucair.userinterfaces.EmplyeeListUI.*;


public class DeleteUserCreated implements Task {

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_DELETE_EMPLOYEE),
                Click.on(BUTTON_CONFIRM_DELETE_EMPLOYEE)
        );
    }

    public static DeleteUserCreated inApp(){
        return Instrumented.instanceOf(DeleteUserCreated.class).withProperties();
    }
}

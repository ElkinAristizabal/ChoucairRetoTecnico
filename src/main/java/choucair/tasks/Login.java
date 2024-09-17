package choucair.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static choucair.userinterfaces.LoginUI.*;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Admin").into(INPUT_USERNAME),
                Enter.theValue("admin123").into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );
    }

    public static Login exitoso(){
        return Instrumented.instanceOf(Login.class).withProperties();
    }

}

package choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static choucair.userinterfaces.LoginUI.*;

public class Login implements Task {

    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(INPUT_USERNAME),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );
    }

    public static Login exitoso(String username, String password){
        return new Login (username, password);
    }

}

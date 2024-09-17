package choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

    private LoginUI() {
    }

    public static final Target INPUT_USERNAME = Target.the("Text box username").located(By.cssSelector("input[name='username']"));
    public static final Target INPUT_PASSWORD = Target.the("Text box password").located(By.cssSelector("input[name='password']"));
    public static final Target BUTTON_LOGIN= Target.the("Text box username").located(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button'"));

}

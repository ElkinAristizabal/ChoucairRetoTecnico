package choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddEmployeeUI {

    private AddEmployeeUI (){
    }

    public static final Target INPUT_FIRST_NAME = Target.the("First name text box").located(By.cssSelector("input[name='firstName']"));
    public static final Target INPUT_MIDDLE_NAME = Target.the("Middle name text box").located(By.cssSelector("input[name='middleName']"));
    public static final Target INPUT_LAST_NAME = Target.the("Last name text box").located(By.cssSelector("input[name='lastName']"));
    public static final Target INPUT_EMPLOYEE_ID = Target.the("Employee id text box").located(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
    public static final Target SWIPE_LOGIN_DETAILS = Target.the("Login details swipe").located(By.cssSelector("span[class='oxd-switch-input oxd-switch-input--active --label-right']"));
    public static final Target INPUT_USERNAME = Target.the("Username text box").located(By.xpath("(//input[@autocomplete='off' and @class='oxd-input oxd-input--active'])[1]"));
    public static final Target INPUT_PASSWORD = Target.the("Password text box").located(By.xpath("(//input[@autocomplete='off' and @type='password'])[1]"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Confirm password text box").located(By.xpath("(//input[@autocomplete='off' and @type='password'])[2]"));
    public static final Target BUTTON_SAVE = Target.the("Submit Button").located(By.cssSelector("button[type='submit']"));
    public static final Target ADVISE_SUCCEES = Target.the("Success advice").located(By.cssSelector("p[class='oxd-text oxd-text--p oxd-text--toast-title oxd-toast-content-text']"));


}

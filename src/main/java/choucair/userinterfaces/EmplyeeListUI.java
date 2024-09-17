package choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EmplyeeListUI {

    private EmplyeeListUI() {
    }

    public static final Target BUTTON_ADD_USER = Target.the("Add user button").located(By.xpath("//div/button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
    public static final Target BUTTON_EMPLOYEE_LIST = Target.the("Employee list button").located(By.xpath("//a[contains(text(),'Employee List')]"));
    public static final Target BUTTON_SUBMIT = Target.the("Employee list button").located(By.cssSelector("button[type='submit']"));
    public static final Target INPUT_EMPLOYEE_NAME = Target.the("Name employee input").located(By.xpath("(//input[@placeholder='Type for hints...'])[1]"));
    public static final Target INPUT_EMPLOYEE_NAME_VALIDATE = Target.the("Employee name text box").located(By.xpath("////div[contains(text(),'Choucair')]"));

}


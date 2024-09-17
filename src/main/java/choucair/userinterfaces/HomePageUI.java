package choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageUI {
    private HomePageUI() {
    }
    public static final Target PHOTO_USER = Target.the("User's photo").located(By.xpath("//span/img[@alt='profile picture']"));
    public static final Target BUTTON_PIM = Target.the("PIM button").located(By.xpath("//li[@class='oxd-main-menu-item-wrapper'][2]"));

}

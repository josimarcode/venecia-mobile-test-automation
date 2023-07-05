package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginView {

    public static Target email = Target.the("email")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"input-email\"]"));

    public static Target password = Target.the("password")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"input-password\"]"));

    public static Target loginButton = Target.the("login button")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup"));

    /*Target username = Target.the("username")
            .located(AppiumBy.accessibilityId("username"));*/
}

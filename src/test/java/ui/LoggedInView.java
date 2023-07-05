package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoggedInView {

    public static Target messagePopup = Target
            .the("message popup")
            .located(By.id("android:id/message"));
}

package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NavigationBarView {

    public static Target loginNavigation = Target
            .the("login navigation")
            .located(By.xpath("//android.widget.Button[@content-desc=\"Login\"]/android.widget.TextView"));
}

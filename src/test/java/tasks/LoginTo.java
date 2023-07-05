package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import ui.LoginView;

public class LoginTo implements Task {

    private final String email;
    private final String password;

    // Constructor con el parámetro
    public LoginTo(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Método factory para crear una instancia de la tarea con el parámetro
    public static Performable conParametro(String email, String password) {
        return Tasks.instrumented(LoginTo.class, email,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(email).into(LoginView.email),
                SendKeys.of(password).into(LoginView.password),
                Click.on(LoginView.loginButton)

        );
    }
}

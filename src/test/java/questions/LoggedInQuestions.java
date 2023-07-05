package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.LoggedInView;

public class LoggedInQuestions implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return LoggedInView.messagePopup.resolveFor(actor).getText();
    }

    public static Question<String> value(){
        return new LoggedInQuestions();
    }
}

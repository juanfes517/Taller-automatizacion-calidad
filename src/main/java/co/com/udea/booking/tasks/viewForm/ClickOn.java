package co.com.udea.booking.tasks.viewForm;

import co.com.udea.booking.interactions.viewForm.OpenForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickOn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(OpenForm.inButton());
    }

    public static ClickOn button(){
        return Tasks.instrumented(ClickOn.class);
    }
}

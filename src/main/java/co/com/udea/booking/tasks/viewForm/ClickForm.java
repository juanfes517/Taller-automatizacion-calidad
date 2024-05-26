package co.com.udea.booking.tasks.viewForm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickForm implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(co.com.udea.booking.interactions.viewForm.OpenForm.inButton());
    }

    public static ClickForm button(){
        return Tasks.instrumented(ClickForm.class);
    }
}

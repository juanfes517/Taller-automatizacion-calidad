package co.com.udea.booking.tasks.addPassenger;

import co.com.udea.booking.interactions.addPassenger.OpenNewPassenger;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickNewPassenger implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(OpenNewPassenger.inButton());
    }

    public static ClickNewPassenger newPassenger(){
        return Tasks.instrumented(ClickNewPassenger.class);
    }
}

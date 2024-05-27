package co.com.udea.booking.tasks.addPassenger;

import co.com.udea.booking.interactions.addPassenger.EnterDataForPassenger;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillDataForPassengers implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterDataForPassenger.inInputs());
    }

    public static FillDataForPassengers inputs(){
        return Tasks.instrumented(FillDataForPassengers.class);
    }
}

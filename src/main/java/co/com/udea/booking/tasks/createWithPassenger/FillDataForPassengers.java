package co.com.udea.booking.tasks.createWithPassenger;

import co.com.udea.booking.interactions.createWithPassenger.EnterDataForPassenger;
import co.com.udea.booking.interactions.noEmergencyContact.EnterBasicData;
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

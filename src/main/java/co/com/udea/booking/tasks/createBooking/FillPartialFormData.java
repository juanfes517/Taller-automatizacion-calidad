package co.com.udea.booking.tasks.createBooking;

import co.com.udea.booking.interactions.createBooking.EnterPartialData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillPartialFormData implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterPartialData.inInputs());
    }

    public static FillPartialFormData inputs(){
        return Tasks.instrumented(FillPartialFormData.class);
    }
}

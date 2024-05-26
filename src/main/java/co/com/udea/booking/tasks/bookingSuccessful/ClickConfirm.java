package co.com.udea.booking.tasks.bookingSuccessful;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickConfirm implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(co.com.udea.booking.interactions.bookingSuccessful.ConfirmForm.inButtonConfirm());
    }

    public static ClickConfirm buttonConfirm(){
        return Tasks.instrumented(ClickConfirm.class);
    }
}

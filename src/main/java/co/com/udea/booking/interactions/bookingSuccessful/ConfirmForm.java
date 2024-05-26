package co.com.udea.booking.interactions.bookingSuccessful;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.booking.userinterfaces.ConfirmPage.CONFIRM_BUTTON;

public class ConfirmForm implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CONFIRM_BUTTON));
    }

    public static ConfirmForm inButtonConfirm(){
        return Tasks.instrumented(ConfirmForm.class);
    }
}

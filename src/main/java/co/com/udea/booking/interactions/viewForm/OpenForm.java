package co.com.udea.booking.interactions.viewForm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.booking.userinterfaces.HomePage.BUTTON_BOOKING;

public class OpenForm implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_BOOKING));
    }

    public static OpenForm inButton(){
        return Tasks.instrumented(OpenForm.class);
    }
}

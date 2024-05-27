package co.com.udea.booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import co.com.udea.booking.interactions.ConfirmForm;

public class ClickConfirm implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConfirmForm.inButtonConfirm());
    }

    public static ClickConfirm buttonConfirm(){
        return Tasks.instrumented(ClickConfirm.class);
    }
}

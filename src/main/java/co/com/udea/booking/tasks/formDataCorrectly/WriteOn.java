package co.com.udea.booking.tasks.formDataCorrectly;

import co.com.udea.booking.interactions.formDataCorrectly.EnterAllData;
import co.com.udea.booking.tasks.viewForm.ClickOn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class WriteOn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterAllData.inAllInputs());
    }

    public static WriteOn inputs(){
        return Tasks.instrumented(WriteOn.class);
    }
}

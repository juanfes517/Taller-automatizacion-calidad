package co.com.udea.booking.tasks.formDataValid;

import co.com.udea.booking.interactions.formDataValid.EnterAllData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillAllFormData implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterAllData.inAllInputs());
    }

    public static FillAllFormData inputs(){
        return Tasks.instrumented(FillAllFormData.class);
    }
}

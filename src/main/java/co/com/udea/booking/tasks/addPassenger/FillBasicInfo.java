package co.com.udea.booking.tasks.addPassenger;

import co.com.udea.booking.interactions.addPassenger.EnterBasicData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillBasicInfo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterBasicData.inBasicInputs());
    }

    public static FillBasicInfo inputs(){
        return Tasks.instrumented(FillBasicInfo.class);
    }
}

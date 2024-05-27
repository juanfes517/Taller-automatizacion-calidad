package co.com.udea.booking.tasks.noEmergencyContact;

import co.com.udea.booking.interactions.noEmergencyContact.EnterBasicData;
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

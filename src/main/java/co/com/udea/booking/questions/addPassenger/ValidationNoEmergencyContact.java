package co.com.udea.booking.questions.addPassenger;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.booking.userinterfaces.BookingPage.MSJ_NO_CONTACT;

public class ValidationNoEmergencyContact implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(MSJ_NO_CONTACT).getText();
        return msg;
    }

    public static ValidationNoEmergencyContact noContact(){
        return new ValidationNoEmergencyContact();
    }
}

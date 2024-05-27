package co.com.udea.booking.questions.addPassenger;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.booking.userinterfaces.BookingPage.TITLE_NEW_PASSENGER;

public class ValidationViewNewPassenger implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(TITLE_NEW_PASSENGER).getText();
        return msg;
    }

    public static ValidationViewNewPassenger titleNewPassenger(){
        return new ValidationViewNewPassenger();
    }
}

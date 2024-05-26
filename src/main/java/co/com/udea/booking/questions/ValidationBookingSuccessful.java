package co.com.udea.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.booking.userinterfaces.ConfirmPage.MSJ_SUCCESSFUL;

public class ValidationBookingSuccessful implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(MSJ_SUCCESSFUL).getText();
        return msg;
    }

    public static ValidationBookingSuccessful message(){
        return new ValidationBookingSuccessful();
    }
}

package co.com.udea.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.booking.userinterfaces.BookingPage.MSJ_EMPTY_DATA;

public class ValidationFormDataError implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(MSJ_EMPTY_DATA).getText();
        return msg;
    }

    public static ValidationFormDataError errorMessage(){
        return new ValidationFormDataError();
    }
}

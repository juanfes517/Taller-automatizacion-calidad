package co.com.udea.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.booking.userinterfaces.BookingPage.FORM_TITLE;

public class ValidationViewForm implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(FORM_TITLE).getText();
        return msg;
    }

    public static ValidationViewForm titleForm(){
        return new ValidationViewForm();
    }
}

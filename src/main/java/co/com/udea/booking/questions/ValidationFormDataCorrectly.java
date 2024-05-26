package co.com.udea.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.booking.userinterfaces.ConfirmPage.CONFIRM_TITLE;

public class ValidationFormDataCorrectly implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(CONFIRM_TITLE).getText();
        return msg;
    }

    public static ValidationFormDataCorrectly titleConfirm(){
        return new ValidationFormDataCorrectly();
    }
}

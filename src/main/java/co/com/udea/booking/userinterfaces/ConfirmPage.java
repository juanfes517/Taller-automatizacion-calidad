package co.com.udea.booking.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ConfirmPage extends PageObject {
    public static final Target CONFIRM_TITLE = Target
            .the("Titulo de la ventana de confirmación")
            .locatedBy("//*[@id=\"confirm-title\"]");
}

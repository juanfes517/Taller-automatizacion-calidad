package co.com.udea.booking.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    public static final Target BUTTON_BOOKING = Target
            .the("Botón realizar reserva")
            .locatedBy("//*[@id=\"btn-rr\"]");
}
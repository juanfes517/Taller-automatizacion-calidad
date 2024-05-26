package co.com.udea.booking.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ConfirmPage extends PageObject {
    public static final Target CONFIRM_TITLE = Target
            .the("Titulo de la ventana de confirmación")
            .locatedBy("//*[@id=\"confirm-title\"]");

    public static final Target CONFIRM_BUTTON = Target
            .the("Botón de confirmación")
            .locatedBy("//*[@id=\"btn-cfr\"]");

    public static final Target MSJ_SUCCESSFUL = Target
            .the("Mensaje de exito")
            .locatedBy("//*[@id=\"success-dialog-message\"]");
}

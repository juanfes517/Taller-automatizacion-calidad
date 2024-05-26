package co.com.udea.certificacion.autenticacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BookingPage extends PageObject {

    public static final Target FORM_TITLE = Target
            .the("Titulo del formulario")
            .locatedBy("/html/body/div/div/div[1]/p");

    //Inputs passenger 1
    public static final Target INPUT_NAME_P1 = Target
            .the("Input para el nombre del pasajero")
            .locatedBy("//*[@id=\":r0:\"]");

    public static final Target INPUT_LAST_NAME_P1 = Target
            .the("Input para el apellido del pasajero")
            .locatedBy("//*[@id=\":r1:\"]");

    public static final Target INPUT_EMAIL_P1 = Target
            .the("Input para el correo del pasajero")
            .locatedBy("//*[@id=\":r2:\"]");

    public static final Target INPUT_PHONE_P1 = Target
            .the("Input para el telefono del pasajero")
            .locatedBy("//*[@id=\":r3:\"]");

    public static final Target INPUT_ADDRESS_P1 = Target
            .the("Input para la dirección del pasajero")
            .locatedBy("//*[@id=\":r4:\"]");

    public static final Target INPUT_EMERGENCY_NAME_P1 = Target
            .the("Input para el nombre del contacto de emergencia del pasajero")
            .locatedBy("//*[@id=\":r5:\"]");

    public static final Target INPUT_EMERGENCY_LAST_NAME_P1 = Target
            .the("Input para el apellido del contacto de emergencia del pasajero")
            .locatedBy("//*[@id=\":r6:\"]");

    public static final Target INPUT_EMERGENCY_PHONE_P1 = Target
            .the("Input para el numero del contacto de emergencia del pasajero")
            .locatedBy("//*[@id=\":r7:\"]");

}

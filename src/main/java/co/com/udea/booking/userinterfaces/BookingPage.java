package co.com.udea.booking.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BookingPage extends PageObject {

    public static final Target FORM_TITLE = Target
            .the("Titulo del formulario")
            .locatedBy("/html/body/div/div/div[1]/p");

    public static final Target BUTTON_SUBMIT = Target
            .the("Boton para enviar el formulario")
            .locatedBy("//*[@id=\"btn-con\"]");

    public static final Target MSJ_EMPTY_DATA = Target
            .the("Mensaje de error por datos vacios")
            .locatedBy("//*[@id=\"pinfo-dialog-message\"]");

    public static final Target MSJ_NO_CONTACT = Target
            .the("Mensaje de error por contacto de emergencia")
            .locatedBy("//*[@id=\"cinfo-dialog-message\"]");

    public static final Target BUTTON_NEW_PASSENGER = Target
            .the("Boton para agregar un nuevo pasajero")
            .locatedBy("/html/body/div/div/button");

    public static final Target TITLE_NEW_PASSENGER = Target
            .the("Titulo de un nuevo pasajero")
            .locatedBy("/html/body/div/div/div[2]/div/div[2]/div[1]/div/span");


    //Inputs pasajero 1
    public static final Target INPUT_NAME_P1 = Target
            .the("Input para el nombre del pasajero 1")
            .locatedBy("/html/body/div/div/div[2]/div/div[1]/div/div[1]/div[1]/div/input");

    public static final Target INPUT_LAST_NAME_P1 = Target
            .the("Input para el apellido del pasajero 1")
            .locatedBy("/html/body/div/div/div[2]/div/div[1]/div/div[1]/div[2]/div/input");

    public static final Target INPUT_EMAIL_P1 = Target
            .the("Input para el correo del pasajero 1")
            .locatedBy("/html/body/div/div/div[2]/div/div[1]/div/div[1]/div[3]/div/input");

    public static final Target INPUT_PHONE_P1 = Target
            .the("Input para el telefono del pasajero 1")
            .locatedBy("/html/body/div/div/div[2]/div/div[1]/div/div[1]/div[4]/div/input");

    public static final Target INPUT_ADDRESS_P1 = Target
            .the("Input para la dirección del pasajero 1")
            .locatedBy("/html/body/div/div/div[2]/div/div[1]/div/div[1]/div[5]/div/input");

    public static final Target INPUT_EMERGENCY_NAME_P1 = Target
            .the("Input para el nombre del contacto de emergencia del pasajero 1")
            .locatedBy("/html/body/div/div/div[2]/div/div[1]/div/div[2]/div[3]/div/input");

    public static final Target INPUT_EMERGENCY_LAST_NAME_P1 = Target
            .the("Input para el apellido del contacto de emergencia del pasajero 1")
            .locatedBy("/html/body/div/div/div[2]/div/div[1]/div/div[2]/div[4]/div/input");

    public static final Target INPUT_EMERGENCY_PHONE_P1 = Target
            .the("Input para el numero del contacto de emergencia del pasajero 1")
            .locatedBy("/html/body/div/div/div[2]/div/div[1]/div/div[2]/div[5]/div/input");


    //Inputs pasajero 2
    public static final Target INPUT_NAME_P2 = Target
            .the("Input para el nombre del pasajero 2")
            .locatedBy("/html/body/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/input");

    public static final Target INPUT_LAST_NAME_P2 = Target
            .the("Input para el apellido del pasajero 2")
            .locatedBy("/html/body/div/div/div[2]/div/div[2]/div[2]/div[1]/div[2]/div/input");

    public static final Target INPUT_EMAIL_P2 = Target
            .the("Input para el correo del pasajero 2")
            .locatedBy("/html/body/div/div/div[2]/div/div[2]/div[2]/div[1]/div[3]/div/input");

    public static final Target INPUT_PHONE_P2 = Target
            .the("Input para el telefono del pasajero 2")
            .locatedBy("/html/body/div/div/div[2]/div/div[2]/div[2]/div[1]/div[4]/div/input");

    public static final Target INPUT_ADDRESS_P2 = Target
            .the("Input para la dirección del pasajero 2")
            .locatedBy("/html/body/div/div/div[2]/div/div[2]/div[2]/div[1]/div[5]/div/input");

    public static final Target INPUT_EMERGENCY_NAME_P2 = Target
            .the("Input para el nombre del contacto de emergencia del pasajero 2")
            .locatedBy("/html/body/div/div/div[2]/div/div[2]/div[2]/div[2]/div[3]/div/input");

    public static final Target INPUT_EMERGENCY_LAST_NAME_P2 = Target
            .the("Input para el apellido del contacto de emergencia del pasajero 2")
            .locatedBy("/html/body/div/div/div[2]/div/div[2]/div[2]/div[2]/div[4]/div/input");

    public static final Target INPUT_EMERGENCY_PHONE_P2 = Target
            .the("Input para el numero del contacto de emergencia del pasajero 2")
            .locatedBy("/html/body/div/div/div[2]/div/div[2]/div[2]/div[2]/div[5]/div/input");

}

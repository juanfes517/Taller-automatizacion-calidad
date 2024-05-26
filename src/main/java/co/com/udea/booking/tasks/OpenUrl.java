package co.com.udea.booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUrl implements Task {

    private final String URL;

    public OpenUrl(String url) {
        this.URL = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(Open.url(URL));
    }

    public static OpenUrl url(String url){
         return new OpenUrl(url);
    }
}
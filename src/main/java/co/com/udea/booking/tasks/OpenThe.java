package co.com.udea.booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThe implements Task {

    private final String URL;

    public OpenThe(String url) {
        this.URL = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(Open.url(URL));
    }

    public static OpenThe url(String url){
         return new OpenThe(url);
    }
}
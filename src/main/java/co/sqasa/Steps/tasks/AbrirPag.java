package co.sqasa.Steps.tasks;

import co.sqasa.Steps.userinterfaces.PaginaWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPag implements Task {

    private PaginaWeb paginaWeb;

    public static AbrirPag deCompras() {
        return Tasks.instrumented(AbrirPag.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(paginaWeb)
        );
    }
}

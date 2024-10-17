package co.sqasa.Steps.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.sqasa.Steps.util.ConstruirXpath.construirXpathH2;

public class SeleccionaEl implements Task {

    private String producto;

    public SeleccionaEl(String producto) {
        this.producto = producto;
    }

    public static SeleccionaEl productoUno(String producto) {
        return Tasks.instrumented(SeleccionaEl.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(construirXpathH2(producto))
        );
    }
}

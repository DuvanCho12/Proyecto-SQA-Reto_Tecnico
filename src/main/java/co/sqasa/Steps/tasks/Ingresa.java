package co.sqasa.Steps.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.sqasa.Steps.userinterfaces.paginaProductos.INPUT_CANTIDAD;

public class Ingresa implements Task {

    private int cantidad;

    public Ingresa(int cantidad) {
        this.cantidad = cantidad;
    }

    public static Ingresa cantidad(int cantidad) {
        return Tasks.instrumented(Ingresa.class, cantidad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(String.valueOf(cantidad)).into(INPUT_CANTIDAD)
        );
    }
}

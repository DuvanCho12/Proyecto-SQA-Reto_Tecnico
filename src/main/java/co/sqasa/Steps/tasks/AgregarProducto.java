package co.sqasa.Steps.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.sqasa.Steps.userinterfaces.ContenedorObjPaginaAliExpress.BOTON_AGREGAR_CARRITO;

public class AgregarProducto implements Task {

    public static AgregarProducto alCarrito() {
        return Tasks.instrumented(AgregarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_AGREGAR_CARRITO)
        );
    }
}

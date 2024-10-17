package co.sqasa.Steps.tasks;

import co.sqasa.Steps.models.TablaProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.sqasa.Steps.userinterfaces.ContenedorObjPaginaAliExpress.*;

public class BuscarEl implements Task {

    private TablaProducto producto;

    public BuscarEl(TablaProducto producto) {
        this.producto = producto;
    }

    public static BuscarEl producto(TablaProducto producto) {
        return Tasks.instrumented(BuscarEl.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_NO_PERMITIR),
                Enter.theValue(producto.getProducto()).into(CAMPO_BUSQUEDA),
                Click.on(BOTON_BUSQUEDA)
        );
    }
}

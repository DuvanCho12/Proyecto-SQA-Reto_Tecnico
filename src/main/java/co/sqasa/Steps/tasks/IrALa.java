package co.sqasa.Steps.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.sqasa.Steps.userinterfaces.ContenedorObjPaginaAliExpress.BOTON_IR_CESTA;

public class IrALa implements Task {


    public static IrALa Cesta() {
        return Tasks.instrumented(IrALa.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_IR_CESTA)
        );
    }
}

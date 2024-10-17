package co.sqasa.Steps.questions;

import co.sqasa.Steps.models.TablaProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.sqasa.Steps.userinterfaces.ContenedorObjPaginaAliExpress.PRECIO_DEL_PRODUCTO;

public class ValidarEl implements Question {

    private TablaProducto precio;

    public ValidarEl(TablaProducto precio) {
        this.precio = precio;
    }

    public static ValidarEl precio(TablaProducto producto) {
        return new ValidarEl(producto);
    }

    @Override
    public Object answeredBy(Actor actor) {
        boolean validarPrecio = precio.getPrecio().equals(PRECIO_DEL_PRODUCTO.resolveFor(actor).getText());
        return validarPrecio;
    }

}

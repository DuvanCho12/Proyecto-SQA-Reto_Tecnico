package co.sqasa.Steps.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.sqasa.Steps.userinterfaces.paginaProductos.CANTIDAD_CARRITO;
import static co.sqasa.Steps.userinterfaces.paginaProductos.PRODUCTO_CARRITO;

public class ValidarElementos implements Question {

    private int cantidad;
    private String producto;

    public ValidarElementos(int cantidad, String producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public static ValidarElementos carritoDeCompras(int cantidad, String producto) {
        return new ValidarElementos(cantidad, producto);
    }

    @Override
    public Object answeredBy(Actor actor) {
        boolean cantidadEnCarrito = String.valueOf(cantidad).equals(CANTIDAD_CARRITO.resolveFor(actor).getAttribute("value"));
        boolean productoEnCarrito = String.valueOf(producto).equals(PRODUCTO_CARRITO.resolveFor(actor).getText());

        return cantidadEnCarrito && productoEnCarrito;
    }
}

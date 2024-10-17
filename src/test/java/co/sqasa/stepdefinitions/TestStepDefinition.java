package co.sqasa.stepdefinitions;

import co.sqasa.Steps.questions.ValidarElementos;
import co.sqasa.Steps.tasks.AbrirPag;
import co.sqasa.Steps.tasks.Ingresa;
import co.sqasa.Steps.tasks.SeleccionaEl;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.sqasa.Steps.userinterfaces.paginaProductos.BOTON_ANNADIR_AL_CARRO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class TestStepDefinition {

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que se ingresa a la página San Angel")
    public void queSeIngresaALaPáginaSanAngel() {
        OnStage.theActorCalled("Usuario").wasAbleTo(AbrirPag.deCompras());
    }

    @Cuando("^selecciona el producto (.*)$")
    public void seleccionaElProducto(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionaEl.productoUno(producto));
    }

    @Y("ingresa {int} cantidades")
    public void ingresaCantidades(int cantidad) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresa.cantidad(cantidad));
    }

    @Y("agrega el producto al carrito de compras")
    public void agregaElProductoAlCarritoDeCompras() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(BOTON_ANNADIR_AL_CARRO));
    }

    @Entonces("^el carrito de compras debería contener (.*) unidades del producto (.*)$")
    public void elCarritoDeComprasDeberíaContenerUnidadesDelProducto(int cantidad, String producto) {
        Question<Boolean> validarElementos = ValidarElementos.carritoDeCompras(cantidad, producto);
        OnStage.theActorInTheSpotlight().should(seeThat(validarElementos));
    }
}

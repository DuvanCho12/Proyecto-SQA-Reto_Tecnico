package co.sqasa.stepdefinitions;

import co.sqasa.Steps.models.TablaProducto;
import co.sqasa.Steps.questions.ValidarEl;
import co.sqasa.Steps.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class TestStepDefinition {

    @DataTableType
    public TablaProducto tablaProducto(Map<String, String> entry) {
        return new TablaProducto(
                entry.get("producto"),
                entry.get("precio")
        );
    }

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que se ingresa a la página de AliExpress")
    public void queSeIngresaALaPáginadeDeAliExpress() {
        OnStage.theActorCalled("Usuario").wasAbleTo(AbrirPag.deCompras());
    }

    @Cuando("el usuario busque el producto")
    public void elUsuarioBusqueElProducto(List<TablaProducto> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarEl.producto(datos.get(0)));

    }

    @Y("seleccione el producto")
    public void seleccioneElProducto(List<TablaProducto> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccioneEl.producto(datos.get(0)));
    }

    @Y("se agregue el producto al carrito")
    public void seAgregueElProductoAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProducto.alCarrito());
    }

    @Cuando("el usuario se dirija a la cesta")
    public void elUsuarioSeDirijaALaCesta() {
        OnStage.theActorInTheSpotlight().attemptsTo(IrALa.Cesta());
    }

    @Entonces("se valida el precio del producto")
    public void seValidaElPrecioDelProducto(List<TablaProducto> datos) {
        Question<Boolean> validarPrecio = ValidarEl.precio(datos.get(0));
        OnStage.theActorInTheSpotlight().should(seeThat(validarPrecio));

    }
}

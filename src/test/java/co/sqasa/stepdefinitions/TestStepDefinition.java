package co.sqasa.stepdefinitions;

import co.sqasa.Steps.tasks.AbrirPag;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class TestStepDefinition {

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que se ingresa a la página")
    public void queSeIngresaALaPágina() {
        OnStage.theActorCalled("Usuario").wasAbleTo(AbrirPag.deCompras());
    }

}

package co.sqasa.Steps.tasks;

import co.sqasa.Steps.models.TablaProducto;
import co.sqasa.Steps.util.ConstruirXpath;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;

import java.util.Set;

import static net.serenitybdd.core.Serenity.getDriver;

public class SeleccioneEl implements Task {

    private TablaProducto producto;

    public SeleccioneEl(TablaProducto producto) {
        this.producto = producto;
    }

    public static SeleccioneEl producto(TablaProducto producto) {
        return Tasks.instrumented(SeleccioneEl.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ConstruirXpath.construirXpathH3(producto.getProducto()))
        );
        switchToNewTab();
    }

    public void switchToNewTab() {
        WebDriver driver = getDriver();
        String currentTab = driver.getWindowHandle();
        Set<String> allTabs = driver.getWindowHandles();

        for (String tab : allTabs) {
            if (!tab.equals(currentTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }

    }
}

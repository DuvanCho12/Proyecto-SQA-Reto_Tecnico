package co.sqasa.Steps.util;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConstruirXpath extends PageObject {

    public static Target construirXpathH3(String valor) {
        String dato = "//h3[contains(text(),'";
        String dato2 = "')]";
        String datoFinal = dato + valor + dato2;
        return Target.the(valor).located(By.xpath(datoFinal));
    }
}

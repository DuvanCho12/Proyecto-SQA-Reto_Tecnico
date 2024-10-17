package co.sqasa.Steps.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContenedorObjPaginaAliExpress {

    public static final Target BOTON_NO_PERMITIR = Target.the("Botón no permitir suscribirse a las notificaciones").located(By.xpath("//div[contains(text(), 'No permitir')]"));
    public static final Target CAMPO_BUSQUEDA = Target.the("Campo para ingresar el nombre del producto").located(By.xpath("//input[@id='search-words']"));
    public static final Target BOTON_BUSQUEDA = Target.the("Botón para buscar el producto").located(By.xpath("//input[@class='search--submit--2VTbd-T']"));
    public static final Target BOTON_AGREGAR_CARRITO = Target.the("Botón para agregar producto al carrito").located(By.xpath("//span[contains(text(), 'Agregar al carrito')]"));
    public static final Target BOTON_IR_CESTA = Target.the("Botón para ir a la cesta").located(By.xpath("//a[@class='cart-summary-tocart']"));
    public static final Target PRECIO_DEL_PRODUCTO = Target.the("Precio del producto").located(By.xpath("//span[contains(text(), 'COP22,240.13')]"));
}

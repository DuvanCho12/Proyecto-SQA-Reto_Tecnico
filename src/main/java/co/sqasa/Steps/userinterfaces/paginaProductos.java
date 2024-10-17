package co.sqasa.Steps.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class paginaProductos {

    public static final Target INPUT_CANTIDAD = Target.the("Input para ingresar cantidad").located(By.xpath("//input[@name='quantity']"));
    public static final Target BOTON_ANNADIR_AL_CARRO= Target.the("Input para ingresar cantidad").located(By.xpath("//button[contains(text(), 'Añadir al carrito')]"));
    public static final Target CANTIDAD_CARRITO= Target.the("Input para visualizar la cantidad en el carrito").located(By.xpath("//input[@title='Qty']"));
    public static final Target PRODUCTO_CARRITO = Target.the("Producto en el carrito").located(By.xpath("//div[@class='ts-product-name']"));
}

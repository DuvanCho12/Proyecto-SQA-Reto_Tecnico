# language: es

@AGREGARPRODUCTOS
Característica: Agregar producto al carrito de compras
  COMO usuario final
  QUIERO agregar producto al carrito de compras
  PARA validar el precio

  Antecedentes:
    Dado que se ingresa a la página de AliExpress

  @CP01
  Esquema del escenario: Agregar un producto al carrito de compras
    Cuando el usuario busque el producto
      | producto   |
      | <producto> |
    Y seleccione el producto
      | producto   |
      | <producto> |
    Y se agregue el producto al carrito
    Cuando el usuario se dirija a la cesta
    Entonces se valida el precio del producto
    | precio   |
    | <precio> |

    Ejemplos:
      | producto                                    | precio       |
      | Zapatillas de correr informales para hombre | COP22,240.13 |



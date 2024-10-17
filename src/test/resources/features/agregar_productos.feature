# language: es

@AGREGARPRODUCTOS
Característica: Agregar productos al carrito de compras
  COMO usuario final
  QUIERO agregar productos al carrito de compras
  PARA que se guarden correctamente

  Antecedentes:
    Dado que se ingresa a la página San Angel

  @CP01
  Escenario: Agregar producto uno con cantidad 2 al carrito
    Cuando selecciona el producto Évora – 24 rosas
    Y selecciona el color Amarillo
    Y ingresa 2 cantidades
    Y agrega el producto al carrito de compras
    Entonces el carrito de compras debería contener 2 unidades del producto Évora - 24 rosas - Amarillo

  @CP02
  Escenario: Agregar producto dos con cantidad 5 al carrito
    Cuando selecciona el producto Destellos
    Y selecciona el color Rosado
    Y ingresa 5 cantidades
    Y agrega el producto al carrito de compras
    Entonces el carrito de compras debería contener 5 unidades del producto Destellos - Rosado

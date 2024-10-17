# language: es

@AGREGARPRODUCTO
Característica: Agregar productos al carrito de compras
  COMO usuario final
  QUIERO agregar productos al carrito de compras
  PARA que se guarden correctamente

  Antecedentes:
    Dado que se ingresa a la página San Angel

  @CP01
  Escenario: Escenario: Agregar producto uno al carrito
    Cuando selecciona el producto Évora – 24 rosas
    Y ingresa 2 cantidades
    Y agrega el producto al carrito de compras
    Entonces el carrito de compras debería contener 2 unidades del producto Évora - 24 rosas - Rojo


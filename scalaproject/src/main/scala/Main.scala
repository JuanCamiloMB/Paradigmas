import scala.io.StdIn

@main def hello: Unit = {

  var carrito: List[String] = List()
  var totalCompra: Double = 0.0

  println("***-------Welcome To Juanguicommerce-------***")

  val Products = ListProductsFunc.ListProducts()
  var i = 0
  for (product <- Products) {
    println(i + ". " + product.getName() + " $" + product.getPrice() + " " + product.getQuantity() + "\n")
    i = i + 1
  }

  var userInput: Option[String] = None

  // Preguntar hasta que el usuario decida salir
  while (userInput.forall(_.toLowerCase != "s")) {
    userInput = Some(scala.io.StdIn.readLine("Cual desea agregar al carrito? (Presione 's' para finalizar la compra): "))

    if (userInput.exists(_.toLowerCase == "s")) {
      // Si el usuario ingresa 's', mostrar el total de la compra y finalizar
      println(s"Total de la compra: $$$totalCompra")
      println("¡Gracias por su compra! Simulación de pago exitoso.")
      return // Salir del programa
    } else if (userInput.exists(_.isEmpty)) {
      // Si el usuario presiona Enter sin ingresar nada, preguntar si desea salir
      println("¿Está seguro que desea salir? (s/n): ")
      userInput = Some(scala.io.StdIn.readLine())
      if (userInput.exists(_.toLowerCase == "s")) {
        println("¡Hasta luego!")
        return // Salir del programa
      }
    } else if (userInput.exists(!_.forall(_.isDigit))) {
      println("Entrada no válida. Por favor, ingrese un número o 's' para finalizar la compra.")
      userInput = None // Reiniciar para que el usuario ingrese nuevamente una opción
    } else {
      val inputNumber = userInput.get.toInt
      if (inputNumber >= 0 && inputNumber < Products.length) {
        val selectedProduct = Products(inputNumber)
        if (selectedProduct.getQuantity() >= 1) {
          println(s"Ingrese la cantidad de ${selectedProduct.getName()} que desea llevar (quedan ${selectedProduct.getQuantity()} en inventario): ")
          try {
            val quantityToBuy = scala.io.StdIn.readInt()
            if (quantityToBuy > 0 && quantityToBuy <= selectedProduct.getQuantity()) {
              val subtotal = selectedProduct.getPrice() * quantityToBuy
              totalCompra += subtotal
              selectedProduct.setQuantity(selectedProduct.getQuantity() - quantityToBuy)
              carrito = carrito :+ s"${selectedProduct.getName()} x$quantityToBuy"
              println(s"Producto(s) agregado(s) al carrito. Subtotal: $$$subtotal")
              println(s"Total de la compra hasta ahora: $$$totalCompra")
              println("Carrito: ")
              for (product <- carrito) println(product)
            } else {
              println("Cantidad no válida. Intente de nuevo.")
            }
          } catch {
            case _: NumberFormatException =>
              println("Entrada no válida. Por favor, ingrese un número válido.")
          }
        } else {
          println("Producto agotado. Seleccione otro producto.")
          userInput = None // Reiniciar para que el usuario ingrese nuevamente una opción
        }
      } else {
        println("Opción no válida. Intente de nuevo o 's' para finalizar la compra.")
        userInput = None // Reiniciar para que el usuario ingrese nuevamente una opción
      }
    }
  }
}


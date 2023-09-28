import scala.io.StdIn.readInt

@main def hello: Unit ={

  var carrito: List[String] = List()

  println("***-------Welcome To Juanguicommerce-------***")
  
  val Products = ListProductsFunc.ListProducts()
  var i = 0
  for (product <- Products){
    println( i + ". " + product.getName() + " $"+ product.getPrice() + " " + product.getQuantity()+"\n")
    i = i+1
  }

  println("Cual desea agregar al carrito?")
  var agregado: Int = readInt()
  if ((Products(agregado).getQuantity() >= 1) && (0 < agregado) && (agregado <= Products.length)){
    Products(agregado).setQuantity(Products(agregado).getQuantity()-1)
    carrito = carrito:+Products(agregado).getName()
    println("Carrito: ")
    for (product <- carrito) println(product)
  }

}
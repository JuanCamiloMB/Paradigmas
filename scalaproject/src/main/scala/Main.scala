@main def hello: Unit ={
  println("***-------Welcome To Juanguicommerce-------***")
  
  val Products = ListProductsFunc.ListProducts()
  for (product <- Products){
    println(product.getName() + " $"+ product.getPrice() + " " + product.getQuantity()+"\n")
  }
}
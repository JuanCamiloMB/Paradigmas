class Product(var p_name:String, var p_price:Double, var p_quantity:Int)
{
    def getName(): String =
    {
        p_name
    }
    
    def setName(newName:String): Unit =
    {
        p_name = newName
    }

    def getPrice(): Double =
    {
        p_price
    }

    def setPrice(newPrice:Double): Unit =
    {
        p_price = newPrice
    }

    def getQuantity(): Int =
    {
        p_quantity
    }

    def setQuantity(newQuantity:Int): Unit =
    {
        p_quantity = newQuantity
    }
}

import scala.util.Random
object ListProductsFunc{
    def ListProducts(): List[Product] =
    {
        var maxRandPrice = 500
        var maxRandQuantity = 100
        val products_names: List[String] = List(
            "Laptop",
            "Smartphone",
            "Coffee Maker",
            "Running Shoes",
            "Digital Camera",
            "Backpack",
            "Desk Chair",
            "Blender",
            "Smart Watch",
            "Guitar",
            "Books",
            "Fitness Tracker",
            "Headphones",
            "Yoga Mat",
            "Gaming Console",
            "Sunglasses",
            "Cookware Set",
            "Treadmill",
            "Jewelry Box",
            "Vacuum Cleaner"
        )
        val random = new Random()
        var Products: List[Product] = List()
        for (product <- products_names){
            val randomQuantity = random.nextInt(maxRandQuantity)
            val randomPrice = random.nextDouble()
            var newProduct = new Product(product, randomPrice*1000, randomQuantity)
            Products = Products:+newProduct
        }
        Products
    }
}
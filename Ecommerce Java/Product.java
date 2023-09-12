public class Product {
    String name;
    int price;
    int quantity;
    ProductDetails details;

    Product(String p_name, int p_price, int p_quantity, ProductDetails details){
        name = p_name;
        price = p_price;
        quantity = p_quantity;
        this.details = details;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public String getProductDetail(){
        return this.details.getDescription();
    }
}

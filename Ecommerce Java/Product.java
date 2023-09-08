public class Product {
    String name;
    int price;
    int quantity;
    Product(String p_name, int p_price, int p_quantity){
        name = p_name;
        price = p_price;
        quantity = p_quantity;
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
}

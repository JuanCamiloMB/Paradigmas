import java.util.Random;
public class ListProducts {
    public static void ProductList(){
        Random rand = new Random();
        int maxRandPrice = 500;
        int maxRandQuantity = 100;

        String[] products_names = new String[]{"Laptop",
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
                "Vacuum Cleaner"};

        Product[] products = new Product[20];
        for (int i = 0; i < products_names.length; i++){
            int rand_price = rand.nextInt(maxRandPrice);
            int rand_quantity = rand.nextInt(maxRandQuantity);
            Product product = new Product(products_names[i], rand_price, rand_quantity);
            products[i] = product;
        }

        for (int i = 0; i < products_names.length; i++) {
            String out = String.format("%s %s (%2d) $%2d", i, products[i].getName(), products[i].getQuantity(), products[i].getPrice());
            System.out.println(out);
        }
    }
}

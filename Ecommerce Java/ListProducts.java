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

        String[] product_descriptions = new String[]{
                "Powerful laptop for work and play.",
                "The latest smartphone with advanced features.",
                "Brew delicious coffee with this coffee maker.",
                "Comfortable and durable running shoes.",
                "Capture memories with a high-quality digital camera.",
                "Spacious and stylish backpack for your adventures.",
                "Ergonomic desk chair for long hours of comfort.",
                "Blend your favorite smoothies with this blender.",
                "Stay connected with a feature-packed smartwatch.",
                "Strum your way to musical excellence with this guitar.",
                "A collection of bestselling books for all readers.",
                "Track your fitness goals with this fitness tracker.",
                "High-quality headphones for immersive audio.",
                "Get fit with a comfortable yoga mat.",
                "Enjoy gaming with the latest gaming console.",
                "Stylish sunglasses for sun protection.",
                "Complete cookware set for your kitchen needs.",
                "Stay fit with a high-performance treadmill.",
                "Elegant jewelry box to store your precious items.",
                "Keep your home clean with a vacuum cleaner."};

        Product[] products = new Product[products_names.length];
        for (int i = 0; i < products_names.length; i++) {
            int rand_price = rand.nextInt(maxRandPrice);
            int rand_quantity = rand.nextInt(maxRandQuantity);
            ProductDetails details = new ProductDetails(product_descriptions[i]);
            Product product = new Product(products_names[i], rand_price, rand_quantity, details);
            products[i] = product;
        }

        for (int i = 0; i < products_names.length; i++) {
            String out = String.format("%s %s (%2d) $%2d", i, products[i].getName(), products[i].getQuantity(), products[i].getPrice());
            System.out.println(out);
        }
    }
}

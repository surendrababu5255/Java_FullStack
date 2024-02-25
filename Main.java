package surendrababu;

class Product {
    private int productId;
    private String productName;
    private int quantityInStock;
    private double pricePerUnit;

    public Product(int productId, String productName, int quantityInStock, double pricePerUnit) {
        this.productId = productId;
        this.productName = productName;
        this.quantityInStock = quantityInStock;
        this.pricePerUnit = pricePerUnit;
    }

    // Getter and Setter methods

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    // toString method for displaying product details

    @Override
    public String toString() {
        return "Product ID: " + productId +
               ", Name: " + productName +
               ", Quantity: " + quantityInStock +
               ", Price per Unit: $" + pricePerUnit;
    }
}

class Inventory {
    private Product[] products;
    private int size;

    public Inventory(int capacity) {
        products = new Product[capacity];
        size = 0;
    }

    // Method to add a new product to the inventory

    public void addProduct(Product product) {
        if (size < products.length) {
            products[size++] = product;
        } else {
            System.out.println("Inventory is full. Cannot add more products.");
        }
    }

    // Method to remove a product from the inventory

    public void removeProduct(int productId) {
        for (int i = 0; i < size; i++) {
            if (products[i].getProductId() == productId) {
                // Shift remaining elements to fill the gap
                for (int j = i; j < size - 1; j++) {
                    products[j] = products[j + 1];
                }
                size--;
                System.out.println("Product removed from the inventory.");
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found in the inventory.");
    }

    // Method to update the quantity of a product in stock

    public void updateQuantity(int productId, int newQuantity) {
        for (int i = 0; i < size; i++) {
            if (products[i].getProductId() == productId) {
                products[i].setQuantityInStock(newQuantity);
                System.out.println("Quantity updated for product with ID " + productId);
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found in the inventory.");
    }

    // Method to display the current inventory

    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Inventory class
        Inventory inventory = new Inventory(10);

        // Adding products to the inventory
        inventory.addProduct(new Product(1, "Camera", 5, 4000.99));
        inventory.addProduct(new Product(2, "Smartphone", 10, 699.99));
        inventory.addProduct(new Product(3, "Watch", 3, 219.99));

        // Displaying the initial inventory
        inventory.displayInventory();

        // Updating the quantity of a few products
        inventory.updateQuantity(1, 3);
        inventory.updateQuantity(2, 8);

        // Displaying the updated inventory
        inventory.displayInventory();

        // Removing a product from the inventory
        inventory.removeProduct(2);

        // Displaying the final inventory
        inventory.displayInventory();
    }
}

// Product class with parameterized constructor
class Product {
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

// XYZ class with main function and required methods
public class XYZ {
    public static void main(String[] args) {
        Product[] products = new Product[5];

        // Accept five product information from user and store in an array
        for (int i = 0; i < 5; i++) {
            int pid = Integer.parseInt(System.console().readLine("Enter Product ID: "));
            double price = Double.parseDouble(System.console().readLine("Enter Product Price: "));
            int quantity = Integer.parseInt(System.console().readLine("Enter Product Quantity: "));

            products[i] = new Product(pid, price, quantity);
        }

        // Find Pid of the product with the highest price
        int highestPid = findHighestPriceProduct(products);
        System.out.println("Product ID with highest price: " + highestPid);

        // Calculate and print total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);
    }

    // Method to find Pid of the product with the highest price
    public static int findHighestPriceProduct(Product[] products) {
        int highestPid = products[0].getPid();
        double highestPrice = products[0].getPrice();

        for (Product product : products) {
            if (product.getPrice() > highestPrice) {
                highestPid = product.getPid();
                highestPrice = product.getPrice();
            }
        }

        return highestPid;
    }

    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;

        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }

        return totalAmount;
    }
}


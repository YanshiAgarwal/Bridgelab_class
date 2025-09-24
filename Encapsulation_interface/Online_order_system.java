package Encapsulation_interface;

class Customer{
	private int customerId;
	private String name; 
	private String email;
	
	public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    public int getCustomerId() { 
    	return customerId; 
    	}
    public String getName() { 
    	return name; 
    	}
    public String getEmail() { 
    	return email; 
    	}

    // Default discount = 0%
    public double getDiscountRate() {
        return 0.0;
    }
}

//extends
class RegularCustomer extends Customer {
    public RegularCustomer(int customerId, String name, String email) {
        super(customerId, name, email);
    }

    @Override
    public double getDiscountRate() {
        return 0.05; // 5% discount
    }
}

//extends
class PremiumCustomer extends Customer {
    public PremiumCustomer(int customerId, String name, String email) {
        super(customerId, name, email);
    }

    @Override
    public double getDiscountRate() {
        return 0.15; // 15% discount
    }
}

class Product {
    private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public double getPrice() { return price; }
}

//composition
class Order {
    private Customer customer;
    private Product product;
    private int quantity;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        double basePrice = product.getPrice() * quantity;
        double discount = customer.getDiscountRate();
        return basePrice - (basePrice * discount);
    }

    public void displayOrderDetails() {
        System.out.println("Customer: " + customer.getName() + " (" + customer.getEmail() + ")");
        System.out.println("Product: " + product.getProductName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price after discount: " + calculateTotalPrice());
        System.out.println("--------------------------------------------------");
    }
}


public class Online_order_system { 
    public static void main(String[] args) {
        // Customers
        Customer regCust = new RegularCustomer(1, "Alice", "alice@example.com");
        Customer premCust = new PremiumCustomer(2, "Bob", "bob@example.com");

        // Products
        Product laptop = new Product(101, "Laptop", 1000);
        Product phone = new Product(102, "Smartphone", 500);

        // Orders
        Order order1 = new Order(regCust, laptop, 2);
        Order order2 = new Order(premCust, phone, 3);

        // Display details
        order1.displayOrderDetails();
        order2.displayOrderDetails();
    }
}


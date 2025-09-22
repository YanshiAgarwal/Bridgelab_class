package Encapsulation_interface;

public class E_commerce_platform {
	
	abstract static class Product {
        private String productId;
        private String name;
        private double price;

        public Product(String productId, String name, double price) {
            this.productId = productId;
            this.name = name;
            this.price = price;
        }

        public String getProductId() {
        	return productId;
        }
        public String getName() { 
        	return name;
        }
        public double getPrice() { 
        	return price; 
        }
        public void setPrice(double price) {
        	this.price = price;
        }
        
        public abstract double calculateDiscount();

        public void displayDetails() {
            System.out.println("Product ID: " + productId);
            System.out.println("Name: " + name);
            System.out.println("Price: " + price);
        }
    }

    static class Electronics extends Product {
        public Electronics(String productId, String name, double price) {
            super(productId, name, price);
        }

        @Override
        public double calculateDiscount() {
            return getPrice() * 0.10; // 10% discount
        }
    }

    public static void main(String[] args) {
        Product laptop = new Electronics("E101", "Laptop", 60000);
        laptop.displayDetails();
        System.out.println("Discount: " + laptop.calculateDiscount());
    }

}

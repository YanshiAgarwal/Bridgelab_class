package This_static_final_instanceof;

class Product {
    static double discount = 5.0;   

    String productName;
    double price;
    int quantity;
    final int productID;            

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    void showDetails() {
        if (this instanceof Product) {   
            double total = price * quantity;
            double discountedPrice = total - (total * discount / 100);
            System.out.println("ID: " + productID + " , Product: " + productName + " , Price: " + price + 
            		" , Qty: " + quantity + " , Total after discount: " + discountedPrice);
        }
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 1, 301);
        Product p2 = new Product("Headphones", 2000, 2, 302);
        Product p3 = new Product("Keyboard", 1500, 1, 303);

        p1.showDetails();
        p2.showDetails();
        p3.showDetails();

        Product.updateDiscount(10);

        p1.showDetails();
        p2.showDetails();
        p3.showDetails();
    }
}

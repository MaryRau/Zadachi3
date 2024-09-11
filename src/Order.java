import java.util.ArrayList;
import java.util.List;

// задача 18
class Order {
    private List<Product_2> products;
    private float totalCost;

    public Order() {
        this.products = new ArrayList<>();
        this.totalCost = 0.0F;
    }

    public void addProduct(Product_2 product) {
        products.add(product);
        totalCost += product.getPrice();
    }

    public List<Product_2> getProducts() {
        return products;
    }

    public double getTotalCost() {
        return totalCost;
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}

class Product_2 {
    private String name;
    private float price;

    public Product_2(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
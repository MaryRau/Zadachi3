import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// задача 11
class Product {
    public String name;
    public float price;
    public int quantity;
}

class Store {
    List<Product> products = new ArrayList<Product>();
    public void addProduct(Product p)
    {
        products.add(p);
    }

    public void removeProduct(Product p)
    {
        products.remove(p);
    }

    public List<Product> searchByName(String name)
    {
        return products.stream()
                .filter(p -> p.name == name)
                .collect(Collectors.toList());
    }
}
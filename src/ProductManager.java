import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public ProductManager(List<Product> products) {
        this.products = products;
    }

    public void add(Product product) {
        products.add(product);
    }

    public Product searchById(int id) {
        for (Product product : products){
            if (product.getId() == id);
            return product;
        }
        return null;
    }

    public Product searchByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void remove(int id) {
        Product product = searchById(id);
        if (product != null) {
            products.remove(product);
        }
    }

    public void sortAscending() {
        ProductComparatorAscending productComparatorAscending = new ProductComparatorAscending();
        products.sort(productComparatorAscending);
    }

    public void sortDecrease() {
        ProductComparatorDecreasing productComparatorDecreasing = new ProductComparatorDecreasing();
        products.sort(productComparatorDecreasing);
    }
    public void update(int id, Product newProduct) {
        Product product = searchById(id);
        if (product != null) {
            product.setName(newProduct.getName());
            product.setPrice(newProduct.getPrice());
        }

    }
    @Override
    public String toString() {
        return "ProductManagement{" +
                "products=" + products +
                '}';
    }


}
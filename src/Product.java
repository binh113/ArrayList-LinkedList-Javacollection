public class Product implements Comparable<Product> {
    private String name;
    private int id;

    public Product(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        return this.getName().compareTo(product.getName());
    }
}

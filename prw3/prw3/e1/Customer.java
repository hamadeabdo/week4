package e1;

public class Customer {
    private String name;
    private String category;

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public Customer(String name, String category) {
        this.name = name;
        this.category = category;
    }
}

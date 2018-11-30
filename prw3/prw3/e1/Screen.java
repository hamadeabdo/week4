package e1;

public class Screen {

    public String display(Customer customer) {

        String modified = customer.getName();
        if (customer.getCategory().equalsIgnoreCase("business")) {
            modified = modified.toUpperCase();
            System.out.println(modified);
        } else if (customer.getCategory().equalsIgnoreCase("economic")) {
            modified = modified.toLowerCase();
            System.out.println(modified);
        } else {
            System.out.println(" there is no catagory");
        }
        return modified;
    }
}

package e1;

public class ScreenApplication {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Customer customer1 = new Customer(" Sarah ", "business");
        Customer customer2 = new Customer(" Hamada ", "economic");
        Customer customer3 = new Customer("Lana","");
        screen.display(customer2);
        screen.display(customer1);
        screen.display(customer3);
    }
}

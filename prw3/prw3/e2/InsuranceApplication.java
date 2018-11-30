package e2;

public class InsuranceApplication {
    public static void main (String[] args) {
        TemplateChooser templateChooser = new TemplateChooser();
        Customer customer1 = new Customer("Mr.Hamada","");
        templateChooser.chooseTemplate(customer1);
        Customer customer2 = new Customer("Ms.sarah","");
        templateChooser.chooseTemplate(customer2);
        Customer customer3 = new Customer("Mr.Hokopoko","");
        templateChooser.chooseTemplate(customer3);
        Customer customer4 = new Customer("Ms.Hokopoko","");
        templateChooser.chooseTemplate(customer4);
        Customer customer5 = new Customer("Lana","");
        templateChooser.chooseTemplate(customer5);
    }
}

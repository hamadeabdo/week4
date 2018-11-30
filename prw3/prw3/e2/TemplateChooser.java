package e2;

public class TemplateChooser {
    public String chooseTemplate(Customer customer) {

        String name = customer.getName();
        if (name.endsWith("Hokopoko")) {
            System.out.println(name + " is a privileged ");
        }
        else if (name.startsWith("Mr")) {
            System.out.println(name + " is a man ");
        }
        else if (name.startsWith("Ms") || (name.startsWith("Mrs"))) {
            System.out.println(name+ " is a woman ");
        }
        else {
            System.out.println(name+ " is default ");
        }
        return name;
    }
}
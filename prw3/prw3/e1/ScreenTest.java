package e1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScreenTest {
    Screen screen = new Screen();
    @Test
    void testBusinessCustomer() {
        Customer customer = new Customer("sarah","Business");
        String formated =screen.display(customer);
        Assertions.assertEquals("SARAH" ,formated);
    }
    @Test
    void testEconomicCustomer(){
        Customer customer = new Customer("Hamada","Economic");
        String formated = screen.display(customer);
        Assertions.assertEquals("hamada",formated);
    }
    @Test
    void testOtherCustomer(){
        Customer customer = new Customer("lana","");
        String formated=screen.display(customer);
        Assertions.assertEquals("lana",formated);

    }

}
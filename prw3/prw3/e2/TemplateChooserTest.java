package e2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TemplateChooserTest {
    TemplateChooser templateChooser = new TemplateChooser();
    @Test
    void testPrivilegedTemplate(){
        Customer customer = new Customer("Mr.Hokopoko","");
        String formated = templateChooser.chooseTemplate(customer);
        Assertions.assertEquals("Mr.Hokopoko",formated ,"is a privileged");
    }
    @Test
    void testManTemplate() {
        Customer customer = new Customer("Mr.Hamada","");
        String formated = templateChooser.chooseTemplate(customer);
        Assertions.assertEquals("Mr.Hamada",formated ,"is a Man");
    }
    @Test
    void testWomanTemplate(){
        Customer customer = new Customer("Ms.Sarah","");
        String formated = templateChooser.chooseTemplate(customer);
        Assertions.assertEquals("Ms.Sarah",formated,"is a Woman");
    }
    @Test
    void testDefaultTemplate(){
        Customer customer = new Customer("Lana","");
        String formated = templateChooser.chooseTemplate(customer);
        Assertions.assertEquals("Lana",formated,"is a default");


    }

}
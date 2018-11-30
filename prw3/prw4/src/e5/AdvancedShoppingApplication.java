package e5;

import java.util.ArrayList;
import java.util.List;

public class AdvancedShoppingApplication {

    public static void main(String[] args) {
       List<Grocery> grocery=new ArrayList<>();
       System.out.println("Groceries:" +grocery);
       Grocery item1=new Grocery("bananas");
       Grocery item2=new Grocery("oranges");
       Grocery item3=new Grocery("tomatos");
       grocery.add(item1);
       grocery.add(item2);
       grocery.add(item3);
       System.out.println("Groceries:" +grocery);
       Grocery item4=new Grocery("oranges");
       if(item2.equals(item4)){
           grocery.remove(item2);}
       System.out.println("Groceries:" +grocery);
       grocery.add(item3);
       grocery.add(item3);
       System.out.println("Groceries:" +grocery);
       grocery.remove(item3);
       System.out.println("Groceries:" +grocery);



    }

}

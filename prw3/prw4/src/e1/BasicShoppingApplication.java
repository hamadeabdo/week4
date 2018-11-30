package e1;

import java.util.ArrayList;
import java.util.List;

public class BasicShoppingApplication {

    public static void main (String[] args) {
        List<String>groceries = new ArrayList<>();
        System.out.println("groceries: " +groceries);
        String groceries1 = "bananas";
        String groceries2 = "oranges";
        String groceries3 = "tomatoes";
        groceries.add(groceries1);
        groceries.add(groceries2);
        groceries.add(groceries3);
        System.out.println("Groceries: " + groceries);
        groceries.remove(groceries2);
        System.out.println("Groceries: " + groceries);
        groceries.add(groceries3);
        groceries.add(groceries3);
        System.out.println("Groceries: "+groceries);
        Integer size =groceries.size();
        groceries.remove("tomatoes");
        System.out.println("groceries: " + groceries);
        System.out.println("groceries Size: " +size);






    }



}

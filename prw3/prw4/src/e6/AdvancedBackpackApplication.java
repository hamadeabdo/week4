package e6;

import java.util.HashSet;
import java.util.Set;

public class AdvancedBackpackApplication {
    public static void main(String[] args) {
        Set<Item> backpack = new HashSet<>();
        System.out.println("Backpack:" + backpack);
        Item item = new Item("toothpaste");
        Item item1 = new Item("towel");
        Item item2 = new Item("underwear");
        backpack.add(item);
        backpack.add(item1);
        backpack.add(item2);
        System.out.println("Backpack:" + backpack);
        Item item3 = new Item("toothpastel");
        if (backpack.contains(item1)) {
            System.out.println("The backpack contains underwear");
        }
        backpack.remove(item2);
        System.out.println("Backpack:" + backpack);
        if(!backpack.contains(item2)){
            System.out.println("The backpack no longer contains underwear");
        }
        backpack.add(item1);
        backpack.add(item1);
        System.out.println("Backpack:" + backpack);
        System.out.println("Backpack:" + backpack);
        Integer size = backpack.size();
        System.out.println("Backpack size: " +size);


    }
}

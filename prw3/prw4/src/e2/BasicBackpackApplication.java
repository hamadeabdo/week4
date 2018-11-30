package e2;

import java.util.HashSet;
import java.util.Set;

public class BasicBackpackApplication {
    public static void main (String[] args) {
        Set<String>backpack= new HashSet<>();
        System.out.println("Backpack: " + backpack);
        String item1 = "toothpaste";
        String item2 = "towel";
        String item3 = "underwear";
        backpack.add(item1);
        backpack.add(item2);
        backpack.add(item3);
        System.out.println("backpack: " + backpack );
        if(backpack.contains("underwear"));{
            System.out.println(" The backpack contains underwear "); }
        backpack.remove("underwear");
        System.out.println("backpack: " + backpack);
        if(!backpack.contains("underwear"));{
            System.out.println(" The backpack no longer contains underwear ");
        }
        System.out.println("backpack: " + backpack);
        System.out.println("backpack: " + backpack);
        Integer size = backpack.size();
        System.out.println("backpack size: "+ size);














    }




}

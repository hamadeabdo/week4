package e3;

import java.util.HashMap;
import java.util.Map;

public class BasicIndexApplication {
    public static void main (String[] args) {
        Map<Integer,String>index= new HashMap<>();
        System.out.println("Index: " +index);
        index.put(1,"connecting");
        index.put(2,"possitive things");
        index.put(3,"ecologic economy");
        System.out.println("Index:" +index);
        System.out.println("Index keys:" +index.keySet());
        System.out.println("Index values: " +index.values());
        System.out.println("Index entry sets: " + index.entrySet());
        index.remove(1);
        index.put(1,"teaching methods");
        System.out.println("Index: " + index);
        boolean isExist = index.containsKey(3);
        if(isExist){
            System.out.println("The page number 1 exists as key");
        }
        System.out.println("The topic in page number 3 is "+ index.get(3));
        System.out.println("Index size :" + index.size());

    }
}

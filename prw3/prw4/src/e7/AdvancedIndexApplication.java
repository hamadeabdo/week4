package e7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvancedIndexApplication {
    public static void main(String[] args) {
        Map<Integer, List> index= new HashMap<>();
        System.out.println("Index:" +index);
        Integer page1 = new Integer(1);
        Integer page2 = new Integer(2);
        Topic text = new Topic("connecting");
        Topic text1 = new Topic("possitive things");
        Topic text2 = new Topic("ecologic economy");
        List<Topic> topic1=new ArrayList<>();
        List<Topic> topic2=new ArrayList<>();
        topic1.add(text);
        topic2.add(text1);
        topic2.add(text2);
        index.put(page1,topic1);
        index.put(page2,topic2);
        System.out.println("Index:" +index);
        System.out.println("Index:" +index.keySet());
        System.out.println("Index:" +index.values());
        Topic text3 =new Topic("teaching methods");
        System.out.println("Index:" +index);
        List<Topic> stored = topic1;
        stored.add(text3);
        System.out.println("Index:" +index);
        if(index.containsKey(page1)){
            System.out.println("The page number " +page1 + " exists as key");
        }
        List<Topic>stored2= topic2;
        System.out.println("The topics in page number 2 are " +stored2);
        Integer size = index.size();
        System.out.println("Index size: " + size);







    }
}

package rw4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RobodogApplication {
    public static void main(String[] args) {
        FileReader reader =new FileReader();
        List<String>lines=reader.asLines("rw4/Robodog.txt");
        for(String line : lines){
            System.out.println(line.replaceAll("!",""));
        }
    }
}

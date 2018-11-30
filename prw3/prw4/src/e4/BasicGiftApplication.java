package e4;

import javax.swing.*;
import java.util.Optional;

public class BasicGiftApplication {
    public static void main(String[] args) {
        Optional<String>giftBox=Optional.empty();
        System.out.println("Gift: " + giftBox);
        giftBox= Optional.of("Robotoy");
        System.out.println("Gift: "+giftBox);
        if(giftBox.isPresent()){
            System.out.println("There is a present in the gift box");
        }
        System.out.println("The gift is a "+giftBox);

    }



}

package e8;

import java.util.Optional;

public class AdvancedGiftApplication {
    public static void main(String[] args) {
        Optional<String>giftBox= Optional.empty();
        System.out.println("Gift: "+giftBox);
        Box box= new Box("Robotoy");
        System.out.println("Gift: " +box);

    }
}

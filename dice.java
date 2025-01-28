

import java.util.Random;

public class dice {
    Random random;
    int number;
    dice(){
        random = new Random();
        rool();
    }
    void rool(){
        number = random.nextInt(6) +1;
        System.out.println(number);
    }
    
}

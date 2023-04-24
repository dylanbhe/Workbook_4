import java.sql.SQLOutput;
import java.util.Random;
public class CrazyDice {
    public static void main(String[] args) {
        Random rand = new Random();
        //int funNum = rand.nextInt(10) + 1; //bound is 1 to 10 (without +1, 0 - 10)

        int funNum = rand.nextInt(13) + 1; // funNum are random number. bound is 1 to 10 (without +1, 0 - 10)
        System.out.println("your random number is: " + funNum);

        }
}


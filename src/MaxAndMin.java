
import java.util.Random; //import Random class
public class MaxAndMin {
    public static void main(String[] args) {
        Random rand = new Random(); //initiate Random instance called rand
        //int funNum = rand.nextInt(10) + 1; //bound is 1 to 10 (without +1, 0 - 10)
        int maxNum = 0;
        int minNum = 10;

        //create and initialise integer array and pre-fill with random values. (length = 10)
        int [] intArray = new int [10];

        System.out.println("This is the list of numbers: ");

        for (int index = 0; index < intArray.length; index ++ ){
            int funNum = rand.nextInt(10) + 1; // funNum are random numbers. bound is 1 to 10 (without +1, 0 - 10)
            intArray [index] = funNum; //populate list with random numbers
            System.out.print(intArray[index] + " ");
            if (intArray [index] > maxNum) {
                maxNum = intArray [index];
            }
            if (intArray [index] < minNum){
                minNum = intArray[index];
            }
        }
        System.out.print("\n");
        System.out.println("largest number = " + maxNum);
        System.out.println("smallest number = " + minNum);

    }
}


import java.util.Random; //import Random class
public class MaxAndMin {
    public static void main(String[] args) {
        Random rand = new Random(); //initiate Random instance called rand
        //int funNum = rand.nextInt(10) + 1; //bound is 1 to 10 (without +1, 0 - 10)


        //create and initialise integer array and pre-fill with random values. (length = 10)
        int [] intArray = new int [10]; //initialise empty list with length of 10
        int maxNum = 0; //declare and initialise maxNum
        int minNum = 0;

        System.out.println("This is the list of numbers: ");

        for (int index = 0; index < intArray.length; index ++ ){ //loop over int.Array
            int funNum = rand.nextInt(10) + 1; // funNum are random numbers. boundary is 1 to 10 (without +1, 0 - 10)
            intArray [index] = funNum; //populate list with random numbers
            maxNum = intArray[0]; //within fon loop change maxNum to first array value
            minNum = intArray[0]; //within for loop change minNum to first array value
            System.out.print(intArray[index] + " "); //print out each number followed by a space
            if (intArray [index] > maxNum) { //if the value at a given index is larger than manNum, turn maxNum into this
                maxNum = intArray [index];
            }
            if (intArray [index] < minNum){//if the value at a given index is smaller than minNum, turn minNum into this
                minNum = intArray[index];
            }
        }
        System.out.print("\n"); //go to next line
        System.out.println("largest number = " + maxNum); //print largest number
        System.out.println("smallest number = " + minNum); //print smallest number

    }
}

// import random class
import java.util.Random;

public class play {
    public static void main(String[] args) {
        // create random object
        Random rand = new Random();
        // initialise array 1, size 10
        int[] array1 = new int[10];
        // initialise array 2, size 10
        int[] array2 = new int[10];
        // generating random number for array1
        System.out.println("Generating Array 1, random values between 1 to 20");

        for (int i = 0; i < array1.length; i++) {
            array1[i] = rand.nextInt(20) + 1;
            System.out.print(array1[i]);
        }

        // generating random number for array2

        System.out.println("\nGenerating Array 2, random values between 1 to 20");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = rand.nextInt(20) + 1;
            System.out.print(array2[i]);
        }

        //}
        // advance : find duplicates using nested for loop
        System.out.println("\nPrinting duplicates");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");

                }
            }
        }

    }
}

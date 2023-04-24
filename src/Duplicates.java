import java.util.Random; //import Random class
public class Duplicates {
    public static void main(String[] args) {
        Random rand = new Random(); //initialise Random instance named rand
        int array1 [] = new int[10]; //create array named array1 with 20 elements
        int array2 [] = new int[10];

        System.out.println("numbers in array1 are: ");
        for (int i = 0; i < array1.length; i++ ){ //create first random array
            int funNum = rand.nextInt(20) + 1;
            array1 [i] = funNum;
            System.out.print( array1[i] + " ");
        }
        System.out.print("\n");
        System.out.println("numbers in array2 are: ");
        for (int i = 0; i < array2.length; i++){ //create second random array
            int funNum = rand.nextInt(20)+1;
            array2 [i] = funNum;
            System.out.print( array2[i] + " ");
        }
        System.out.print("\n");
        System.out.println("These are the duplicates: ");
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1.length; j++){
                if (array1[i] == array2[j]){
                    System.out.print(array1[i] + " ");

                }
            }
        }
    }
}

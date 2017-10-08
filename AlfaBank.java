 import java.util.*;
/**
 * Tha class uses the function bearch
 * @author Ekaterina Shevyakova
 * @version 1.0
 */
public class AlfaBank {

    public static void main(String[] args) {
        AlfaBank test = new AlfaBank();
        int lenghtOfArray = 1 + (int) (Math.random() * 10);
        System.out.println(lenghtOfArray);
        int[] array = new int[lenghtOfArray];
        test.filling(array);
        test.sort(array);
        int X = (int) (Math.random()*100);
        System.out.println("The index of first number less than " + X + " is " + test.bsearch(array, X));

    }
    /**
     * The method fills the array of int with random numbers from 0 to 100
     * @param array
     */

    public void filling(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i ++) {
            array[i] = random.nextInt(100);
        }
    }
    /**
     * The method sorts the array of int descending.
     * @param array
     */
    public void sort(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("The sorted array of ints: " + Arrays.toString(array));
    }
    /**
     * bearch
     * @param array
     * @param X
     * @return The index of number strictly less than X
     */
    public int bsearch(int[] array, int X) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < X) {
                index = i;
                return index;
            }
        }
        return index;
    }
}

package week6;
import java.util.Arrays;


public class Main98 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }


    public static int[] reverseCopy(int[] array){
        int[] newArray = new int[array.length];
        for(int i = 4, j = 0; i >= 0; i--){
            newArray[j] = array[i];
            j++;
        }
        return newArray;
    }
}



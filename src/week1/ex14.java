package week1;
import java.util.Scanner;

public class ex14 {
    public ex14() {
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Give me a number: ");
        int num = Integer.parseInt(reader.nextLine()); // Reads a string variable from the keyboard and transfers it to an intege

        if (num > 0) {
            System.out.println("Is positive ");
        } else {
            System.out.println("Negative ");
        }

    }


}
package week1;
import java.util.Scanner;

public class ex15 {
    public ex15() {
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Give me a number: ");
        int num = Integer.parseInt(reader.nextLine());

        if (num % 2 == 0) {
            System.out.println("Number " + num + " is even.");
        } else {
            System.out.println("Negative " + num + " is odd");
        }

    }
}
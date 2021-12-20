package week1;
import java.util.Scanner;

public class ex10 {
    public ex10() {
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Give me a number: ");
        int radius = Integer.parseInt(reader.nextLine()); // Reads a string variable from the keyboard and transfers it to an intege

        double result = 2 * Math.PI * radius;

        System.out.println("Your 4ototam is " + result);
    }


}
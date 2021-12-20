package week1;
import java.util.Scanner;

public class ex9 {
    public ex9() {
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("First number: ");
        int first = Integer.parseInt(reader.nextLine()); // Reads a string variable from the keyboard and transfers it to an intege

        System.out.print("Second number: ");
        int second = Integer.parseInt(reader.nextLine()); // Reads a string variable from the keyboard and transfers it to an integer

        double result = (double)first / second;

        System.out.println("Division: " + first + " / " + second + " = " + result);
    }


}
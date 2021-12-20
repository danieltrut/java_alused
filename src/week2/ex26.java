package week2;

import java.util.Scanner;
import java.lang.String;

public class ex26 {
    public ex26() {
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.print("Give me a number: ");
            int read = Integer.parseInt(reader.nextLine());
            sum = sum + read;
            if (read == 0) {

                break;
            }

            // DO SOMETHING HERE

            System.out.println("Sum now: " + sum);
            continue;
        }
        System.out.println("Sum in the end: " + sum);


    }


}

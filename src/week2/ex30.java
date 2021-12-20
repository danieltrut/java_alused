package week2;

import java.util.Scanner;

public class ex30 {
    public ex30() {
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give me a number: ");
        int read = Integer.parseInt(reader.nextLine());
        int i = 1;
        while (i < (read + 1)){
            System.out.println(i);
            i++;
        }
    }
}

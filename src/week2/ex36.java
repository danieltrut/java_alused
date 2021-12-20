package week2;

import java.util.Scanner;

public class ex36 {
    public ex36() {
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what?: ");
        int read = Integer.parseInt(reader.nextLine());
        int result = 0;
        int i = read;
        while (read == (-1)) {
            i--;
            System.out.println(i);
        }
        System.out.println("thanks bto");
    }
}

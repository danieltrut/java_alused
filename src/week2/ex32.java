package week2;

import java.util.Scanner;

public class ex32 {
    public ex32() {
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what?: ");
        int read = Integer.parseInt(reader.nextLine());
        int result = 0;
        int i = 0;
        while (i < (read)){

            i++;
            result += i;  // this is the same as result = result + 3;
        }
        System.out.println(result);
    }
}

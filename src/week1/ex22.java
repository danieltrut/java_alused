package week1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ex22 {
    public ex22() {
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give me a year: ");
        String name = reader.nextLine();
        String pass = "java";

        if(name == pass ) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
            Scanner readers = new Scanner(System.in);
            System.out.print("Give me a year: ");

        }
    }


}

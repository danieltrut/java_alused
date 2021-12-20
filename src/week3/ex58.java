package week3;

import java.util.ArrayList;
import java.util.Scanner;
@SuppressWarnings("InfiniteLoopStatement")

public class ex58 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<String> Words = new ArrayList<String>();


        while (true) {

            System.out.print("Type a word: ");
            String word = reader.nextLine();


            if (Words.contains(word)) {
                System.out.println("You gave the word " + word + " twice.");
                break;
            }

            Words.add(word);

        }
    }
}

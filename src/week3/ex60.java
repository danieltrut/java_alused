package week3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
@SuppressWarnings("InfiniteLoopStatement")

public class ex60 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);



        while(true){
            System.out.print("Enter the word: ");
            String word = reader.nextLine(); // Reading word
            words.add(word); // Adding word to array


            if (word.isEmpty()) {  // could also be: word.equals("")
                // word was empty, meaning that the user only pressed enter
                System.out.println("You typed the following words:");
                Collections.sort(words);
                for (String wor : words) {
                    System.out.println( wor );
                }

                break;
            }


        }

    }
}
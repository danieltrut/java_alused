package week3;

import java.util.ArrayList;
import java.util.Scanner;
@SuppressWarnings("InfiniteLoopStatement")

public class ex57 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        int place = 0;


        while(true){
            System.out.print("Enter the word: ");
            String word = reader.nextLine(); // Reading word
            words.add(word); // Adding word to array


            if(true){
                place++;
            }
            if (word.isEmpty()) {  // could also be: word.equals("")
                // word was empty, meaning that the user only pressed enter
                System.out.println("You typed the following words:");
                for (String wor : words) {
                    System.out.println( wor );
                }

                break;
            }


        }

    }
}
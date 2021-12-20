package week7;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // test
        Test dictionary = new Test();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }
    }

}


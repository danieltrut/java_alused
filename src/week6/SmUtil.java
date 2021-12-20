package week6;

import java.util.*;


public class SmUtil {    // 101.4 improved search


    public SmUtil() {    // constructor

    }

    public static boolean included(String word, String searched) {
        if (word == null || searched == null || word.isEmpty() || searched.isEmpty()) {
            return false;
        }

        word = word.trim();
        word = word.toUpperCase();
        searched = searched.trim();
        searched = searched.toUpperCase();

        if (word.contains(searched)) {
            return true;
        } else {
            return false;
        }
    }
}
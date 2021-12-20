package week7;

import java.util.*;

public class Test {
    private HashMap<String, String> translator;

    public Test() {
        this.translator = new HashMap<String, String>();
    }

    public String translate(String word) {

        String key = this.translator.get(word);

        return key;
    }

    public void add(String word, String translation) {
        this.translator.put(word, translation);
    }

    public int amountOfWords() {
        int numberOfWords = 0;

        for (String key : this.translator.keySet()) {
            numberOfWords++;
        }

        return numberOfWords;
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>();

        for (String key : this.translator.keySet()) {
            String valueString = this.translator.get(key);

            String keyValue = key + " = " + valueString;

            translationList.add(keyValue);
        }

        return translationList;
    }
}

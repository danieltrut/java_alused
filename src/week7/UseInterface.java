package week7;

import java.util.*;

public class UseInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public UseInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void openingScript() {
        System.out.println("Statement: ");
        System.out.println("   quit - quit the text user interface");
        System.out.println();
    }

    public void nextStatement() {
        System.out.print("Statement: ");
    }

    public void start() {
        openingScript();

        while (true) {
            nextStatement();

            String input = this.reader.nextLine();

            if (input.equals("quit")) {		//quit
                System.out.print("Cheers!");
                break;
            } else if (input.equals("add")) {	//add
                this.add();
            } else if (input.equals("translate")) {	//translate
                this.translate();
            } else {				//unknown command
                System.out.println("Unknown statement");
            }

            System.out.println();
        }
    }

    public void add() {
        System.out.print("In Finnish: ");
        String finnish = this.reader.nextLine();

        System.out.print("Translation: ");
        String translation = this.reader.nextLine();

        this.dictionary.add(finnish, translation);
    }

    public void translate() {
        System.out.print("Give a word: ");
        String word = this.reader.nextLine();

        System.out.println("Translation: " + this.dictionary.translate(word));
    }
}

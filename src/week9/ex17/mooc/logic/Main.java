package week9.Ex17;
import week9.ex17.mooc.logic.ApplicationLogic;
import week9.ex17.mooc.logic.UserInterface;
import week9.ex17.mooc.logic.TextUserInterface;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
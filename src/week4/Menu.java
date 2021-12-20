package week4;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;


    public Menu() {
        this.meals = new ArrayList<String>();
        addMeal("Hamburger");
        addMeal("Fish'n'Chips");
        addMeal("Sauerkraut");

    }

    public void addMeal(String meal) {
        this.meals.add(meal);
    }

    public void printMeal() {
        System.out.println(this.meals);
    }

}

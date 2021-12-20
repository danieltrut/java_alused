package week1;
import java.util.Scanner;

public class ex18 {
    public ex18() {
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Give me a number: ");
        int num = Integer.parseInt(reader.nextLine());

        if (num > 0 && num < 30) {
            System.out.println("Failed");
        } else if (num > 29 && num < 34){
            System.out.println("1");
        } else if (num > 34 && num < 40){
            System.out.println("2");
        }else if (num > 39 && num < 45){
            System.out.println("3");
        }else if (num > 44 && num < 50){
            System.out.println("4");
        } else if (num > 50  && num < 61){
            System.out.println("5");
        } else if (num > 60){
            System.out.println("Too much");
        } else if (num < 0){
            System.out.println("Too much");
        }

    }


}
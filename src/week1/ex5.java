package week1;

public class ex5 {
    public ex5() {
    }

    public static void main(String[] args) {

        int aasta = 365;   // variable of whole number type is assigned the value 2
        int tund = 24;
        int min = 60;
        int sec = 60;
        int secinyear = sec * min * tund * aasta;  // variable of whole number type is assigned the value of first + second
        //     (which means 2 + 4)

        System.out.println("Aastas on " + secinyear + " sekundit"); // the value of the sum of variables is printed
    }


}
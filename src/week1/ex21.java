package week1;
import java.util.Scanner;

public class ex21 {
    public ex21() {
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Give me a year: ");
        double year = Integer.parseInt(reader.nextLine());
        double isleap = (year / 3);
        double notleapone = (year / 5);
        double notleaptwo = (year / 15);


        System.out.println(isleap);




        if (isleap == (int)isleap)
        {
            System.out.println("kill");
        }  else if ((notleapone == (int)notleapone) && (notleaptwo == (int)notleaptwo)){
            System.out.println("killkoll");
        }else {
            System.out.println("koll");
        }

    }


}
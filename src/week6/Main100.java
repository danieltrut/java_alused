package week6;
import java.util.Arrays;
public class Main100 {
        public static void main(String[] args) {
            NightSky NightSky = new NightSky(0.1, 40, 10);
            NightSky.printLine();
            //System.out.println("Number of stars: " + NightSky.starsInLastPrint());
            System.out.println("");

            NightSky = new NightSky(0.2, 15, 6);
            NightSky.printLine();
            //System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        }
}

package week2;


public class ex39 {
    public ex39() {
    }

    private static void printStars(int amount) {
        int i = 0;
            while (i < amount) {
                System.out.print("*");
                i++;
            }
            System.out.print("\n");

        // call this command amount times
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }


}

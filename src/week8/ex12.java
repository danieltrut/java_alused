package week8;

import java.util.Scanner;


public class ex12 {

    public static void main(String[] args) {
        // write some test code here
        Storehouse store = new Storehouse();
        store.addProduct("coffee", 5, 10);
        store.addProduct("milk", 3, 20);
        store.addProduct("milkbutter", 2, 55);
        store.addProduct("bread", 7, 8);

        Shop shop = new Shop(store, new Scanner(System.in));
        shop.manage("Pekka");
    }
    public class Purchase {

        private int amount;
        private int unitPrice;
        private String product;

        public Purchase(String product, int amount, int unitPrice){
            this.product = product;
            this.amount = amount;
            this.unitPrice = unitPrice;
        }

        public int price(){
            return this.unitPrice * this.amount;
        }

        public void increaseAmount(){
            this.amount++;
        }

        public String toString(){
            return this.product + ": " + this.amount;
        }

    }
    import java.util.Scanner;

    public class Shop {

        private Storehouse store;
        private Scanner reader;

        public Shop(Storehouse store, Scanner reader) {
            this.store = store;
            this.reader = reader;
        }

        // the method to deal with a customer in the shop
        public void manage(String customer) {
            ShoppingBasket basket = new ShoppingBasket();
            System.out.println("Welcome to our shop " + customer);
            System.out.println("below is our sale offer:");

            for (String product : store.products()) {
                System.out.println( product );
            }

            while (true) {
                System.out.print("what do you want to buy (press enter to pay):");
                String product = reader.nextLine();
                if (product.isEmpty()) {
                    break;
                }

                // here, you write the code to add a product to the shopping basket, if the storehouse is not empty
                // and decreases the storehouse stocks
                // do not touch the rest of the code!
                if(store.stock(product)>0){
                    store.take(product);
                    basket.add(product, store.price(product));
                }

            }

            System.out.println("your purchases are:");
            basket.print();
            System.out.println("basket price: " + basket.price());
        }
    }
}

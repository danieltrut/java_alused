package week4;

public class ex77 {
        public static void main(String[] args) {
            LyyraCard cardPekka = new LyyraCard(20);
            LyyraCard cardBrian = new LyyraCard(30);

            cardPekka.payGourmet();
            cardBrian.payEconomical();

            System.out.println("Pekka: " + cardPekka);
            System.out.println(cardBrian);

            cardPekka.loadMoney(20);
            cardBrian.payGourmet();

            System.out.println(cardPekka);
            System.out.println(cardBrian);

            cardPekka.payEconomical();
            cardPekka.payEconomical();
            cardBrian.loadMoney(50);

            System.out.println(cardPekka);
            System.out.println(cardBrian);


        }

}

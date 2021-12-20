package week5;

public class LyyraCard {
    private double balance;
    private boolean stat;

    public LyyraCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }

    public boolean pay(double amount){
        // the method checks if the balance of the card is at least the amount given as parameter
        if (this.balance >= amount){
            this.balance -= amount;
            return true;
        } else {
            return false;
        }

    }
}

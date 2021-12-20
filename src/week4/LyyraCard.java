package week4;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
       this.balance = balanceAtStart;
    }

    public void loadMoney(double amount) {
        if (amount < 0){
            this.balance = this.balance + 0;
        } else {
            this.balance = this.balance + amount;
        }

    }

    public void payEconomical() {

        if (this.balance == 0 || this.balance <= 0) {
            this.balance = this.balance - 0;
        } else {
            this.balance = this.balance - 2.5;
        }
    }

    public void payGourmet() {
        if (this.balance == 0 || this.balance > 0) {
            this.balance = this.balance - 0;
        } else {
            this.balance = this.balance - 3.5;

        }

    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

}

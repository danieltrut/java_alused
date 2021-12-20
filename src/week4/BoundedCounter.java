package week4;

public class BoundedCounter {
    private int value;
    private int upperLimit;
    private int limit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        limit = upperLimit;
        if (this.value == upperLimit){
            this.value = 0;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void countMin(){
        this.value = this.value + 1;
    }

    public void countHour(){
        this.value = this.value + 1;
    }


    public void toZero(){
        this.value = 0;
    }

    public void next() {
        if (this.value < limit) {
            this.value = this.value + 1;
        } else {
            this.value = 0;
        }
    }

    public String toString() {
        if(this.value < 10){
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }


}
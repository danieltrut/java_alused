package week4;

public class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter
    public int valueInitial;

    public DecreasingCounter(int valueAtStart) {
        this.valueInitial = valueAtStart;
        this.value = valueAtStart;

    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here the code that decrements the value of counter by one

        if(this.value != 0) {
            this.value = this.value - 1;
        } else {
            this.value = 0;
        }
    }

    public void reset() {
        this.value = 0;
    }

    public void setInitial() {
        this.value = this.valueInitial;
    }

    // and here the rest of the methods
}

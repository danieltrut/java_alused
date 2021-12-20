package week9.ex20;

public class Thermometer implements Sensor{

    private boolean state;

    public Thermometer() {
        state = false;
    }

    @Override
    public boolean isOn() {
        return this.state;
    }

    @Override
    public void on() {
        this.state = true;
    }

    @Override
    public void off() {
        this.state = false;
    }

    @Override
    public int measure() {
        if(this.state){
            if(Math.random() > 0.5f){
                return (int) ((-1) * Math.random() * 30);
            } else {
                return (int) (Math.random() * 30);
            }
        } else {
            throw new IllegalStateException();
        }
    }

}

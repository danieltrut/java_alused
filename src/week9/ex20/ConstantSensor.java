package week9.ex20;

public class ConstantSensor implements Sensor{
    private int tem;

    public ConstantSensor(int tem){
        this.tem = tem;
    }

    public void on(){};

    public void off(){};

    public int measure(){
        return this.tem;
    }

    public boolean isOn(){
        return true;
    }

}

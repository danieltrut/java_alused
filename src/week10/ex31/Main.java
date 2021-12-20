package week10.ex31;

import week10.ex31.Cow;
import week10.ex31.Alive;
import week10.ex31.BulkTank;
import week10.ex31.Milkable;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm("Esko", new Barn(new BulkTank()));
        MilkingRobot robot = new MilkingRobot();
        farm.installMilkingRobot(robot);

        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.addCow(new Cow());


        farm.liveHour();
        farm.liveHour();

        farm.manageCows();

        System.out.println(farm);
    }
}

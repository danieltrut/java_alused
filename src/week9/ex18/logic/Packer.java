package week9.ex18.logic;

import java.util.ArrayList;
import java.util.List;
import week9.ex18.domain.Box;
import week9.ex18.domain.Thing;

public class Packer {
    private int boxVol;

    public Packer(int boxesVolume){
        this.boxVol = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things){
        List<Box> buffer = new ArrayList<Box>();

        Box box = new Box(this.boxVol);

        for (Thing i : things){

            while(box.addThing(i)){
                System.out.println("Adding things");
            }



            if(!box.addThing(i)){
                buffer.add(box);
                box = new Box(this.boxVol);
            }
        }

        return buffer;
    }
}
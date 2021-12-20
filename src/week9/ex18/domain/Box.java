package week9.ex18.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing{
    private int maxCap;
    private List<Thing> db;

    public Box(int maximumCapacity){
        this.db = new ArrayList<Thing>();
        this.maxCap = maximumCapacity;
    }

    public boolean addThing(Thing thing){
        if(this.maxCap - this.getVolume() >= thing.getVolume()){
            this.db.add(thing);
            return true;
        } else {
            return false;
        }
    }

    public int getVolume(){
        int vol = 0;

        for(Thing i : this.db){
            vol += i.getVolume();
        }

        return vol;
    }
}
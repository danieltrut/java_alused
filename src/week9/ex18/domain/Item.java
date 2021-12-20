package week9.ex18.domain;

public class Item implements Thing, Comparable<Item>{

    private String name;
    private int vol;

    public Item(String name, int vol){
        this.name = name;
        this.vol = vol;
    }


    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name + " ("+this.vol+" dm^3)";
    }

    public int getVolume(){
        return this.vol;
    }

    @Override
    public int compareTo(Item comparable){
        /*
        if(this.vol < comparable.getVolume()){
            return -1;
        } else {
            return 1;
        }
                */
        return this.vol - comparable.getVolume();
    }
}
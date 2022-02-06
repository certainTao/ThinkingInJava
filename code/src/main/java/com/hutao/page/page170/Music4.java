package com.hutao.page.page170;
import static com.hutao.util.Print.*;

abstract class Instrument{
    private int i;
    public abstract void play(Note n);
    public String what(){
        return "Instrument";
    }
    public abstract void adjust();

}

class Wind extends Instrument{
    public void play(Note n){
        print("Wind.play()"+n);
    }
    public void adjust(){}
}

public class Music4 {
    public static void main(String[] args) {
        Instrument instrument = new Wind();
        print(instrument.what());
    }
}

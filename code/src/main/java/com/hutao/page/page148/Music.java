package com.hutao.page.page148;
import static com.hutao.util.Print.*;

class Instrument{
    public void play(Note n){
        print("Instrument.play()");
    }
}

class Wind extends Instrument{
    @Override
    public void play(Note n) {
        print("Wind.play() "+n);
    }
}

public class Music {
    public static void tune(Instrument instrument){
        instrument.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind wind = new Wind();
        tune(wind);
    }
}

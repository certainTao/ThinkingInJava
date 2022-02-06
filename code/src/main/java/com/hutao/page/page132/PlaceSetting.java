package com.hutao.page.page132;

import static com.hutao.util.Print.print;

class Plate{
    Plate(int i){
        print("Plate constructor "+i);
    }
}

class DinnerPlate extends Plate{
    DinnerPlate(int i){
        super(i);
        print("DinnerPlate constructor "+i);
    }
}

class Utensil{
    Utensil(int i){
        print("Utensil constructor "+i);
    }
}

class Spoon extends Utensil{
    Spoon(int i){
        super(i);
        print("Spoon constructor "+i);
    }
}

class Fork extends Utensil{
    Fork(int i){
        super(i);
        print("Fork constructor "+i);
    }
}

class Knife extends Utensil{
    Knife(int i){
        super(i);
        print("Knife constructor "+i);
    }
}

class Custom{
    Custom(int i){
        print("Custom constructor "+i);
    }
}


public class PlaceSetting extends Custom{
    private Spoon spoon;
    private Fork fork;
    private Knife knife;
    private DinnerPlate dinnerPlate;

    PlaceSetting(int i){
        super(i+1);
        print("PlaceSetting constructor "+i);

        spoon = new Spoon(i+2);
        fork = new Fork(i+3);
        knife = new Knife(i+4);
        dinnerPlate = new DinnerPlate(i+5);
    }

    public static void main(String[] args) {
        PlaceSetting placeSetting = new PlaceSetting(0);
    }
}

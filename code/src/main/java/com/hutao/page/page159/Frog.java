package com.hutao.page.page159;
import static com.hutao.util.Print.*;

class Characteristic{
    private String s;
    Characteristic(String s){
        this.s = s;
        print("Creating Characteristic "+s);
    }

    protected void dispose(){
        print("disposing Characteristic "+s);
    }
}

class Description{
    private String s;
    Description(String s){
        this.s = s;
        print("Creating Description "+s);
    }

    protected void dispose(){
        print("disposing Description "+s);
    }
}

class LivingCreature{
    private Characteristic characteristic = new Characteristic("is alive");
    private Description description = new Description("Basic Living Creature");
    LivingCreature(){
        print("LivingCreature()");
    }

    protected void dispose(){
        print("LivingCreature dispose");
        description.dispose();
        characteristic.dispose();
    }
}

class Animal extends LivingCreature{
    private Characteristic characteristic = new Characteristic("has heart");
    private Description description = new Description("Animal not Vegetable");
    Animal(){
        print("Animal()");
    }
    protected void dispose(){
        print("Animal dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal{
    private Characteristic characteristic = new Characteristic("can live in water");
    private Description description = new Description("Both water and land");
    Amphibian(){
        print("Amphibian()");
    }
    protected void dispose(){
        print("Amphibian dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}

public class Frog extends Amphibian{
    private Characteristic characteristic = new Characteristic("Croaks");
    private Description description = new Description("Eat bugs");
    public Frog(){
        print("Frog()");
    }
    protected void dispose(){
        print("Frog dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        print("Bye!");
        frog.dispose();
    }
}

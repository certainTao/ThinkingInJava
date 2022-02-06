package com.hutao.page.page164;

class Grain{
    public String toString(){
        return "Grain";
    }
}

class Wheat extends Grain{
    public String toString(){
        return "Wheat";
    }
}

class Mill{
    Grain process(){
        return new Grain();
    }
}

class WheatMill extends Mill{
    @Override
    Wheat process() {
        return new Wheat();
    }
}

public class CovarianReturn {
    public static void main(String[] args) {
        Mill mill = new Mill();
        Grain grain = mill.process();
        System.out.println(grain);

        mill = new WheatMill();
        grain = mill.process();
        System.out.println(grain);
    }
}

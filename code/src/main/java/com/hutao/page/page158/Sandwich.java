package com.hutao.page.page158;
import static com.hutao.util.Print.*;

class Meal{
    Meal(){
        print("Meal()");
    }
}

class Bread{
    Bread(){
        print("Bread()");
    }
}

class Cheese{
    Cheese(){
        print("Cheese()");
    }
}

class Lettuce{
    Lettuce(){
        print("Lettuce()");
    }
}

class Lunch extends Meal{
    Lunch(){
        print("Lunch()");
    }
}

class PortableLunch extends Lunch{
    //此成员变量用来验证是先初始化成员再调用构造器的。
    private Bread bread = new Bread();

    PortableLunch(){
        print("PortableLunch()");
    }
}

public class Sandwich extends PortableLunch{
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();
    public Sandwich(){
        print("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}

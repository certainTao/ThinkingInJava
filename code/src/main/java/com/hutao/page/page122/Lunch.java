package com.hutao.page.page122;

class Soup1{
    private Soup1(){}
    //(1) Allow creation via static method
    public static Soup1 makeSoup(){
        return new Soup1();
    }
}

class Soup2{
    private Soup2(){}
    private static Soup2 instance = new Soup2();
    public static Soup2 access(){
        return instance;
    }
    public void f(){
        System.out.println("f()");
    }
}



public class Lunch {
    void testPrivate(){
        //Can't do this! Private constructor
//        Soup1 soup1 = new Soup1();
    }

    void testStatic(){
        Soup1 soup1 = Soup1.makeSoup();
    }

    void testSingleton(){
        Soup2.access().f();
    }

    public static void main(String[] args) {
        Lunch lunch = new Lunch();
        lunch.testPrivate();
        lunch.testStatic();
        lunch.testSingleton();
    }
}

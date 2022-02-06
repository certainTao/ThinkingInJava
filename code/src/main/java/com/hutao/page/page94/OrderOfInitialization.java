package com.hutao.page.page94;

class Window{
    Window(int maker){
        System.out.println("Window("+maker+")");
    }
}

class House {
    //Before constructor
    Window window1 = new Window(1);

    House(){
        //Show that we're in the constructor
        System.out.println("House()");
        //Reinitialize window3
        window3 = new Window(33);
    }
    //After constructor
    Window window2 = new Window(2);

    void f(){
        System.out.println("f()");
    }

    //At end
    Window window3 = new Window(3);
}

public class OrderOfInitialization{
    public static void main(String[] args) {
        House house = new House();
        house.f();
    }
}

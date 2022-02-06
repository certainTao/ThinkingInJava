package com.hutao.exercise.page130;
import static com.hutao.util.Print.*;

class Component1{
    Component1(String marker){
        print("Component1 constructor " +marker );
    }
}

class Component2{
    Component2(String marker){
        print("Component2 constructor "+marker);
    }
}

class Component3{
    Component3(String marker){
        print("Component3 constructor "+marker);
    }
}

class Root{
    private Component1 component1 = new Component1("-Root");
    private Component2 component2 = new Component2("-Root");
    private Component3 component3 = new Component3("-Root");

    Root(String marker){
        print("Root constructor "+marker);
    }
}

class Stem extends Root{
    private Component1 component1 = new Component1("-Stem");
    private Component2 component2 = new Component2("-Stem");
    private Component3 component3 = new Component3("-Stem");
    Stem(){
        super("-Stem");
        print("Stem constructor");
    }
}

public class E10 {
    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}

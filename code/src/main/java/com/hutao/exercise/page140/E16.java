package com.hutao.exercise.page140;
import static com.hutao.util.Print.*;

class Amphibian{
    void yell(){
        print("Amphibian yell~");
    }
}

class Frog extends Amphibian{
    void yell(){
        print("Frog gua gua~");
    }
}

public class E16 {
    public static void main(String[] args) {
        Amphibian amphibian = new Frog();
        amphibian.yell();
    }
}

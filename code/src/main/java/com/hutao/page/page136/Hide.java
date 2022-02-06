package com.hutao.page.page136;
import static com.hutao.util.Print.*;

class Homer{
    char doh(char c){
        print("doh(char)");
        return 'd';
    }

    float doh(float f){
        print("doh(float)");
        return 1.0f;
    }
}

class MilHouse{}

class Bart extends Homer{
    void doh(MilHouse milHouse){
        print("doh(MilHouse)");
    }


}

public class Hide {
    public static void main(String[] args) {
        Bart bart = new Bart();
        bart.doh(1);
        bart.doh('x');
        bart.doh(1.0f);
        bart.doh(new MilHouse());
    }
}

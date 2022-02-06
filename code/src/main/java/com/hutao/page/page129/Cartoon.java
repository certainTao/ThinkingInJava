package com.hutao.page.page129;

import static com.hutao.util.Print.*;

class Art {
    Art(){
        print("Art constructor");
    }
}

class Drawing extends Art{
    Drawing(){
        print("Drawing constructor");
    }
}

public class Cartoon extends Drawing{
    public Cartoon(){
        print("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}



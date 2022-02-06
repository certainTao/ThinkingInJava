package com.hutao.page.page156;
import static com.hutao.util.Print.*;

public class PrivateOverride {
    private void f(){
        print("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride privateOverride = new Derived();
        privateOverride.f();
    }
}

class Derived extends PrivateOverride{
    public void f(){
        print("public f()");
    }
}

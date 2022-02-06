package com.hutao.page.page143;
import static com.hutao.util.Print.*;

class WithFinals{
    //Identical to "private" alone
    private final void f(){
        print("WithFinals.f()");
    }

    private void g(){
        print("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals{
    private final void f(){
        print("OverridingPrivate.f()");
    }

    private void g(){
        print("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate{
    public final void f(){
        print("OverridingPrivate2.f()");
    }

    public void g(){
        print("OverridingPrivate2.g()");
    }
}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 overridingPrivate2 = new OverridingPrivate2();
        overridingPrivate2.f();
        overridingPrivate2.g();

        //You can upcast:
        OverridingPrivate overridingPrivate = overridingPrivate2;
        //But you can't call the methods
//        !overridingPrivate.f();
//        !overridingPrivate.g();

        //Same here:
        WithFinals withFinals = overridingPrivate2;
//        !withFinals.f();
//        !withFinals.g();
    }
}

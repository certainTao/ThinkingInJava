package com.hutao.page.page161;
import static com.hutao.util.Print.*;

class Shared {
    private int refCount = 0;
    private static long count = 0;
    private final long id = count++;

    public Shared(){
        print("Crating "+this);
    }

    public String toString(){
        return "Shared "+id;
    }

    public void addRef(){
        ++refCount;
    }

    protected void dispose(){
        if(--refCount==0){
            print("Disposing "+this);
        }
    }
}

class Composing{
    private Shared shared;
    private static long count = 0;
    private final long id = count++;
    public Composing(Shared shared){
        print("Crating "+this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose(){
        print("disposing "+this);
        shared.dispose();
    }

    public String toString(){
        return "Composing "+id;
    }
}

public class ReferenceCounting{
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composingArray = {new Composing(shared),new Composing(shared),new Composing(shared)};
        for (Composing composing : composingArray) {
            composing.dispose();
        }
    }
}

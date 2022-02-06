package com.hutao.page.page138;

import static com.hutao.util.Print.*;

class Villain{
    private String name;
    public Villain(String name){
        this.name = name;
    }

    protected void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "I'm a Villain and my name is "+name;
    }
}

public class Orc extends Villain{
    private int orcNumber;
    Orc(String name, int orcNumber){
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber){
        setName(name);
        this.orcNumber = orcNumber;
    }

    public String toString(){
        return "Orc "+orcNumber+": "+super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger",12);
        print(orc);

        orc.change("Bob",19);
        print(orc);
    }
}

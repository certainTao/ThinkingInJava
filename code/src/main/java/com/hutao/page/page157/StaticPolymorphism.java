package com.hutao.page.page157;

class StaticSuper{
    public static String staticGet(){
        return "Base staticGet()";
    }
    public String dynamicGet(){
        return "Base dynamicGet()";
    }
}

class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "Derived staticGet()";
    }
    public String dynamicGet(){
        return "Derived dynamicGet()";
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        //静态方法是与类而并非单个对象关联的，所以这里的静态方法会与引用的类型StaticSuper类相关联
        StaticSuper staticSuper = new StaticSub();
        System.out.println(staticSuper.staticGet());
        System.out.println(staticSuper.dynamicGet());
    }
}

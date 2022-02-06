package com.hutao.page.chapter15.page355;

class Bike {
}

class Moto {
}

class Car {
}

public class Test {
    public static void main(String[] args) {
        //在继承时不指定泛型父类的类型参数的ThreeTuple<A,B,C>
        ThreeTuple<Bike, Moto, Car> threeTuple = new ThreeTuple<Bike, Moto, Car>(new Bike(), new Moto(), new Car());
        System.out.println(threeTuple);

        //在继承时指定泛型父类的全部类型参数的ThreeTuple1<C>
        ThreeTuple1<Car> threeTuple1 = new ThreeTuple1<Car>(1,"en",new Car());
        System.out.println(threeTuple1);

        //在继承时指定泛型父类的部分类型参数的ThreeTuple2<B, C>
        ThreeTuple2<Moto, Car> threeTuple2 = new ThreeTuple2<Moto, Car>(2,new Moto(), new Car());
        System.out.println(threeTuple2);
    }
}

package com.hutao.page.page594;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

enum Explore{HERE, THERE,}

public class Reflection {
    public static Set<String> analyze(Class<?> enumClass){
        System.out.println("-----Analyzing "+ enumClass + "-----");
        System.out.println("Interfaces:");
        for (Type t : enumClass.getGenericInterfaces()) {
            System.out.print(t);
        }

        System.out.println("Base: "+enumClass.getGenericSuperclass());

        System.out.println("Methods:");
        Set<String> methodSet = new TreeSet<String>();
        for (Method m : enumClass.getMethods()) {
            methodSet.add(m.getName());
        }
        System.out.println(methodSet);
        return methodSet;
    }

    public static void main(String[] args) {
        Set<String> exploreMethodSet = analyze(Explore.class);
        Set<String> enumMethodSet = analyze(Enum.class);

        System.out.println("Explore.containsAll(Enum)? "+ exploreMethodSet.containsAll(enumMethodSet));
        System.out.println("Explore.removeAll(Enum): ");
        exploreMethodSet.removeAll(enumMethodSet);
        System.out.println(exploreMethodSet);
    }
}

package com.hutao.page.page102;

class A{}

public class VarArgs {
    static void printArray(Object[] args){
        for (Object arg : args) {
            System.out.print(arg+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{new Integer(47),new Float(3.14),new Double(11.11)});
        printArray(new Object[]{"one","two","three"});
        printArray(new Object[]{new A(), new A(), new A()});
    }
}

package com.hutao.page.page102;

public class NewVarArgs {
    static void printArray(Object... args) {
        System.out.print(args.getClass()+"-> ");
        for (Object arg : args) {
            System.out.print(arg+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Can take individual elements
        printArray(new Integer(47), new Float(3.14),new Double(11.11));
        printArray(47,3.14F,11.11);
        printArray("one","two","three");
        printArray(new A(),new A(),new A());
        //Or an array
        printArray(new Integer[]{1,2,3,4});
        //Empty list is ok
        printArray();
        printArray(new Integer[]{1,2,3,4},new Integer[]{1,2,3,4});
    }
}

package com.hutao.page.page140;

import java.util.Random;
import static com.hutao.util.Print.*;

class Value{
    int i;//Package access
    public Value(int i){
        this.i = i;
    }
}

public class FinalData {
    private static Random random = new Random(47);
    private String id;
    public FinalData(String id){
        this.id = id;
    }
    //Can be compile-time constants:
    private final int valueOne = 9;
    private static int VALUE_TWO = 99;
    //Typical public constant:
    public static final int VALUE_THREE = 39;

    //Cannot be compile-time constants:
    private final int i4 = random.nextInt(20);
    static final int INT_5 = random.nextInt(20);
    private Value value1 = new Value(11);
    private final Value value2 = new Value(22);
    private static final Value VAL_3 = new Value(33);

    //Arrays:
    private final int[] a = {1,2,3,4,5,6};

    public String toString(){
        return id+ ": "+"i4 = "+ i4 +", INT_5 = "+ INT_5;
    }

    public static void main(String[] args) {
        FinalData finalData1 = new FinalData("finalData1");
        //!finalData1.valueOne++;//Error: can't change value
        finalData1.value2.i++;//Object isn't constant
        finalData1.value1 = new Value(9);//Ok value1 not final

        for (int i = 0; i < finalData1.a.length; i++) {
            finalData1.a[i]++;//Object isn't constant
        }
        //! finalData1.value2 = new Value(0);//Error: Can't
        //! finalData1.VAL_3 = new Value(1);//change reference
        //! finalData1.a = new int[3];

        print(finalData1);
        print("Creating new FinalData");
        FinalData finalData2 = new FinalData("finalData2");
        print(finalData1);
        print(finalData2);
    }
}

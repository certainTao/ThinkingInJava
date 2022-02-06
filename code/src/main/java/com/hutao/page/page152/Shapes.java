package com.hutao.page.page152;
import com.hutao.page.page152.RandomShapeGenerator;
import com.hutao.page.page152.Shape;

import static com.hutao.util.Print.*;

public class Shapes {
    private static RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[9];
        for (int i = 0; i < shapeArray.length; i++) {
            shapeArray[i] = randomShapeGenerator.next();
        }

        for (Shape shape : shapeArray) {
            shape.draw();
            shape.message();
            print();
        }
    }
}

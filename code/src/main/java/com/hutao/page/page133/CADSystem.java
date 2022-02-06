package com.hutao.page.page133;
import static com.hutao.util.Print.*;

class Shape{
    Shape(int i){
        print("Shape constructor "+i);
    }

    void dispose(){
        print("Shape dispose ");
    }
}

class Circle extends Shape{
    Circle(int i){
        super(i);
        print("Drawing Circle "+i);
    }

    void dispose(){
        print("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape{
    Triangle(int i){
        super(i);
        print("Drawing Triangle "+i);
    }

    void dispose(){
        print("Erasing Triangle");
        super.dispose();
    }
}

class Line extends Shape{
    private int start, end;
    Line(int start, int end){
        super(start);
        this.start = start;
        this.end = end;
        print("Drawing Line "+start+", "+end);
    }

    void dispose(){
        print("Erasing Line "+start+", "+end);
        super.dispose();
    }
}

public class CADSystem extends Shape{
    private Circle circle;
    private Triangle triangle;
    private Line[] lines = new Line[3];
    public CADSystem(int i){
        super(i+1);
        circle = new Circle(i+2);
        triangle = new Triangle(i+3);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j,j*j);
        }
        print("CADSystem constructor "+i);
    }

    void dispose(){
        for (int i = 0; i < lines.length; i++) {
            lines[i].dispose();
        }
        triangle.dispose();
        circle.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem cadSystem = new CADSystem(1);
        try{

        }finally {
            cadSystem.dispose();
        }

    }
}

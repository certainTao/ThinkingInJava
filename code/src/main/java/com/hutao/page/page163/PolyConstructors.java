package com.hutao.page.page163;
import static com.hutao.util.Print.*;

class Glyph{
    void draw(){
        print("Glyph.draw()");
    }

    Glyph(){
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;

    RoundGlyph(){
        this.radius = radius;
        print("RoundGlyph.RoundGlyph(), radius = "+radius);
    }

    @Override
    void draw() {
        print("RoundGlyph.draw(), radius = "+radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph();
    }
}

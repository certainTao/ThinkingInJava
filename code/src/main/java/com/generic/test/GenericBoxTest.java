package com.generic.test;

import com.generic.BlueBall;
import com.generic.GenericBox;
import com.generic.RedBall;


public class GenericBoxTest {
    public static void main(String[] args) {
        GenericBox<RedBall> redBox = new GenericBox<RedBall>();
        GenericBox<BlueBall> blueBox = new GenericBox<BlueBall>();

        redBox.set(new RedBall());
        blueBox.set(new BlueBall());

        RedBall redBall = redBox.get();
        BlueBall blueBall = blueBox.get();
    }
}

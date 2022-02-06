package com.generic.test;

import com.generic.BlueBall;
import com.generic.PlainBox;
import com.generic.RedBall;

import java.util.List;

public class PlainBoxTest {
    public static void main(String[] args) {
        PlainBox redBox = new PlainBox();
        redBox.set(new RedBall());

        PlainBox blueBox = new PlainBox();
        blueBox.set(new BlueBall());

        RedBall redBall = (RedBall) redBox.get();
        BlueBall blueBall = (BlueBall) blueBox.get();

    }
}

package Swapping;

import processing.core.PApplet;

public class Swapping extends PApplet {
    public static void main(String[] args) {

        PApplet.main("sawapping.Swapping");

    }

    public void settings(){
        size(800,800);

    }

    public void setup(){
        p1 = new Proces("P1", color(255,0,0),64);
        Memory= new Memory ( 1024);

    }

    public void draw(){
        background(255);
        p1.display(this, 100, 100, 50);

    }



}

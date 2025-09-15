package POO.Poligons;

import processing.core.PApplet;

public class MainSol extends PApplet {
    Sol s;
    Punt2D ce;

    public static void main(String[] args) {
        PApplet.main("POO.Poligons.MainSol");
    }

    public void settings(){
        size(800, 800);
    }

    public void setup(){
        ce = new Punt2D("O",0,0);
        s = new Sol(new Punt2D("O", 0, 0), 200, 300);
    }

    public void draw(){
        background(255);
        translate(width/2, height/2);
        line(-width, 0, width, 0);
        line(0, -height, 0, height);
        s.display(this);
    }

}

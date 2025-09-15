package POO.Poligons;

import processing.core.PApplet;

public class MainQuadrat extends PApplet {


        Quadrat q; // Declaració

        public static void main(String[] args) {
            PApplet.main("POO.Poligons.MainQuadrat");
        }

        public void settings(){
            size(800, 800);
        }

        public void setup(){
            q = new Quadrat(new Punt2D("O", 0, 0), 200);
        }

        public void draw(){
            background(255);
            translate(width/2, height/2);
            line(-width, 0, width, 0);
            line(0, -height, 0, height);
            q.display(this);
        }

}

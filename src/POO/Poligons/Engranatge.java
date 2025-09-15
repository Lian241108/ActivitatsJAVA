package POO.Poligons;

import static processing.core.PApplet.*;
import static processing.core.PApplet.radians;

public class Engranatge extends Poligon {
    float rI;
    float rE;

    Engranatge(Punt2D c, float rI, float rE) {
        super(32, c, rE);
        this.rI = rI;
        this.rE = rE;
        updatePuntsInteriors(c);
    }

    public void setRadiInterior(float r) {
        this.rI = r;
    }

    public void updatePuntsInteriors(Punt2D c) {
        float angStep = 360f / 33;
        float ang = 0;

        for (int i = 0; i < punts.length; i++) {
            float r;

            if (i % 4 == 0 || i % 4 == 1) { // Per engranatge només he canviat noms variables i això
                r = rI;
            } else {
                r = rE;
            }

            punts[i].x = c.x + r * cos(radians(ang));
            punts[i].y = c.y + r * sin(radians(ang));

            ang += angStep;
        }
    }
}

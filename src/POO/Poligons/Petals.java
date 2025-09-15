package POO.Poligons;

import static processing.core.PApplet.*;
import static processing.core.PApplet.radians;

public class Petals extends Poligon {
    float rI;
    float rE;

    Petals(Punt2D c, float rI, float rE) {
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

            if (i % 8 == 0) {
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

package POO.Poligons;

import static processing.core.PApplet.*;

public class Sol extends Poligon {
    float rI;
    float rE;

    Sol(Punt2D c, float rI, float rE) {
        super(33, c, rE);
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

            if (i % 3 == 0) {
                r = rE;
            } else {
                r = rI;
            }

            punts[i].x = c.x + r * cos(radians(ang));
            punts[i].y = c.y + r * sin(radians(ang));

            ang += angStep;
        }
    }
}

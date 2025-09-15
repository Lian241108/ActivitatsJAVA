package POO.Poligons;

import static processing.core.PApplet.*;

public class Estrella extends Poligon {
    float rI;

    Estrella(Punt2D c, float rI, float rE) {
        super(12, c, rE);
        updatePuntsInteriors(c);
        this.rI = rI;
    }

    public void setRadiInterior(float r) {
        this.rI = r;
    }

    public void updatePuntsInteriors(Punt2D c) {
        float angStep = 360f / 12;
        float ang = 0;
        for (int i = 0; i < punts.length; i += 2) {
            punts[i].x = c.x + rI * cos(radians(ang));
            punts[i].y = c.y + rI * sin(radians(ang));
            ang += 2 * angStep;

        }
    }
}
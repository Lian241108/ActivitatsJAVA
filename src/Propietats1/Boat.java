package Propietats1;

public class Boat extends Prop {

    private float length;
    private boolean navigable;

    public Boat(String propID, String address, String city, float length) {
        super(propID, address, city);
        this.length = length;
        this.navigable = true;
    }

    public float getLength() {
        return length;
    }

    public boolean isNavigable() {
        return navigable;
    }



    public void setLength(float length) {
        this.length = length;
    }

    public void setNavigable(boolean navigable) {
        this.navigable = navigable;
    }
}

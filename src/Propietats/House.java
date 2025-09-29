package Propietats;

public class House extends Prop {

    private int numRooms;
    private boolean swimmingPool;

    public House(String propID, String address, String city, int numRooms) {
        super(propID, address, city);
        this.numRooms = numRooms;
        this.swimmingPool = false;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }
}
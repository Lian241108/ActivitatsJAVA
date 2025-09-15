package Propietats;

public class Prop {

    private String propID;
    private String address;
    private String city;
    private float price;

    public Prop(String propID, String address, String city) {
        this.propID = propID;
        this.address = address;
        this.city = city;
        this.price = 0.0f;
    }

    public String getPropID() {return propID;}

    public void setPropID(String propID) {this.propID = propID;}

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}

    public String getCity() {return city;}

    public void setCity(String city) {this.city = city;}

    public float getPrice() {return price;}

    public void setPrice(float price) {this.price = price;}


    public boolean isCheaperThan (Prop p){
        return false;
    }

    public boolean sameCity (Prop p){
        return true;
    }



}

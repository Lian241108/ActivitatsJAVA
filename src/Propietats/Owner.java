package Propietats;

public class Owner {

    private String name;
    private String address;
    private Prop[] props;
    private int numProps;

    public Owner(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}

    public Prop[] getProps() {return props;}

    public void setProps(Prop[] props) {this.props = props;}

    public int getNumProps() {return numProps;}

    public void setNumProps(int numProps) {this.numProps = numProps;}

    public void addProp (Prop p) {
        if (numProps < props.length) {
            props[numProps] = p;
            numProps++;
        }
    }

    public float cheapestPrice(){

    }
    public float expensivePrice(){
        float cheapest = Float.MAX_VALUE
    }

}






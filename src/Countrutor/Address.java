package Countrutor;

public class Address {
    public String streetAddress;
    public char unit;
    public int zipcode;
    public String city;
    public String state;

    public Address(){}

    public Address(String streetAddress){
        this.streetAddress = streetAddress;
    }
    public Address(String streetAddress, char unit,String city,String state, int zipcode){
        this.streetAddress = streetAddress;
        this.unit= unit;
        this.zipcode = zipcode;
        this.state = state;
        this.city = city;
    }
    public String getStreetAddress(){
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public char getUnit() {
        return unit;
    }

    public void setUnit(char unit) {
        this.unit = unit;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void streetAddress(String s) {
    }
}

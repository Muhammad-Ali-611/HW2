package Countrutor;

public class Office {
    public Address address = null;
    public String officeName;

    public Office(){}
    public Office(Address address){
        this.address = address;
    }

    public Office(String officeName){
        this.officeName = officeName;
    }
    public Office(Address address, String officeName){
        this.officeName = officeName;
        this.address = address;
    }
    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }
}

package Countrutor;

public class TestOffice {
    public static void main(String[] args) {
        Address address = new Address();
        address.streetAddress("328 91st");
        System.out.println(address.getStreetAddress());
    }
}

public class Address {
    //    Declaring Variables

    String street;
    String city;
    String postalCode;


    // Constructor

    public Address(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    // Setter and Getter

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
//    Display
    public void displayAddress(){
        System.out.println("Street: " + this.street + "\nCity: " + this.city + "\nPostal Code: " + this.postalCode);
    }
}

package noteBook.entities;

public class Address {

    private String postCode;
    private String city;
    private String street;
    private String streetNumber;
    private String apartmentNumber;

    public String getPostCode() {
        return postCode;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }
    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public Address() {
    }

    public Address(String postCode, String city, String street, String streetNumber, String apartmentNumber) {
        this.postCode = postCode;
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postCode='" + postCode + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                '}';
    }

    public String getFullAddress() {
        String separator = ", ";
        return postCode + separator +
                city + separator +
                street + separator +
                streetNumber + separator +
                apartmentNumber;
    }
}
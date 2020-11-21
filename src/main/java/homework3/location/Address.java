package homework3.location;

public class Address {
    private Country country;
    private String city;

    public Address(Country country, String city) {
        this.country = country;
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country=" + country +
                '}';
    }
}

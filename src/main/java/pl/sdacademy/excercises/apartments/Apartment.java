package pl.sdacademy.excercises.apartments;

import java.util.Objects;

public class Apartment {
    private String city;
    private String district;
    private String street;
    private int rooms;
    private float surface;
    private boolean basement;
    private float price;

    public Apartment() {
    }

    public Apartment(String city, String district, String street, int rooms, float surface, boolean basement, float price) {
        this.city = city;
        this.district = district;
        this.street = street;
        this.rooms = rooms;
        this.surface = surface;
        this.basement = basement;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return rooms == apartment.rooms &&
                Float.compare(apartment.surface, surface) == 0 &&
                basement == apartment.basement &&
                Float.compare(apartment.price, price) == 0 &&
                Objects.equals(city, apartment.city) &&
                Objects.equals(district, apartment.district) &&
                Objects.equals(street, apartment.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, district, street, rooms, surface, basement, price);
    }

    @Override
    public String toString() {
        return "FlatViev{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", rooms=" + rooms +
                ", surface=" + surface +
                ", basement=" + basement +
                ", price=" + price +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }

    public boolean isBasement() {
        return basement;
    }

    public void setBasement(boolean basement) {
        this.basement = basement;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

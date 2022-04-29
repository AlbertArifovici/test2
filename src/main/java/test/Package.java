package test;

import java.time.LocalDate;

public class Package {
    private String location;
    private int distance;
    private int value;
    private LocalDate deliveryDate;

    public Package(String location, int distance, int value, LocalDate deliveryDate) {
        this.location =location;
        this.distance=distance;
        this.value=value;
        this.deliveryDate=deliveryDate;
    }

    public String getLocation() {
        return location;
    }

    public int getDistance() {
        return distance;
    }

    public int getValue() {
        return value;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public String toString() {
        return "Package{" +
                "firstName='" + location + '\'' +
                ", distance=" + distance +
                ", value=" + value +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}

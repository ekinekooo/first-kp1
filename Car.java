package yenideneme;

public class Car {

    private String serialNumber;
    private double price;
    CarSpec spec;

    public Car(String serialNumber, double price, CarSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float newPrice) {
        this.price = newPrice;
    }

    public CarSpec getSpec() {
        return spec;
    }
}


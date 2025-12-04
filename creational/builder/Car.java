package creational.builder;

import java.util.Date;

public class Car {
    private int id;
    private int noOfWheels;
    private boolean isAutomatic;
    private String type; // SUV, SEDAN, HATCHBack
    private String fuelType;
    private String Color;
    private Date buildYear;
    private String manufaturer; // HYUNDAI, MARUTI, MG
    private boolean bluetooth;

    private Car(CarBuilder carBuilder) {
        this.id = carBuilder.getId();
        this.noOfWheels = carBuilder.getNoOfWheels();
        this.isAutomatic = carBuilder.isAutomatic();
        this.type = carBuilder.getType();
        this.fuelType = carBuilder.getFuelType();
        this.Color = carBuilder.getColor();
        this.buildYear = carBuilder.getBuildYear();
        this.manufaturer = carBuilder.getManufaturer();
        this.bluetooth = carBuilder.isBluetooth();
    }

    public static CarBuilder getBuilder() {
        return new CarBuilder();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Date getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(Date buildYear) {
        this.buildYear = buildYear;
    }

    public String getManufaturer() {
        return manufaturer;
    }

    public void setManufaturer(String manufaturer) {
        this.manufaturer = manufaturer;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    static class CarBuilder {
        private int id;
        private int noOfWheels;
        private boolean isAutomatic;
        private String type; // SUV, SEDAN, HATCHBack
        private String fuelType;
        private String Color;
        private Date buildYear;
        private String manufaturer; // HYUNDAI, MARUTI
        private boolean bluetooth;

        public int getId() {
            return id;
        }

        public CarBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public int getNoOfWheels() {
            return noOfWheels;
        }

        public CarBuilder setNoOfWheels(int noOfWheels) {
            this.noOfWheels = noOfWheels;
            return this;
        }

        public boolean isAutomatic() {
            return isAutomatic;
        }

        public CarBuilder setAutomatic(boolean automatic) {
            isAutomatic = automatic;
            return this;
        }

        public String getType() {
            return type;
        }

        public CarBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public String getFuelType() {
            return fuelType;
        }

        public CarBuilder setFuelType(String fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        public Date getBuildYear() {
            return buildYear;
        }

        public CarBuilder setBuildYear(Date buildYear) {
            this.buildYear = buildYear;
            return this;
        }

        public String getColor() {
            return Color;
        }

        public CarBuilder setColor(String color) {
            Color = color;
            return this;
        }

        public String getManufaturer() {
            return manufaturer;
        }

        public CarBuilder setManufaturer(String manufaturer) {
            this.manufaturer = manufaturer;
            return this;
        }

        public boolean isBluetooth() {
            return bluetooth;
        }

        public CarBuilder setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

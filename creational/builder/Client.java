package creational.builder;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        Car c = Car.getBuilder()
                .setId(1)
                .setAutomatic(true)
                .setBluetooth(true)
                .setColor("Blue")
                .setBuildYear(new Date())
                .setFuelType("Pertol")
                .setNoOfWheels(4)
                .setType("SEDAN")
                .setManufaturer("HYUNDAI")
                .build();
        System.out.println("Created Car: " + c);
    }
}

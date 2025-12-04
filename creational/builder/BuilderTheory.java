package creational.builder;

import java.util.Date;

public class BuilderTheory {
    /*
    * - Builders are giving us the finished product as specified by the creator.
    * - When do we need Builder ?
    *   - There are multiple attributes
    *   - Object can be created with subset of attributes only without need of giving value for each attribute.
    *   - Enforcing Validations
    * - Extra builder class will help us to create object of an actual class.
     */
    class Car {
        int id;
        int noOfDoors;
        int noOfWheels;
        String engine;
        boolean isAutomatic;
        boolean bluetooth;
        String type; // SUV, SEDAN, HATCHBACK
        String color;
        int cost;
        String manufacturer;
        Date buildYear;
    }

    /**
     * Problem of Half baked object:
     * - Object created without having the necessary fiels.
     *
     * Validations:
     * - Every car should have an id
     * - Every car should have atleast 2 wheels
     *
     * Other Problems:
     * - Too many constructors
     * - For 11 attributes of Car, there will be multiple combinations of constructor.
     *
     * what if we put everything inside Car constructor validations and assignments.
     * - Now if we do like
     * Car c = new Car(Map<String, Object>)
     * Problem: No compile time enforcement is there, Runtime Errors is a problem
     *
     *
     */
}

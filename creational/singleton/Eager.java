package creational.singleton;

public class Eager {
    private static Eager instance = new Eager();

    private Eager() {
    }

    public static Eager getInstance() {
        return instance;
    }
}

// Drawbacks:
// - Application boot up time can be high (slower to start)
// - Passing the parametr is a problem
// - All the objects will be created even though they are not needed

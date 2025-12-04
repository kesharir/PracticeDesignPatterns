package creational.singleton;

public class LazySynchronized {
    private static LazySynchronized instance;

    private LazySynchronized(){}

    public static LazySynchronized getInstance() {
        if (instance == null) {
            instance = new LazySynchronized();
        }
        return instance;
    }
}
// Drawbacks:
// This approach is thread safe but is slow

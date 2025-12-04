package creational.singleton;

public class LazyDoubleCheckLocking {
    private static LazyDoubleCheckLocking instance;

    private LazyDoubleCheckLocking(){}

    public static LazyDoubleCheckLocking getInstance() {
        // T1,T2
        if (instance == null) {
            synchronized(LazyDoubleCheckLocking.class) {
                if (instance == null) {
                   instance = new LazyDoubleCheckLocking();
                }
            }
        }
        return instance;
    }
}

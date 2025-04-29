import java.util.Random;

public class nameSingleton {

    private int index;
    private static final Object lockObject = new Object();
    private static volatile nameSingleton uniqueInstance;

    private nameSingleton(int index) {
        this.index = index;
    }

    public static nameSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (lockObject) {
                if (uniqueInstance == null) {
                    Random random = new Random();
                    uniqueInstance = new nameSingleton(random.nextInt(3) + 1); // Changed to nextInt(3) + 1
                }
            }
        }
        return uniqueInstance;
    }

    public void ChiensaysHi() {
        System.out.println("Quynh Quynh  " + index);
    }
}

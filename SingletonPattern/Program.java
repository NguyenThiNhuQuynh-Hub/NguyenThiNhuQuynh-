public class Program {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> nameSingleton.getInstance().QuynhQuynhsaysHi());
        Thread thread2 = new Thread(() -> nameSingleton.getInstance().QuynhQuynhsaysHi() );

        thread1.start();
        thread2.start();
    }
}
